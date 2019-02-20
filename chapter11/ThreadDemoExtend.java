package chapter11;

public class ThreadDemoExtend {
  public static void main(String args[]){
    NewThreadExtend nt = new NewThreadExtend(); // create a new thread

    nt.start(); // start the thread

    try {

      for(int i = 5; i > 0; i--) {
        System.out.println("Main Thread: " + i);
        Thread.sleep(10000);
      }
    } catch (InterruptedException e){
      System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread exiting.");
  }
}
