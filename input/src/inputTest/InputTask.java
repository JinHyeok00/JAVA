package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 곱셈 결과 출력
//		단, next()만 사용한다
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, result = 0;

		String msg = "두정수를 입력하세요", example = "예)1 3";
		System.out.println(msg);
		System.out.println(example);
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		
		result = num1 * num2;
		System.out.println(result);
	}
}
