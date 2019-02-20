package chapter11;

class ThreadRunnable implements Runnable {

  private String name;

  public Thread t;

  public ThreadRunnable(String name){
    this.name = name;
    t = new Thread(this, name);
  }

  public void run(){

    try {
      for(int i = 5; i > 0; i--){
        System.out.println("missing time, " + i + " seconds");
        Thread.sleep(500);
      }
    } catch(InterruptedException e){
      System.out.println("The thread has been interrupted");
    }

    System.out.println("Exiting from the thread: " + name);
  }
}

public class ThreadPractice {
  public static void main(String args[]){

  ThreadRunnable t = new ThreadRunnable("second");

  t.t.start();


    try{
        Thread.sleep(10000);
    }catch(InterruptedException e){
      System.out.print("The main tread has been halt");
    }

    System.out.println("Exiting from the thread: main");


    ThreadRunnable t2 = new ThreadRunnable("second");

    t2.t.start();


      try{
          Thread.sleep(10000);
      }catch(InterruptedException e){
        System.out.print("The main tread has been halt");
      }

      System.out.println("Exiting from the thread: main");

      ThreadRunnable t3 = new ThreadRunnable("second");

      t3.t.start();


        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
          System.out.print("The main tread has been halt");
        }

        System.out.println("Exiting from the thread: main");
  }
}
