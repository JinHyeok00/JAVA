package codingTest;

public class Locker {
	public int solution(String p, String s) {
		//강사님 방법
		int answer = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int number = p.charAt(i), target = s.charAt(i);
//			target - number 결과가 음수라면 결과에 10을 더해주고, 양수라면 10을 빼준다.
			int result = target-number <0 ? 10+target - number : 10 - (target - number);
//			결과의 절대값이 5보다 크면 위의 결과 그대로 결정하고, 5보다 작으면 10을 빼지 않고 뺀 값의 절대값으로 결정한다.
			answer += Math.abs(target -number) > 5 ? result : Math.abs(target-number); 
		}
		
		return answer;
		
		
		//내코드
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