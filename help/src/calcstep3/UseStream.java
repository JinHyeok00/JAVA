package calcstep3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class UseStream {
	
	
	static Calc sumAndSub(String input) {
		
		if("+".equals(input)) {			//+계산
			return (a,b) -> a+b;
		}
		//-계산
		return (a,b) -> a-b;
	}
	
	static int checkNull(String s) {
		if(s.equals("")) {
			return 0;
		}
		else {
			return Integer.parseInt(s);
		}
	}
	
	public static void main(String[] args) {
		String equation = "-3+5-7+10";
		int result = 0;
		
		ArrayList<Integer> number = new ArrayList<Integer>(
				//UseStream은 클래스이름
				Arrays.asList(equation.split("\\+|\\-")).stream().map(UseStream::checkNull).collect(Collectors.toList()));
		
		ArrayList<String> sign = new ArrayList<String>(
				Arrays.asList(equation.split("")).stream().filter(s->s.equals("+")||s.equals("-")).collect(Collectors.toList()));
		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}
		for (int i = 0; i < sign.size(); i++) {
			System.out.println(sign.get(i));
		}
		
		for (int i = 0; i < sign.size(); i++) {
			if(i==0) {
				result = number.get(i);
			}
			//UseStream은 클래스 이름
			result = UseStream.sumAndSub(sign.get(i)).calc(result, number.get(i+1));
		}
		
		System.out.println(result);
	}
}
