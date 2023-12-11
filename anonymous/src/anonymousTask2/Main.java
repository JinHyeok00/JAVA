package anonymousTask2;

public class Main {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.wake();
		System.out.println();
		
		Anonymous ano = new Anonymous();
		
		ano.person.wake();
		
		ano.method();
	}
}
