package controllStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		// 두 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		int num1 =0, num2 =0;
		String msg = "두 정수를 입력하세요", result =null;
		
		System.out.println(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "큰 값" + num1;
		}else if(num1 != num2) {
			result = "큰 값" + num2;
		}else {
			result = "두 수가 같습니다";
		}
		System.out.println(result);
	}
}
