package chapter14;

// Use the instanceof operator with a generic class hierarchy.
class Gen<T> {
  T ob;

  Gen(T o) {
    ob = o;
  }

  // return o
  T getOb(){
    return ob;
  }
}

// A subclass of Gen.
class Gen2<T> extends Gen<T> {
  Gen2(T o){
    super(o);
  }
}

// Demonstrate run-time type ID implications of generic
// class hierarchy.
public class HierDemo3 {
  public static void main(String args[]){

    // Create a Gen object for Integers
    Gen<Integer> iOb = new Gen<Integer>(88);

    // Create a Gen2 object for Intergers.
    Gen2<Integer> iOb2 = new Gen2<Integer>(99);

    // Create a Gen2 object for Strings.
    Gen2<String> strOb2 = new Gen2<String>("Generics Test");

    // See if iOb2 is some form of Gen2.
    if(iOb2 instanceof Gen2<?>)
      System.out.println("iOb2 is instance of Gen2");

    // See if iOb2 is some form of Gen.
    if(iOb2 instanceof Gen<?>)
      System.out.println("iOb2 is instance of Gen");

    System.out.println();

    // See if strOb2 is a Gen2.
    if(strOb2 instanceof Gen2<?>){
      System.out.println("strOb2 is instance of Gen2");
    }

    // See if strOb2 is a Gen.
    if(strOb2 instanceof Gen<?>)
      System.out.println("IOb is instance of Gen");

    System.out.println();

    // See if iOb is an instance of Gen2, which it is not.
    if(iOb instanceof Gen2<?>)
      System.out.println("iOb is instace of Gen2");

    // See if iOb2 is an instance of Gen, Which  it is
    if(iOb instanceof Gen<?>)
      System.out.println("iOb is instance of Gen");

    // The following can't be compiled because
    // generic type info does not exist at run time.
//  if(iOb2 instanceof Gen2<Integer>)
//    System.out.println("iOb2 is instance of Gen2<Integer>");
  }
}
