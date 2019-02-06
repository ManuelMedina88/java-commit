package chapter9;

// Use the default method.
public class DefaultMethodDemo {
  public static void main(String args[]){

    MyIF obj = new MyIFImp();

    // Can  call getNumber(), because it is explicitly
    // implemented by MyFImp:
    System.out.println(obj.getNumber());

    // Can also call getString(), because of default
    // implementation:
    System.out.println(obj.getString());
  }
}
