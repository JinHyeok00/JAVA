package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;
    
    boolean flag = false;
    private Thread offDelayThread; // 전원 끄기 예약 쓰레드
    private Thread previousThread; // 실행중인 예약 쓰레드
    
//    TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.
    public /*synchronized*/ void offDelayThread() {
    	if(previousThread != null) {
    		previousThread.interrupt();
    	}
    	offDelayThread = new Thread(this);
    	offDelayThread.start();
    	previousThread = offDelayThread;
    	
    	
    	
    	
    	//내코드
//    	if(!super.getPower()) {
//    		return;
//    	}
//    	
//    	offDelayThread = new Thread(()->{
//    		System.out.println("전원이 5초후 꺼집니다");
//    		try {
//    			Thread.sleep(DELAY_MILLISECOND);
//    			if(!getPower()) {
//    				System.out.println("이미 꺼져있습니다");
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
				System.out.println("타이머 리셋");
				break;
			}
    	}
    }
}
