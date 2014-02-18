package java8

/** An example of traits. */
object Main02 {
  def main(args: Array[String]) {
    val f = new FooImpl()
    f.sayHi()
    f.sayBye()
  }

  trait Foo {
    def sayHi()
    
    def sayBye() = println("bye")
  }
  
  trait Zaz {
    // def sayBye() = println("bye!")
  }
  
  class FooImpl extends Foo with Zaz {
    override def sayHi() {
      println("hi");
    }
  }
}