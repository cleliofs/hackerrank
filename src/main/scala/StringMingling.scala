import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/string-mingling
 *
 * Created by csouza on 24/06/2015.
 */
object StringMingling extends App {

  val lines = io.Source.stdin.getLines()
  val p = lines.next()
  val q = lines.next()

  def mingle(p: String, q: String) = {
    @tailrec
    def rec(p: String, q: String, acc: String): String = {
      if (p == "") acc
      else rec(p.tail, q.tail, acc + p.head + q.head)
    }

    rec(p, q, "")
  }

  println(mingle(p, q))
}
