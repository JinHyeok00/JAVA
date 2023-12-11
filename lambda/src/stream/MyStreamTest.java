package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreamTest {
	public static void main(String[] args) {
//		Arrays.aslist()
//		toArray()[Index];
//		Integer[] arData = {10,20,30,40,50};
//		List<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//		System.out.println(datas);
//		arData = (Integer[])datas.toArray();	//Arrays.aslist()의 리턴값은 Object[]타입이다
		
//		range
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
//		Object[] arData = null;
//		arData = datas.toArray();
		
//		chars()
//		String data = "ABCDEF";
//		data.chars().forEach(System.out::println);
//		data.chars().forEach(c ->System.out.println((char)c));
		
//		sorted(), sort()
//		List<Integer> datas = new ArrayList<Integer>(Arrays.asList(30,20,90,40,80));
//		datas.sort(Collections.reverseOrder());
//		System.out.println(datas);
		
		
//		collect()
		List<Integer> datas = new ArrayList<Integer>(Arrays.asList(30,20,90,40,80));
		System.out.println(datas);
		List<Integer> results = new ArrayList<Integer>();
		results = datas.stream().sorted().collect(Collectors.toList());
		System.out.println(results);
		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(",")));
		Stream<Object> a = datas.stream().map(String::valueOf);
		
	}
}
