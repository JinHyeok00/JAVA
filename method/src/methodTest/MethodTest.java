package methodTest;

public class MethodTest {
	/*static*/ int f(int x) {
		int result = 2*x + 1;
		return result;
	}
//	static
//	컴파일러가 가장 먼저 메모리에 할당한다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//	1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리를 올려준다.
//	2. 일반 메소드의 소속을 알려준다.
	
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		methodTest.f(3);
//		f(3);
	}
}
