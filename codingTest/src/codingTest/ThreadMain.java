package codingTest;

import java.util.Scanner;

public class ThreadMain{
	public static void main(String[] args) {
		final int SIZE = 3;
		Runnable mineral = new ThreadTask();
		Scanner sc = new Scanner(System.in);
		Thread[] threads = new Thread[SIZE];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(mineral);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].setName(sc.next());
			threads[i].start();
			try {threads[i].join();} catch (InterruptedException e) {}
		}
		
		
		
		//내방법
//		Scanner sc = new Scanner(System.in);
//		int[] input = new int[3];
//		String[] name = {"first","second","third"};
//		
//		System.out.print("입력: ");
//		for (int i = 0; i < input.length; i++) {
//			input[i]= sc.nextInt();
//		}
//		
//		Thread thread1 = new Thread(()->{
//			System.out.println("Thread1 : "+name[input[0]-1]);
//		});
//		Thread thread2 = new Thread(()->{
//			System.out.println("Thread2 : "+name[input[1]-1]+" ");
//		});
//		Thread thread3 = new Thread(()->{
//			System.out.println("Thread3 : "+name[input[2]-1]);
//		});
//		
//		new ThreadTask().printFirst(thread1);
//		new ThreadTask().printSecond(thread2);
//		new ThreadTask().printThird(thread3);
//		
//		sc.close();
	}
}






