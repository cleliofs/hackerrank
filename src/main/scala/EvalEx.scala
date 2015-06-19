import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/eval-ex
 *
 * 1 + x + x2/2! + x3/3! + x4/4! + .......
 *
 * Created by csouza on 19/06/2015.
 */
object EvalEx extends App {

  def f(x: Float): Float = {
    def fact(n: Long): Long = {
      @tailrec
      def rec(n: Long, acc: Long): Long= {
        if (n <= 1) acc
        else rec(n-1, n * acc)
      }
      rec(n, 1)
    }

    (0 until 10).map(e => Math.pow(x, e)/fact(e)).sum.toFloat
  }

//    "%.4f".format(f(20.0000f)).toFloat
  println(f(20.0000f))

}
