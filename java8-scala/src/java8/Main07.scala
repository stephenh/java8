package java8

import scala.collection.mutable.Buffer

/** Joins. */
object Main07 {
  def main(args: Array[String]) {
    val list = Seq(1, 2, 3, 4)
    println(list.mkString(","))
    println(list.mkString("[", ",", "]"))
  }
}