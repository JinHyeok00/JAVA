package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTask {
	static boolean checkEven(int num) {
		return num %2 ==0;
	}
	
	static boolean checkOdd(int num) {
		return num % 2 !=0;
	}
	static boolean checkCapital(String data) {
		return data.charAt(0) >=65 && data.charAt(0) <=90;
	}
	
	public static int changetoInteger(int num) {
		return num-48;
	}

	
	public static void main(String[] args) {
//      10~1까지 ArrayList에 담고 출력
//		List<Integer> list = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(data ->10-data).forEach(list::add);
//		System.out.println(list);
		
		
//      1~10까지 ArrayList에 담고 출력
//		List<Integer> list = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(list::add);
//		System.out.println(list);
		
		
		
//      ABCDEF를 각 문자별로 출력
//		String data = "ABCDEF";
//		data.chars().forEach(c -> System.out.println((char)c));
		
		
		
		
//      1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		IntStream.range(1, 100).filter(StreamTask::checkOdd).forEach(list::add);
//		System.out.println(list);
		
		
		
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> list = new ArrayList<Character>();
//		IntStream.range('A', 'F').map(data -> data > 67 ? data+1: data).forEach(data -> list.add((char)data));
//		System.out.println(list);
		
		
		
//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase() 사용
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		list.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
		
//      1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		IntStream.range(1, 100).filter(StreamTask::checkEven).forEach(list::add);
//		System.out.println(list);
		
		
		
		
		
//      Apple, banana, Melon 중 첫 번째 문자가 대문자인 문자열 출력
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		list.stream().filter(StreamTask::checkCapital).forEach(System.out::println);
		
		
		
		
		
		
//      한글을 정수로 변경
//		String hangle = "공일이삼사오륙칠팔구";
//		String input = "일공이사";
//		input.chars().map(hangle::indexOf).forEach(System.out::print);
		
		
		
		
		
//      정수를 한글로 변경
		String hangle = "공일이삼사오륙칠팔구";
		String input = "1024";
		input.chars().map(StreamTask::changetoInteger).forEach(i -> System.out.print(hangle.charAt(i)));
	}
	

	

}
