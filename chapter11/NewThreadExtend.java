package chapter11;

// Create a second thread by extending Thread
class NewThreadExtend extends Thread {

  NewThreadExtend() {
    // Create a new, second thread
    super("Demo Thread");
    System.out.println("Child thread: " + this);
  }

  // This is the entry point for the second thread.
  public void run(){
    try {
      for(int i = 5; i > 0; i--){
        System.out.println("Child Thread: " + i);
        Thread.sleep(5000);
      }
    }catch (InterruptedException e){
      System.out.println("Child interrupted.");
    }
    System.out.println("Existing child thread.");
  }
}
