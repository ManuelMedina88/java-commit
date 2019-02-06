package chapter9;

// One interface can extend another.
abstract interface A {
  public abstract void meth1();
  public abstract void meth2();
}

// B now includes meth1() and meth2() -- it adds meth3
abstract interface B extends A {
  public abstract void meth3();
}

// This class must implement all of A and B
class MyClass implements B {
  public void meth1(){
    System.out.println("Implement meth1().");
  }

  public void meth2(){
    System.out.println("Implement meth2().");
  }

  public void meth3(){
    System.out.println("Implement meth3().");
  }
}

public class IFExtend{
  public static void main(String args[]){
    MyClass ob = new MyClass();

    ob.meth1();
    ob.meth2();
    ob.meth3();
  }
}
