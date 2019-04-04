package chapter15;

// Demonstrate a lambda expression that takes a parameter.

// Another functional interface.
abstract interface NumericTest {
  boolean test(int n);
}

public class LambdaDemo2 {
  public static void main(String args[]){
    // A lambda expression that testa if a number is even.
    NumericTest isEven = (n)-> (n % 2) == 0;

    if(isEven.test(10))
      System.out.println("10 is even");

    if(isEven.test(9))
      System.out.println("9 is even");

    // Now, use a lambda expression that tests if a number
    // is non-negativi.
    NumericTest isNonNeg = (n)-> n >= 0;

    if(isNonNeg.test(1))
      System.out.println("1 is non-negatice");

    if(isNonNeg.test(-1))
      System.out.println("-1 is negative");
  }
}
