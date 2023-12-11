package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		
//      브론즈
//      1~10까지 배열에 담고 출력
//		int[] ar = new int[10];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i]=i+1;
//			System.out.print(ar[i]+" ");
//		}
		
		
		
		
//      10~1까지 중 짝수만 배열에 담고 출력
//		int[] ar = new int[5];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i]= 10 - i*2;
//			System.out.print(ar[i]+" ");
//		}
		

		
		
//      1~100까지 배열에 담은 후 홀수만 출력
//		int[] ar = new int[100];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i]=i+1;
//			System.out.print(ar[i]%2==1 ? ar[i] :" ");
//		}
		
		
		
		
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int total = 0;
//		int[] ar = new int[100];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = i + 1;
//			if(ar[i]%2==0) {
//				total +=ar[i];
//			}
//		}
//		System.out.println("짝수의 합: " +total);
		
		
		
		
		
//      A~F까지 배열에 담고 출력
//		char[] ar = new char[6];
//		for (char i = 'A'; i < 'G'; i++) { 
//			ar[i-65] = i;
//			System.out.print(ar[i-65]);
//		}
		

		
		
		
//      A~F까지 중 C제외하고 배열에 담은 후 출력
//		char[] ar = new char[5];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = i>1 ? (char)(i+66) : (char)(i+65); 
//			System.out.print(ar[i]+ " ");
//		}		
		
		
		
		
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		int bigNum = 0, smallNum = 0;
//		int[] ar = new int[5];
//		String message = "5개의 정수를 입력하세요";
//		
//		System.out.println(message);	
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = sc.nextInt();
//			if(i==0) {
//				bigNum = ar[i];
//				smallNum = ar[i];
//			}
//		}
//			
//		for (int i = 1; i < ar.length; i++) {
//			bigNum = bigNum < ar[i] ? ar[i] : bigNum;
//			smallNum = smallNum > ar[i] ? ar[i] : smallNum;		
//		}
//
//		System.out.println("최대값: "+bigNum);
//		System.out.println("최솟값: "+smallNum);
		
		

		
		
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int[] ar = null;
		Scanner sc = new Scanner(System.in);	// 입력 클래스 인스턴스 생성
		int num = 0, sum = 0; 					// 정수형 변수 선언		
		double avg = 0.0;						// 실수형 변수 선언
		System.out.println("몇개의 정수를 입력하실건가요?");
		num = sc.nextInt();						// num의 사용자가 입력한 값 대입
		ar = new int[num];						
		for (int i = 0; i < ar.length; i++) {	// ar의 길이만큼 반복하는 for문
			System.out.println("정수를 입력하세요");
			ar[i] = sc.nextInt();				// ar[i]에 값 대입
			sum += ar[i];						// 누적 연산자를 사용하여 합을 계산
		}
		avg = Double.parseDouble(String.format("%.2f",(double)sum/ar.length));
		System.out.println("평균 : "+avg);		// 평균 출력
			
	}
}
