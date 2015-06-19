/**
 * https://www.hackerrank.com/challenges/pangrams
 *
 * Created by csouza on 19/06/2015.
 */
object Pangrams extends App {

  def isPangram(s: String): Boolean = {
    ('a' to 'z').forall(l => s.contains(l))
  }

  val line = io.Source.stdin.getLines().next().toLowerCase()
  println(isPangram(line) match {
    case true => "pangram"
    case false => "not pangram"
  })

}
