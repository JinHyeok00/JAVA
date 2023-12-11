package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
//		//split("")의 대해 알아보자
//		String s = "110111";						//String타입 변수 s 선언
//		String[] sSplit =s.split("0");				//String타입의 배열 sSplit을 선언하고 0을 기준점으로 s를 쪼개서 sSplit을 넣어준다
//		for (int i = 0; i < sSplit.length; i++) {	//sSplit의 길이 만큼 반복할거야
//			System.out.println(sSplit[i]);			//콘솔창에 출력할꺼야
//		}
//		//? 0번쨰 방은 비어있나?							//sSplit[0]==null -> false인뎅
//		System.out.println(sSplit[0]=="");			//sSplit[0]==""	  -> true

//		//null==""은 false인가?
//		String s = "";
//		String t = null;
//		System.out.println(s==t);					//다르넹..

		// 그런데 s가 만약에 기준점으로만 이루어진 문장이면 어떻게 될까?
//		String s = "00000";
//		String[] sSplit =s.split("0");				//위와같이 똑같이 쪼개보자
//		System.out.println(sSplit.length);			//길이가 0이라고 나오네
//		try {
//			System.out.println(sSplit[0]=="");	//오류가 날문장
//		} catch (ArrayIndexOutOfBoundsException e) {	//배열에 0번째 방이 없을떄 오류
//			System.out.println("배열안에 아무것도 없어!");
//		}

		// Arrays.asList
//		String[] ar = {"a","b","c"};
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList(ar));		//새로 객체를 설정해줄 때
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));		//list의 값은 변함이 없다
//		}

//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("a");
//		arr.add("b");
//		arr.add("c");
//		ArrayList<String> list = new ArrayList<String>(arr);	
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

//		String[] ar = {"a","b","c"};
//		List<String> list = Arrays.asList(ar);		//Arrays.asList를 그대로 list에 넣으면
//		ar[0] = "d";								//ar의 값을 변경했을때
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));		//list의 값은 변한다.
//		}
//		//->Arrays.asList는 주소값을 반환함으로 

		// Stream.filter:()안에 들어가는 조건에서 참인 값만 필터링 해준다
//		List<String> list =new ArrayList<String>(Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3"));
//		list.stream().filter(s -> s.startsWith("c")).forEach(System.out::println);		//startsWith: 시작값이 "c"로 시작하는 값을 찾아줌	

		// 위 문제를 이런식으로도 풀 수 있어!
//		List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
//		Stream<String> stream = list.stream();
//		Stream<String> filtered = stream.filter(s -> s.startsWith("c"));
//		filtered.forEach(System.out::println);

		// Stream.map(): Stream의 요소를 다른 형태로 변경한다.
//		List<String> list =
//		        Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
//		Stream<String> stream = list.stream();
//		stream.map(s -> s.toUpperCase()).forEach(System.out::println);		//toUpperCase: 대문자로 변경

		// collect: 결과를 다양한 타입으로 리턴해준다.
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,30,15));
//		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(":")));
//		int result =0;
//		
//		String s = "010110111";
//		
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
//		
//		
//		System.out.println("========================================================================");
//		List<Integer> lengths2 =datas.stream().map(String::length).collect(Collectors.toList());
//		for (int i = 0; i < lengths2.size(); i++) {
//			System.out.println(lengths2.get(i));
//		}
//		
//		
//		List<Integer> lengths= datas.stream().map(String::length)
//				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println("==========================================");
//		
//		for (int i = 0; i < lengths.size(); i++) {
//			System.out.println(lengths.get(i));
//		}


	}

}
