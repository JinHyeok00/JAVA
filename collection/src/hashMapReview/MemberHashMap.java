package hashMapReview;

import java.util.HashMap;

public class MemberHashMap {
	//키값은 id value값은 Member
	private HashMap<Integer, Member> hashMap;	
	
	//생성자
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	
	
	
	public HashMap<Integer, Member> getHashMap() {
		return hashMap;
	}




	public void setHashMap(HashMap<Integer, Member> hashMap) {
		this.hashMap = hashMap;
	}




	//사용자 추가
	public void addMember(Member member) {
		hashMap.put(member.getId(), member);
	}
	
	//아이디로 사용자 삭제
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {		//만약 해쉬맵에 입력한 아이디가 있다면
			hashMap.remove(memberId);			//애쉬맵에서 삭제
		}
		else {
			//해당되는 아이디가 없을때
			System.out.println("no element");	//없다고 출력
		}
	}
	


	@Override
	public String toString() {
		return "MemberHashMap [hashMap=" + hashMap + "]";
	}
	
	
	
	
	//모든 정보를 출력
//	public void printAll() {
//		
//		Iterator<Integer> ir = hashMap.keySet().iterator();
//		
//		while(ir.hasNext()) {
//			
//			int key = ir.next();
//			Member member = hashMap.get(key);
//			
//			System.out.println(member);
//			
//		}
//	}
	
}
