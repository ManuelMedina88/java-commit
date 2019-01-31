package chapter8;
// Demonstrate when constructors are executed.

// Create a super class.
class A1 {
  A1(){
    super();
    System.out.println("Inside A's constructor.");
  }
}

// Create a subclass by extending class A.
class B1 extends A1 {
  B1(){
    super();
    System.out.println("Inside B's constructor.");
  }
}

// Create another subclass by extending B.
class C extends B1 {
  C(){
    super();
    System.out.println("Inside C's constructor.");
  }
}

class CallingCons {
  public static void main(String args[]){
      C c = new C();
  }
}
