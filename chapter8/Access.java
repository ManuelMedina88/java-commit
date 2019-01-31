package chapter8;

/* In a class hierarchy, private members remain
   private to their class.

   This program contains an error and will not
   compile
*/

// Create a superclass.
class A {
  int i; // default access
  private int j; // private to A

  void setij(int x, int y) {
    i = x;
    j = y;
    System.out.println("hecho" + i + " " + j);
  }

  int getj(){
    return j;
  }
}

// A's j is not accessible here.
class B extends A {
  int total;

  void sum() {
    total = i; //+ j; // Error, j is not accessible her
  }
}

public class Access {
    public static void main(String args[]) {
      B subOb = new B();

      subOb.setij(10, 12);

      subOb.sum();
      System.out.println("Total is " + subOb.total+ " " +  subOb.getj());
    }
}
