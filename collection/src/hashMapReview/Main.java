package hashMapReview;

import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {
		//멤버 만들기
		Member member1 = new Member(1001,"홍길동");
		Member member2 = new Member(1002,"이순신");
		Member member3 = new Member(1003,"김유신");
		Member member4 = new Member(1004,"강감찬");
		
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//추가함수 사용
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);

		
		//삭제 
		memberHashMap.removeMember(1003);
		
		System.out.println(memberHashMap);
		
		//============================================================
		//JSON 변환 연습
		
		JSONObject userJSON = new JSONObject(memberHashMap.getHashMap());
		System.out.println(userJSON);
		
	}
}
