// Demonstrate the join() method defined by String.

package chapter17;

public class StringJoinDemo {
  public static void main(String args[]) {
    String result = String.join(" ", "Alpha", "Beta", "Gamma");
    System.out.println(result);

    result = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbSchild.com");
    System.out.println(result);
  }
}
