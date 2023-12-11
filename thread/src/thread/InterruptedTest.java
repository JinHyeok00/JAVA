package thread;

public class InterruptedTest {
   public static void main(String[] args) {
//	   Thread1 thread = new Thread1();
//	   
//	   thread.setData("ÁøÇõ");
//	   thread.run();
	   
      Thread3 mineral = new Thread3();
      
      
      Thread thread = new Thread(mineral);
      
      thread.start();
      
      try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      
//      thread.interrupt();
//      mineral.setExit(true);
      System.exit(0);
   }
}