package java8

/** An example of traits. */
object Main01 {
  def main(args: Array[String]) {
    val f = new FooImpl()
    f.sayHi()
    // f.sayBye()
  }

  trait Foo {
    def sayHi()
  }
  
  class FooImpl extends Foo {
    override def sayHi() {
      println("hi");
    }
  }
}