package chapter13;

// Demonstrate assert.
class AssertDemo {
  static int val = 3;

  // Return an integer.
  static int getnum() {
    return val--;
  }

  public static void main(String args[]){
    int n;

    try {
      for (int i = 0; i < 10; i++){
        n = getnum();

        assert n > 0: "When the loop reached " + i + " this error happened"; // will fail when n is 0

        System.out.println("n is " + n);
      }
    }catch(AssertionError e){
      System.out.println(e.getMessage());
    }

    System.out.println("Everything Okay");
  }
}
