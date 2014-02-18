package java8

/** An example of lambdas and method handles. */
object Main04 {
  def main(args: Array[String]) {
    val list = Seq("1", "2", "3", "44")
    
    list.foreach(println)

    val l = new Logic()
    list.foreach(l.println)
  }
  
  class Logic {
    def println(s: String) = System.out.println("string: " + s)
  }
}