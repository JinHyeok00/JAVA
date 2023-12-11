package hashMapReview;

import java.util.HashMap;

public class MemberHashMap {
	//Ű���� id value���� Member
	private HashMap<Integer, Member> hashMap;	
	
	//������
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	
	
	
	public HashMap<Integer, Member> getHashMap() {
		return hashMap;
	}




	public void setHashMap(HashMap<Integer, Member> hashMap) {
		this.hashMap = hashMap;
	}




	//����� �߰�
	public void addMember(Member member) {
		hashMap.put(member.getId(), member);
	}
	
	//���̵�� ����� ����
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {		//���� �ؽ��ʿ� �Է��� ���̵� �ִٸ�
			hashMap.remove(memberId);			//�ֽ��ʿ��� ����
		}
		else {
			//�ش�Ǵ� ���̵� ������
			System.out.println("no element");	//���ٰ� ���
		}
	}
	


	@Override
	public String toString() {
		return "MemberHashMap [hashMap=" + hashMap + "]";
	}
	
	
	
	
	//��� ������ ���
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
