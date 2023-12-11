package anonymousTask2;

public class Anonymous extends Person{
	void method() {
		Person localVar = new Person() {
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
			
			void walk() {
				System.out.println("산책을 갑니다");
			}
		};
		
		localVar.wake();
	}
	
	
	
	Person person = new Person() {
		void wake() {
			System.out.println("7시에 일어납니다");
			work();
		}
		void work() {
			System.out.println("학교에 갑니다");
		}
	};		
}
