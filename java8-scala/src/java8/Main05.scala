package java8

import scala.collection.mutable.Buffer

/** An example of custom lambdas. */
object Main05 {
  def main(args: Array[String]) {
    val w = new Widget()

    w.onClick(new ClickHandler() {
      override def onClick = println("clicked")
    })

    implicit def fn2SAM(f: () => Unit) = new ClickHandler {
      override def onClick = f()
    }

    w.onClick(() => {
      println("a")
      println("b")
    })

    w.click()
  }

  trait ClickHandler {
    def onClick()
  }

  class Widget {
    private val handlers = Buffer[ClickHandler]()

    def onClick(h: ClickHandler) { handlers += h }

    def click() = handlers.foreach { _.onClick() }
  }
}