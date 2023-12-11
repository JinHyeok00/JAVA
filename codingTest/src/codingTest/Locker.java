package codingTest;

public class Locker {
	public int solution(String p, String s) {
		//����� ���
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int number = p.charAt(i), target = s.charAt(i);
//			target - number ����� ������� ����� 10�� �����ְ�, ������ 10�� ���ش�.
			int result = target-number <0 ? 10+target - number : 10 - (target - number);
//			����� ���밪�� 5���� ũ�� ���� ��� �״�� �����ϰ�, 5���� ������ 10�� ���� �ʰ� �� ���� ���밪���� �����Ѵ�.
			answer += Math.abs(target -number) > 5 ? result : Math.abs(target-number); 
		}
		
		return answer;
		
		
		//���ڵ�
//		int answer = 0;
//		for (int i = 0; i < p.length(); i++) {
//			if(p.charAt(i)>s.charAt(i)) {
//				if(p.charAt(i)-s.charAt(i)>10+s.charAt(i)-p.charAt(i)) {
//					answer +=10+s.charAt(i)-p.charAt(i);
//				}else {
//					answer +=p.charAt(i)-s.charAt(i);
//				}
//				
//			}else {
//				if(s.charAt(i)-p.charAt(i)>10+p.charAt(i)-s.charAt(i)) {
//					answer +=10+p.charAt(i)-s.charAt(i);
//				}else {
//					answer +=s.charAt(i)-p.charAt(i);
//				}
//			}
//		}
//		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(new Locker().solution("82195", "64723"));
	}
}