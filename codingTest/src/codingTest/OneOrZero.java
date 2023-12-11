package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class OneOrZero {
	public int solution(String s) {
		//강사님 방법
		int result = 0;
		
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
		
//		List<Integer> lengths= datas.stream().map(String::length).collect(Collectors.toList())
//				.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		List<Integer> lengths= datas.stream().map(String::length)
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		result = lengths.size() == 0 ? 0 : lengths.get(0);
		
		return result;
		
		//내코드
//		int result = 0;
//		int tmp = 0;
//		for (int i = 0; i < s.length()-1; i++) {
//			if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)-'0'==1) {
//				if(tmp==0) {
//					tmp +=2;
//				}else {
//					tmp++;
//				}
//			}else {
//				tmp=0;
//			}
//			if(tmp>result) {
//				result = tmp;
//			}
//		}
//		return result;
	}
	
	public static void main(String[] args) {
		int result = new OneOrZero().solution("110111001111");
		System.out.println(result);
	}
}