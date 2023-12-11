package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest{
	public static void main(String[] args) {
//		<?>: 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌
//		제네릭으로 한다.
		
//		capacity(용량): 미리 확보해 놓을 공간, 나의 메모리의 한계를 확인할 수 있다.
//		용량에 제한을 주는 것이 아니다.
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(40);
//		System.out.println(datas.size());
		datas.add(50);
//		System.out.println(datas.size());
		datas.add(90);
		datas.add(70);
		datas.add(10);
		datas.add(80);
		datas.add(20);
		datas.add(30);
		datas.add(100);
		
//		System.out.println(datas.size());
//		System.out.println(datas);

		
//		정렬
//		Collections.sort(datas);	
//		System.out.println(datas);
//		
//		Collections.reverse(datas);
//		System.out.println(datas);
//		
		Collections.shuffle(datas);		//값을 섞는다
//		System.out.println(datas);
		
		
//		추가(삽입) 60은 항상 30뒤에 삽입된다.
		System.out.println("추가(삽입) 60은 항상 30뒤에 삽입된다.");
		if(datas.contains(30)) {	//30이 있다면
			datas.add(datas.indexOf(30)+1,60);	//30이 들어있는 인덱스+1에 60을 추가한다
			System.out.println(datas);
		}
		
		
		
//		수정 10을 1로 수정
		if(datas.contains(10)) {	//10이 있다면
			System.out.println(datas.set(datas.indexOf(10), 1)+"이 1로 수정");	//10이 들어있는 인덱스번호를 찾아 그곳에 값을 1로 변경한다
			System.out.println(datas);
		}
		
		
		
//		삭제(값으로 삭제) 20을 삭제한다.
		System.out.println("삭제(값으로 삭제) 20을 삭제한다.");
		if(datas.remove(Integer.valueOf(20))) {	//20이 있다면 삭제한다
			System.out.println("삭제성공");
			System.out.println(datas);
		}
		
		
		
//		삭제(인덱스로 삭제) 50을 삭제한다.
		System.out.println("삭제(인덱스로 삭제) 50을 삭제한다.");
		if(datas.contains(50)) {	//50이 있다면
			System.out.println(datas.remove(datas.indexOf(50))+"삭제");	//50의 값이 들어있는 인덱스 번호를 찾아 삭제한다.
			System.out.println(datas);
		}
		
		
		
		
	}
}
