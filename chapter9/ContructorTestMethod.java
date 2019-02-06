package chapter9;

class A {
  public void message(){
    System.out.println("I'm in A");
  }

  public void whistle(){
    System.out.println("Fui fiu in A");
  }
}

class B extends A {
  private String name;
  public B(String name){
    message();
    this.name = name;
    message();
  }
  public void message(){
    System.out.println(name);
  }
}

public class ContructorTestMethod {
  public static void main(String args[]){
    A obj = new B("Manuel");
    obj.whistle();
  }
}
