import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/pascals-triangle
 *
 * f(r,c) = r! / (c! * (r-c)!)
 *
 * Created by csouza on 19/06/2015.
 */
object PascalTriangle extends App {

  val fact = (n: Long) => {
    @tailrec
    def rec(n: Long, acc: Long): Long= {
      if (n <= 1) acc
      else rec(n-1, n * acc)
    }
    rec(n, 1)
  }

  val f = (r: Int, c: Int) => fact(r) / (fact(c) * fact(r-c))

  val n = io.Source.stdin.getLines().next().toInt

  (0 until n).map(e1 => (0 to e1).map(e2 => f(e1, e2))).map(v => v.mkString(" ")).foreach(println)
}
