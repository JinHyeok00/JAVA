package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;
    
    boolean flag = false;
    private Thread offDelayThread; // ���� ���� ���� ������
    private Thread previousThread; // �������� ���� ������
    
//    TimerDeskLamp Ŭ������ ������ �ڵ带 ������ �ּ���.
    public /*synchronized*/ void offDelayThread() {
    	if(previousThread != null) {
    		previousThread.interrupt();
    	}
    	offDelayThread = new Thread(this);
    	offDelayThread.start();
    	previousThread = offDelayThread;
    	
    	
    	
    	
    	//���ڵ�
//    	if(!super.getPower()) {
//    		return;
//    	}
//    	
//    	offDelayThread = new Thread(()->{
//    		System.out.println("������ 5���� �����ϴ�");
//    		try {
//    			Thread.sleep(DELAY_MILLISECOND);
//    			if(!getPower()) {
//    				System.out.println("�̹� �����ֽ��ϴ�");
//    				return;
//    			}
//    			turnOff();
//    			flag = false;
//
//			} catch (InterruptedException e) {
//	    		System.out.println("Timer Reset");
//			}
//    	});
//    	
//    	if(flag) {
//    		offDelayThread.interrupt();
//    	}
//    	flag =true;
//    	offDelayThread.start();
    }
    
    
    @Override
    public void run() {
    	while(true) {
    		try {
				Thread.sleep(DELAY_MILLISECOND);
				turnOff();
				previousThread = null;
				break;
			} catch (InterruptedException e) {
				System.out.println("Ÿ�̸� ����");
				break;
			}
    	}
    }
}
