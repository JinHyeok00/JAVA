package anonymousTask3;

public class ThreadExample {
	public static void main(String[] args) {
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Hellow World");
//			}
//		});
//		thread.start();
		
		
		Thread thread = new Thread( () -> System.out.println("Hellow World") );

		thread.start();
	}
}
