package chapter17;

// Construct string from subset of char array.
public class SubStringCons {
  public static void main(String args[]){
    byte ascii[] = {65, 66, 67, 68, 69, 70};

    String s1 = new String(ascii);
    System.out.println(s1);

    String s2 = new String(ascii, 2, 3);
    System.out.println(s2);

    int chars[] = {15548, 40485, 6922, 9585};

    String ints = new String(chars, 0, chars.length);

    int number = 186574;

    System.out.println(ints + " Flinn's" + number);
  }
}
