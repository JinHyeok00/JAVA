package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력 받기
//		-무한 입력 상태로 구현
//		-q 입력시 나가기
//		-각 정수는 배열에 담기
//		-if문은 딱한번만 사용하기
//		int[] arNum = new int[5];
//		int count =0;
//		String tmp = null;
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			try {
//				tmp = sc.nextLine();
//				arNum[count] = Integer.parseInt(tmp);
//				System.out.println(arNum[count]);
//				count++;
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("5번이상 입력했습니다");
//				tmp = sc.nextLine();
//				System.out.println(tmp);
//			}catch(NumberFormatException e) {
//				if(tmp.equals("q")) {
//					System.out.println("종료");
//					break;
//				}
//				System.out.println("가지가지 하네");
//			}
//		}
		
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		String temp = null;
		
		for(int i=0;;) {
			System.out.println(i+1+"번째 정수[q: 나가기]");
			temp = sc.nextLine();
			if(temp.toLowerCase().equals("q")) {break;}
			try {
				arData[i] = Integer.parseInt(temp);
				i++;
			} catch(NumberFormatException e) {
				System.out.println("정수만 입력하세요");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개의 정수만 입력 가능");
				
				for (int j = 0; j < arData.length; j++) {
					System.out.print(arData[j]+" ");
				}
				
				break;
			} catch (Exception e) {
				System.out.println("다시 시도해주세요");
			}
			
		}
	}
}
