package chapter14;

// A non-generic class can be the superclass
// of a generic subclass.

// An non-generic class.
class NonGen {
  int num;

  NonGen(int i){
    num = i;
  }

  int getNum(){
    return num;
  }
}

// A generic subclass.
class Gen<T> extends NonGen {
  T ob; // declare an object of type?

  // Pass the constructor reference to
  // an object of type T.
  Gen(T o, int i){
    super(i);
    ob = o;
  }

  // Return ob.
  T getOb() {
    return ob;
  }
}

// Create a Gen object.
class HierDemo2 {
  public static void main(String args[]) {

    // Create a Gen object for String.
    Gen<String> w = new Gen<String>("Hello", 47);

    System.out.print(w.getOb() + " ");
    System.out.println(w.getNum());
  }
}
