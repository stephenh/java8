package java8;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Example of lambdas. */
public class Main03 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("1", "2", "3", "44");

    List<Integer> lengths = new ArrayList<>();
    for (String e : list) {
      lengths.add(e.length());
    }
    System.out.println(lengths);

    List<Integer> lengths2 = list.stream().map(e -> e.length()).collect(toList());
    System.out.println(lengths2);

    List<Integer> bigLengths = new ArrayList<>();
    for (String e : list) {
      if (e.length() > 1) {
        bigLengths.add(e.length());
      }
    }
    System.out.println(bigLengths);

    List<Integer> bigLengths2 = list.stream()//
      .filter(e -> e.length() > 1)
      .map(e -> e.length())
      .collect(toList());
    System.out.println(bigLengths2);
  }

}
