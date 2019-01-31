package chapter8;
// Methods with differing type signatures are overloaded - not
// overridden.
class A3 {
  int i, j;

  A3(int a, int b) {
    i = a;
    j = b;
  }

  // display i and j
  void show() {
    System.out.println("i and j: " + i + " " + j);
  }
}

// Create a subclass by extending class A.
class B3 extends A3 {
  int k;

  B3(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  // overload show()
  void show(String msg){
    System.out.println(msg + k);
  }
}

class Override2{
  public static void main(String args[]){
    B3 subOb = new B3(1, 2, 3);

    subOb.show("This is k: "); // this calls show() in B3
    subOb.show(); // this calls show () in A 
  }
}
