package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest{
	public static void main(String[] args) {
//		<?>: ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ֱ� ������ Object�� �ƴ�
//		���׸����� �Ѵ�.
		
//		capacity(�뷮): �̸� Ȯ���� ���� ����, ���� �޸��� �Ѱ踦 Ȯ���� �� �ִ�.
//		�뷮�� ������ �ִ� ���� �ƴϴ�.
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(40);
//		System.out.println(datas.size());
		datas.add(50);
//		System.out.println(datas.size());
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(20);
		datas.add(30);
		datas.add(100);
		
//		System.out.println(datas.size());
//		System.out.println(datas);

		
//		����
//		Collections.sort(datas);	
//		System.out.println(datas);
//		
//		Collections.reverse(datas);
//		System.out.println(datas);
//		
		Collections.shuffle(datas);		//���� ���´�
//		System.out.println(datas);
		
		
//		�߰�(����) 60�� �׻� 30�ڿ� ���Եȴ�.
		System.out.println("�߰�(����) 60�� �׻� 30�ڿ� ���Եȴ�.");
		if(datas.contains(30)) {	//30�� �ִٸ�
			datas.add(datas.indexOf(30)+1,60);	//30�� ����ִ� �ε���+1�� 60�� �߰��Ѵ�
			System.out.println(datas);
		}
		
		
		
//		���� 10�� 1�� ����
		if(datas.contains(10)) {	//10�� �ִٸ�
			System.out.println(datas.set(datas.indexOf(10), 1)+"�� 1�� ����");	//10�� ����ִ� �ε�����ȣ�� ã�� �װ��� ���� 1�� �����Ѵ�
			System.out.println(datas);
		}
		
		
		
//		����(������ ����) 20�� �����Ѵ�.
		System.out.println("����(������ ����) 20�� �����Ѵ�.");
		if(datas.remove(Integer.valueOf(20))) {	//20�� �ִٸ� �����Ѵ�
			System.out.println("��������");
			System.out.println(datas);
		}
		
		
		
//		����(�ε����� ����) 50�� �����Ѵ�.
		System.out.println("����(�ε����� ����) 50�� �����Ѵ�.");
		if(datas.contains(50)) {	//50�� �ִٸ�
			System.out.println(datas.remove(datas.indexOf(50))+"����");	//50�� ���� ����ִ� �ε��� ��ȣ�� ã�� �����Ѵ�.
			System.out.println(datas);
		}
		
		
		
		
	}
}
