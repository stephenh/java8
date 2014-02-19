package java8;

/** Example of default methods. */
public class Main01 {
  public static void main(String[] args) {
    Foo f = new FooImpl();
    f.sayHi();
    f.sayBye();
  }

  public interface Foo {
    void sayHi();
    
    default void sayBye() {
      System.out.println("bye");
    }
  }

  public static class FooImpl implements Foo {
    @Override
    public void sayHi() {
      System.out.println("hi");
    }
  }
}
