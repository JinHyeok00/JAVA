package thread;

public class ThreadTest{
   public static void main(String[] args) {
      Runnable mineral = new Thread2();
      
      Thread t1 = new Thread(mineral, "?");
      Thread t2 = new Thread(mineral, "!");
      
      t1.start();
      t2.start();
      
      System.out.println("메인쓰레드 종료");
      
//      Thread1 thread1 = new Thread1("★");
//      Thread1 thread2 = new Thread1("♥");
//      
//      thread1.start();
//      thread2.start();
      
//      thread1.run();
//      thread2.run();
   }
}