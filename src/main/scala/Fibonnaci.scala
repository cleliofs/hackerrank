import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---fibonacci-numbers
 *
 * Created by csouza on 19/06/2015.
 */
object Fibonacci extends App {

  def fibonacci(n: Int): Int = {
   def rec(n: Int, a: Int, b: Int): Int =  n match {
     case 0 | 1 => a
     case _ => rec(n-1, b, a+b)
   }
    rec(n, 0, 1)
  }

  val n = io.Source.stdin.getLines().next().toInt
  println(fibonacci(n))

}
