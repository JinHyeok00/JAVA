package hashMapReview;

import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {
		//��� �����
		Member member1 = new Member(1001,"ȫ�浿");
		Member member2 = new Member(1002,"�̼���");
		Member member3 = new Member(1003,"������");
		Member member4 = new Member(1004,"������");
		
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//�߰��Լ� ���
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);

		
		//���� 
		memberHashMap.removeMember(1003);
		
		System.out.println(memberHashMap);
		
		//============================================================
		//JSON ��ȯ ����
		
		JSONObject userJSON = new JSONObject(memberHashMap.getHashMap());
		System.out.println(userJSON);
		
	}
}
