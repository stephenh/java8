package java8;

import java.util.stream.IntStream;

/** Streams. */
public class Main06 {

  public static void main(String[] args) {
    IntStream list = IntStream.range(1, 1000);
    int total = list.parallel().filter(e -> e > 1).reduce(0, (a, b) -> a + b);
    System.out.println(total);
  }

}
