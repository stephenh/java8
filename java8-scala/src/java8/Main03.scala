package java8

/** An example of lambdas. */
object Main03 {
  def main(args: Array[String]) {
    val list = Seq("1", "2", "3", "44")
    
    val lengths2 = list.map { _.length }
    println(lengths2)
    
    val bigLengths2 = list.filter { _.size > 1 }.map { _.length }
    println(bigLengths2)
  }
}