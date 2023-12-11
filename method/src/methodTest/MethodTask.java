package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {
	
//	1~10까지 println()으로 출력하는 메소드
	void showten() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	
//	"홍길동"을 n번 println()으로 출력하는 메소드
	void showName(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("홍길동");
		}
	}
	
//  이름을 n번 println()으로 출력하는 메소드
	void showName(int num, String name) {
		for (int i = 0; i < num; i++) {
			System.out.println(name);
		}
	}
//  세 정수를 뺄셈해주는 메소드
	int sub(int num1, int num2, int num3) {
		int total = 0;
		total = num1 - num2 - num3;
		return total;
	}
//  두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
	int[] division(int num1, int num2) {
		int[] results = null;
		
		if(num2 !=0) {
			results = new int[2];
			results[0] = num1/num2;
			results[1] = num1%num2;
		}
		
		return results;
	}
//  1~n까지의 합을 구해주는 메소드
	int nSum(int num) {
		int sum =0;
		for (int i = 0; i < num; i++) {
			sum += i+1;
		}
		return sum;
	}
//  홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int changeOAD(int num) {
		int oad = 0;
		oad = num+1;
		return oad;
	}
//  문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeSize(String sentence) {
		String chgSentence = "";
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)>='a'&&sentence.charAt(i)<='z') {
				chgSentence +=(char)(sentence.charAt(i)-32);
			}
			else if(sentence.charAt(i)>='A'&&sentence.charAt(i)<='Z') {
				chgSentence +=(char)(sentence.charAt(i)+32);
			}
			else {
				chgSentence = "잘못 입력하셨습니다";
				break;
			}
		}
		return chgSentence;
	}
//  문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int findWord(String sentence,char word) {
		int num=0;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)==word) {
				num++;
			}
		}
		return num;
	}
	
//  5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int findNum(int num1, int num2, int num3,int num4,int num5, int find) {
		int num = 0;
		int[] arnum = {num1, num2, num3, num4, num5}; 
		if(find>arnum.length && find<0) {
			return 0;
		}
		else {
			num = arnum[find];
			return num;
		}
		
	}
//  한글을 정수로 바꿔주는 메소드
	int changeKor(String sentence) {
		String hangleOriginal ="공일이삼사오육칠팔구";
		String result = "";
		
		for(int i=0; i<sentence.length(); i++) {
			result += hangleOriginal.indexOf(sentence.charAt(i));
		}
		
		return Integer.parseInt(result);
	}

//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] findBAS(int num1, int num2, int num3,int num4,int num5) {
		int num = 0;
		int[] arnum = {num1, num2, num3, num4, num5};
		int[] bas = {num1, num1};
		for (int i = 1; i < arnum.length; i++) {
			if(bas[0]<arnum[i]) {
				bas[0] = arnum[i];
			}
			if(bas[1]<arnum[i]) {
				bas[1] = arnum[i];
			}
		}
		return bas;
	}
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
   void getMaxAndMin(int[] arData, int[] results) {
	      results[0] = arData[0];
	      results[1] = arData[0];
	      
	      for (int i = 1; i < arData.length; i++) {
	         if(results[0] < arData[i]) { results[0] = arData[i]; }
	         if(results[1] > arData[i]) { results[1] = arData[i]; }
	      }
	   }

//  indexOf() 만들기
	int indexOF(String sentence, char find) {
		int num = 0;
		num = -1;
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)==find) {
				num = i;
			}
		}
		return num;
	}

	
	public static void main(String[] args) {
	}
}
