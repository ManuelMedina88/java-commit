package chapter6;

// This program includes a method inside the box class.
class Box3 {
  double width;
  double height;
  double depth;

  // display volume of a box
  void volume() {
    System.out.print("Volume is ");
    System.out.println(width * height * depth);
  }
}

public class BoxDemo3{
  public static void main(String args[]) {
    Box3 myBox1 = new Box3();
    Box3 myBox2 = new Box3();

    // assign values to mybox1's instance variables
    myBox1.width = 10;
    myBox1.height = 20;
    myBox1.depth = 15;

    /* assign different values to mybox2's
        instance variables */
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // display volume of first Box
        myBox1.volume();

        // display volume of second box
        myBox2.volume();
  }
}
