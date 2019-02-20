package chapter10;

// Demonstrate exception chaining.
public class ChainExcDemo {
  public static void demoproc() {
    // create an exception
    NullPointerException e =
      new NullPointerException("top layer");

    // add a cause
    e.initCause(new ArithmeticException("casuse"));

    throw e;
  }

  public static void main(String args[]){
    try {
      demoproc();
    }catch(NullPointerException e){
      // display to level ArithmeticException
      System.out.println("Caught: " + e);

      // display cause exception
      System.out.println("Original cause: " + e.getCause());
    }
  }
}
