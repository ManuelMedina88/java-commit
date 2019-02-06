package chapter9;

public abstract interface MyIF {
  // This is a "normal" interface method declaration.
  // It does NOT define a default implementation.
  public abstract int getNumber();

  public default String getString(){
    return "Default String";
  }
}
