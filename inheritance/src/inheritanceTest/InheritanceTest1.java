package inheritanceTest;

class A{
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("부모 생성자");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	public B() {
		this.data = 20;
		System.out.println("자식 생성자");
	}
	
	void printData() {
		System.out.println(data);
	}
}


public class InheritanceTest1 {
	// alt+ shift + r
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		b.data = 20;
		b.printData();
	}
}
