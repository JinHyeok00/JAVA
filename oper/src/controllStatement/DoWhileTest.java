package controllStatement;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "1.통신 요금\n2.분실 신고\n 3.통신사 이동\n0.상담사 연결";
		int choice = 0;
		
		do {
				System.out.println(message);
				choice = sc.nextInt();
		}while(choice !=0);
	}
}
