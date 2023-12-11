package lambdaTask1;

import java.util.Scanner;

public class MyMath {	
	//강사님 방법
	   public static Calc operate(String oper) {
	      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
	   }
	   
	   public static void main(String[] args) {
	      OperCheck operCheck = e -> {					//연산자만 모인 String타입의 배열을 return받는 함수 선언
	         String result = "";						//빈문자열 하나 선언
	         for (int i = 0; i < e.length(); i++) {		//받은 String타입의 e의 길이만큼 반복을 돌려요
	            char c = e.charAt(i);					//char타입의 c에다가 i번째를 넣어 준다.
	            if(c == '-' || c == '+') {				//c가 -이거나 +면
	               result += c;							//result에 더해준다
	            }
	         }											//ex) e = " 3+5-7"이라면 
	         											//	result="+-"
	         return result.split("");					// result를 split으로 쪼개서 배열에 담아준다.
	      };
	   
	      String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";	//띄워줄 메세지를 선언
	      String exampleMessage = "예)9+7-5";					//예시
	      String expression = null;								//입력받을 식
	      Scanner sc = new Scanner(System.in);
	      String[] opers = null, numbers = null;				
	      int number1 = 0, number2 = 0;
	      
	      System.out.println(message);
	      System.out.println(exampleMessage);
	      expression = sc.nextLine();							//식을 입력받음
	      
	      opers = operCheck.getOpers(expression);				//opers에 입력받은 식의 부호만 모아놨어요
	      numbers = expression.split("\\+|\\-");				//numbers에다가 입력받은 식의 숫자만 모아서 담아 놓음
	      number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
	      //예시1) -1+3-5+7
	      //	number1 = -1
	      //예시2) 1+3-5+7
	      //	number1 = 1
	      
	      //예시1			0		1		2		3		4		
	      //numbers		""		"1"		"3"		"5"		"7"
	      //opers		-		+		-		+
	      for (int i = 0; i < opers.length; i++) {							//opers의 길이만큼 for문 반복
	         if(i == 0 && number1 < 0) {continue;}							//	i	0번째 		1번째			2번째			3번째
	         number2 = Integer.parseInt(numbers[i+1]);						//					3			5			7
	         number1 = MyMath.operate(opers[i]).calc(number1, number2);		//					2			-3			4
	      }
	      System.out.println(number1);			//4
	   }

	
	
	   
	//내방법
//	static Calc sumAndSub(String input) {
//		
//		if("+".equals(input)) {			//+계산
//			return (a,b) -> a+b;
//		}
//		//-계산
//		return (a,b) -> a-b;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		
//		int total = 0;						//결과값
//		int count = 0;						//카운팅이 필요해서
//		String equation = null;				//입력받을수식
//		
//		String[] tmp = null;				//임시저장소
//		String[] arWhole = null;			//수식전체 배열	
//		String[] arNumPart = null;			//숫자부분 배열
//		String[] arSignPart = null;			//기호부분 배열
//		System.out.println("식을 입력하세요");	
//		equation = sc.nextLine();			//수식을 입력받는다
//		if(equation.charAt(0) != '-') {		//시작이 -가 아니라면
//			equation = "+"+equation;		//첫번째 정수가 음수일 경우 오류 해결
//		}
//		
//		OperCheck operCheck = (e) ->{		
//			return e.split("");				//한글자 한글자 모두 쪼개기
//		};
//		arWhole = operCheck.getOpers(equation);		//수식전체 배열에 담아주기
//		
//		OperCheck operCheckRemake = (e) ->{
//			return e.split("\\+|\\-");		//숫자만 배열에 담고
//		};
//		
//		tmp = operCheckRemake.getOpers(equation);
//		arNumPart= new String[tmp.length-1];			
//		for (int i = 0; i < arNumPart.length; i++) {
//			arNumPart[i]=tmp[i+1];
//		}
//		// 모든 수식은 +,-로시작하여 0번째칸에 아무것도 안담기는 문제를 해결하기 위해 위 방법을 해결
//		
//		arSignPart = new String[arNumPart.length];	//숫자와 부호의 개수는 같다
//		
//		// 전체 배열에 담긴 부호를 부호배열에 옮긴다
//		for (int i = 0; i < arWhole.length; i++) {				 
//			if("+".equals(arWhole[i])||"-".equals(arWhole[i])) {	 //부호라면~
//				arSignPart[count] = arWhole[i];		//부호배열에 담는다
//				count++;							//하나 담기면 count를 올려준다
//			}
//		}
//		
//		//계산부분
//		//시작은 부호고
//		//두개씩 계산하기 때문에
//		//total = total+ arNumPart[i]로 해서 배열의 길이만큼 해준다
//		for (int i = 0; i < arSignPart.length; i++) {
//			total = MyMath.sumAndSub(arSignPart[i]).calc(total, Integer.parseInt(arNumPart[i]));
//		}
//		System.out.println("결과: " + total);
//
//	}
	

}
