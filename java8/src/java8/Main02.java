package java8;

/** Example of multiple default methods. */
public class Main02 {
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

  public interface Zaz {
    default void sayBye() {
      System.out.println("bye!");
    }
  }

  public static class FooImpl implements Foo, Zaz {
    @Override
    public void sayHi() {
      System.out.println("hi");
    }

    @Override
    public void sayBye() {
      Zaz.super.sayBye();
    }
  }
}
