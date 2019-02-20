package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
  int value(); // this variable name must be value
}

class Single {

  // Annotation a method using a single-member annotation.
  @MySingle(100)
  public static void myMeth(){
    Single ob = new Single();

    try {
      Method m = Single.class.getMethod("myMeth");

      MySingle anno = m.getAnnotation(MySingle.class );

      System.out.println(anno.value()); // displays 100
    } catch(NoSuchMethodException exc){
      System.out.println("Method Not Found.");
    }
  }

  public static void main(String args[]){
    myMeth();
  }
}
