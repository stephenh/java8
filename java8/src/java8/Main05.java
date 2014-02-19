package java8;

import java.util.ArrayList;
import java.util.List;

/** Lambads for SAMs. */
public class Main05 {

  public static void main(String[] args) {
    Widget w = new Widget();

    w.addOnClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent e) {
        System.out.println("clicked");
      }
    });

    w.addOnClick(e -> System.out.println("clicked"));
  }

  public class ClickEvent {
  }

  /** Any interface with 1 non-default method can be a SAM/lambda. */
  public interface ClickHandler {
    void onClick(ClickEvent e);
  }

  public static class Widget {
    private List<ClickHandler> handlers = new ArrayList<>();

    void addOnClick(ClickHandler h) {
      handlers.add(h);
    }
  }
}
