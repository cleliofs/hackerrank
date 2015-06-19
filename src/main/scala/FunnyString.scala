/**
 * https://www.hackerrank.com/challenges/funny-string
 *
 * Created by csouza on 19/06/2015.
 */
object FunnyString extends App {

  def isFunny(s: String): Boolean = {
    val r = s.reverse
    val l = s.sliding(2).toArray.map(a => Math.abs(a(1) - a(0))) zip r.sliding(2).toArray.map(a => Math.abs(a(1) - a(0)))
    l.forall(t => t._1 == t._2)
  }

  val lines = io.Source.stdin.getLines().drop(1)
  lines.foreach(l => println(isFunny(l) match {case true => "Funny" case false => "Not Funny"}))

}
