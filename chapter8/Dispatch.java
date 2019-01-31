package chapter8;

// Dynamic Method Dispatch
class A4 {
  void callme() {
    System.out.println("Inside A's callme method");
  }
}

class B4 extends A4 {
  // override callme()
  void callme() {
    System.out.println("Inside B's callme method");
  }
}

class C2 extends A4 {
  // override callme()
  void callme() {
    System.out.println("Inside C's callme method");
  }
}

public class Dispatch {
  public static void main(String args[]) {
    A4 a = new A4(); // object of type A
    B4 b = new B4(); // object of type B
    C2 c = new C2(); // object of type C

    A4 r; // obtain a reference of type A

    r = a; // r refers to a A4 object
    r.callme(); // calls A's version of callme

    r = b; // r referes to a B4 object
    r.callme(); // calls B's version of callme

    r = c; // r refers  to a C object
    r.callme(); // calls C's version of callme
  }
}
