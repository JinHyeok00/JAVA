package classTest;

class A {
	int data;
	
	A(int data){
		this.data = data;
	}
	
	A(String name){
		System.out.println(name);
	}
	
	void printData() {
		System.out.println(data);
	}
}


public class ClassTest {
	public static void main(String[] args) {
		A a = new A(10);
		A b = new A("홍길동");
		System.out.println(a);
		System.out.println(b);
		a.data = 10;
		a.printData();
		b.printData();
	}
}
