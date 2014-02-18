package java8;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

/** Joins. */
public class Main07 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4);
    
    String joined = list.stream().map(e -> e.toString()).collect(joining(","));
    System.out.println(joined);
    
    String joined2 = list.stream().map(e -> e.toString()).collect(joining(",", "[", "]"));
    System.out.println(joined2);
  }

}
