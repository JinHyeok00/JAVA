package calcStep2;

public class Main {
	static Calc operate(String oper) {
		if(oper.equals("+")) {
			return (a,b)->a+b;
		}
		return (a,b)->a-b;
	}
	
	
	public static void main(String[] args) {
		//함수형 인터페이스
		//추사형 메소드가 하나밖에 없어서 메소드처럼 쓸수 있는 인터페이스
		//람다식을 쓸수있다
		//람다식은 추상형 메소드를 정해주는거란 말이에요
		
		//num1 num2, 이두개를 더할지 뺼지를 정해줘야되는거 아니에요
//		
		
		System.out.println(Main.operate("+").calc(10, 5));
		
		
//		Calc p = (a,b) -> a+b;
//		System.out.println(p.calc(15, 10));
	}
}
