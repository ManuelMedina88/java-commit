package chapter15.practices;

abstract interface FunctionalInterface<T>{
  abstract T func(T o);
}

public class LambdasTest{

  public static void making(FunctionalInterface<String> frac, String s){
    frac.func(s);
  }

  public static void main(String args[]){

    FunctionalInterface<Integer> number = (num)->{
      Integer result = num * num;
      return result;
    };

    System.out.println("This is the " + number.func(95));
  }
}
