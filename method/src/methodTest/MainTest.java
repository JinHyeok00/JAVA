package methodTest;

import java.util.Iterator;

public class MainTest {
// 실행 프로그램을 만들어 주는 메소드
	public static void main(String[] args) {
		if(args.length !=0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
		else {
			System.out.println("NONE");
		}
		
		
		String sentence = "일";
		MethodTask methodTask = new MethodTask();
		System.out.println(methodTask.changeKor(sentence));
	}
}
