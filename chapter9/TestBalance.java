package chapter9;

import chapter9.mypack.*;

public class TestBalance {
  public static void main(String args[]) {
    /* Because Balance2 is public, you may use Balance2
       class and call its constructor.  */
    Balance2 test = new Balance2("J. J. Jaspers", 99.88);

    test.show(); // you may also call show()
  }
}
