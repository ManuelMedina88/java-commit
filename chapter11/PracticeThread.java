package chapter11;

class FirstThread implements Runnable{

  private String name;
  public Thread t;

  public FirstThread(String name){
    this.name = name;
    t = new Thread(this, this.name);
  }

  public void run(){
    try {
      for(int i = 5; i > 0; i--){
        System.out.println(i);
        Thread.sleep(2000);
      }
    }catch(InterruptedException e){
      System.out.println("The first thread was interrupted.");
    }
  }
}

public class PracticeThread {

  private static FirstThread ft = new FirstThread("first");

  public static void main(String args[]){

    ft.t.start();

    try{
      ft.t.join();
      for(int i = 5; i > 0; i--){
        System.out.println(i + "I'm in the main thread");
        Thread.sleep(1000);
      }

    }catch(InterruptedException e){
      System.out.println("Something happens.");
    }

  }
}
