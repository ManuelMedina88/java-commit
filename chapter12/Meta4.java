package chapter12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str() default "Testing";
  int val() default 9000;
}

public class Meta4 {

  // Annotate a method using the default values.
  @MyAnno()
  public static void myMeth(){
    Meta4 ob = new Meta4();

    // Objection the annotation for this method
    // and display the values of the members.
    try {
      Class<?> c = Meta4.class;

      Method m = c.getMethod("myMeth");

      MyAnno anno = m.getAnnotation(MyAnno.class);

      System.out.println(anno.str() + " " + anno.val());
    }catch(NoSuchMethodException exc){
      System.out.println("Method Not Found.");
    }
  }

  public static void main(String args[]){
    myMeth();
  }
}
