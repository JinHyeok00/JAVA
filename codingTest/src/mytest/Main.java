package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
//		//split("")�� ���� �˾ƺ���
//		String s = "110111";						//StringŸ�� ���� s ����
//		String[] sSplit =s.split("0");				//StringŸ���� �迭 sSplit�� �����ϰ� 0�� ���������� s�� �ɰ��� sSplit�� �־��ش�
//		for (int i = 0; i < sSplit.length; i++) {	//sSplit�� ���� ��ŭ �ݺ��Ұž�
//			System.out.println(sSplit[i]);			//�ܼ�â�� ����Ҳ���
//		}
//		//? 0���� ���� ����ֳ�?							//sSplit[0]==null -> false�ε�
//		System.out.println(sSplit[0]=="");			//sSplit[0]==""	  -> true

//		//null==""�� false�ΰ�?
//		String s = "";
//		String t = null;
//		System.out.println(s==t);					//�ٸ���..

		// �׷��� s�� ���࿡ ���������θ� �̷���� �����̸� ��� �ɱ�?
//		String s = "00000";
//		String[] sSplit =s.split("0");				//���Ͱ��� �Ȱ��� �ɰ�����
//		System.out.println(sSplit.length);			//���̰� 0�̶�� ������
//		try {
//			System.out.println(sSplit[0]=="");	//������ ������
//		} catch (ArrayIndexOutOfBoundsException e) {	//�迭�� 0��° ���� ������ ����
//			System.out.println("�迭�ȿ� �ƹ��͵� ����!");
//		}

		// Arrays.asList
//		String[] ar = {"a","b","c"};
//		ArrayList<String> list = new ArrayList<String>(Arrays.asList(ar));		//���� ��ü�� �������� ��
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));		//list�� ���� ������ ����
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
//		List<String> list = Arrays.asList(ar);		//Arrays.asList�� �״�� list�� ������
//		ar[0] = "d";								//ar�� ���� ����������
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));		//list�� ���� ���Ѵ�.
//		}
//		//->Arrays.asList�� �ּҰ��� ��ȯ������ 

		// Stream.filter:()�ȿ� ���� ���ǿ��� ���� ���� ���͸� ���ش�
//		List<String> list =new ArrayList<String>(Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3"));
//		list.stream().filter(s -> s.startsWith("c")).forEach(System.out::println);		//startsWith: ���۰��� "c"�� �����ϴ� ���� ã����	

		// �� ������ �̷������ε� Ǯ �� �־�!
//		List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
//		Stream<String> stream = list.stream();
//		Stream<String> filtered = stream.filter(s -> s.startsWith("c"));
//		filtered.forEach(System.out::println);

		// Stream.map(): Stream�� ��Ҹ� �ٸ� ���·� �����Ѵ�.
//		List<String> list =
//		        Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
//		Stream<String> stream = list.stream();
//		stream.map(s -> s.toUpperCase()).forEach(System.out::println);		//toUpperCase: �빮�ڷ� ����

		// collect: ����� �پ��� Ÿ������ �������ش�.
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
