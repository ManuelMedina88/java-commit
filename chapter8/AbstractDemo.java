package chapter8;
// A simple demonstration of abstract.
abstract class A5 {
  abstract void callme();

  // concrete methods are still allowed in abstract classes
  void callmetoo() {
    System.out.println("This is a concrete method.");
  }
}

class B5 extends A5 {
  void callme() {
    System.out.println("B's implementation of callme.");
  }
}

class AbstractDemo {
  public static void main(String args[]) {
    B5 b = new B5();

    b.callme();
    b.callmetoo();
  }
}
