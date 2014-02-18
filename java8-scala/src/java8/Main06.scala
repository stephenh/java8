package java8

import scala.collection.mutable.Buffer

/** An example of custom lambdas. */
object Main06 {
  def main(args: Array[String]) {
    val r = 1 until 1000
    val total = r.par.filter { _ > 1 }.reduce { _ + _ }
    println(total)
  }

}