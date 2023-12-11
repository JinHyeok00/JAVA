package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
//		3개의 정수를 한번에 입력받은 후 덧셈 출력
//		nextInt() : 입력받은 정수
		Scanner sc = new Scanner(System.in);
		
		int num1 =0 , num2 = 0, num3 =0, sum= 0;
		String msg = "3개의 정수를 입력하세요", ex = "ex) 3 4 6", formet = "%d + %d + %d = %d입니다";
		
		System.out.println(msg);
		System.out.println(ex);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		
		System.out.printf(formet, num1, num2, num3, sum);
	}
}
