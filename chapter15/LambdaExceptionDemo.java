package chapter15;

// Throw an exception from a lamdba expression.

interface DoubleNumericArrayFunc {
  double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
  EmptyArrayException(){
    super("Array Empty");
  }
}

public class LambdaExceptionDemo {
  public static void main(String args[]){

    double[] values = {1.0, 2.0, 3.0, 4.0};

    // This block lambda computes the average of doubles.
    DoubleNumericArrayFunc average = (n) -> {
      double sum = 0;

      if(n.length == 0)
        throw new EmptyArrayException();

      for(int i = 0; i < n.length; i++)
        sum += n[i];

      return sum/n.length;
    };

    try{

      System.out.println("The average is " + average.func(values));

      // This causes an exception to be thrown.
      System.out.println("The average is " + average.func(new double[0]));
    }
    catch(EmptyArrayException ex){
      System.err.println(ex);
    }
  }
}
