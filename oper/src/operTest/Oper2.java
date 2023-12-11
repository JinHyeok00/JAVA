package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		// 두 정수 입력 받기
		Scanner sc = new Scanner(System.in);
		
		int num1 =0, num2 =0;
		String msg = "두 정수를 입력하세요", bigNum = null;;
		
		System.out.println(msg);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		bigNum = num1 > num2 ? "큰 값: " +num1 
				: num1 == num2 ? "두수는 같습니다" :"큰 값: " + num2;
		
		System.out.println(bigNum);
	}
	
}
