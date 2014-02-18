package java8;

import java.util.Arrays;
import java.util.List;

/** Example of lambdas with method handles. */
public class Main04 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("1", "2", "3", "44");

    list.forEach(System.out::println);

    Logic l = new Logic();
    list.forEach(l::println);
  }

  public static class Logic {
    public void println(String s) {
      System.out.println("string: " + s);
    }
  }
}
