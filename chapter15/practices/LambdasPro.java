package chapter15.practices;

abstract interface MyLambdaFunctionalInterface5<T>{
  public abstract T func(T o);
}

public class LambdasPro {

  public static String whoAmI(String name){
    return String.format("The master's name is: %s", name);
  }


  public static void showMethodReference(MyLambdaFunctionalInterface5<String> v, String master){
    System.out.println(v.func(master));
  }

  public String miniStart(String master){
    return String.format("My master \"" + master + "\" says that every begining starts with a little step!");
  }

  public static void main(String args[]){

    MyLambdaFunctionalInterface5<String> info = (name) -> whoAmI(name);

    System.out.println(info.func("Manuel"));

    showMethodReference(LambdasPro::whoAmI, "Manuel1");

    LambdasPro object = new LambdasPro();

    showMethodReference(object::miniStart, "Manuel 2");

  }
}
