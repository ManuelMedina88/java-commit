package chapter15;

// An example of capturing a local variable from the enclosing scope

abstract interface MyFunc3 {
  int func(int n);
}

public class VarCapture {

  public static void showMessage(){
    System.out.println("It workds!");
  }

  public void showIt(){
    System.out.println("It workds too!");
  }
  public static void main(String args[]){

    // A local variable that can be captured.
    int num = 10;

    MyFunc3 myLambda = (n) -> {

      VarCapture.showMessage();
      VarCapture he = new VarCapture();

      he.showIt();

      // This use of num is Ok. It does not modify num.
      int v = num + n;

      // However, the following is illegal becuase it attempts
      // to modify the value of num.
//    num++;

      return v;
    };

    // The following line would also cause an error, because
    // it would remove the effectively final status from num.
  //   num = 9;

      System.out.println(myLambda.func(3));
  }
}
