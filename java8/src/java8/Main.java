package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    System.out.println("asdf");

    List<String> l = Arrays.asList("a", "b", "c");
    l.forEach(e -> System.out.println(e));
    
//    default void forEach(Consumer<? super T> action) {
//      Objects.requireNonNull(action);
//      for (T t : this) {
//          action.accept(t);
//      }
//   }

    System.out.println(l.stream().collect(Collectors.joining(",")));
    System.out.println(l.stream().collect(Collectors.joining(",", "[", "]")));
    
    // use ClickListener example
    
    //  A Stream does not store any elements. It is not a data structure. It just operates on the underlying data structure without modifying it. 

    List<String> ll = l.stream().map(e -> e.toString() + e.toString()).collect(Collectors.toList());
    ll.forEach(e -> System.out.println(e));
    

    //    int sum = widgets.stream()
    //      .filter(w -> w.getColor() == RED)
    //      .mapToInt(w -> w.getWeight())
    //      .sum();

    // summing, e.g.
    // l.stream().mapToInt(e -> e.length()).collect(Collectors.of(() -> 0, (x, y) -> x + y, (x, y) -> x + y));

    // StringBuilder appending, 
    // Collectors.of(StringBuilder::new, StringBuilder::append, StringBuilder::append, StringBuilder::toString);

    // show things in Scala
    
    // no semi-colons
    
    // similar to Spark
  }
}
