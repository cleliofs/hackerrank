/**
 * https://www.hackerrank.com/challenges/time-conversion
 *
 * Created by csouza on 18/06/2015.
 */
object TimeConversion extends App {

  val line = io.Source.stdin.getLines().next()

  val pattern1 = """(\d{2}):(\d{2}):(\d{2})(PM|AM)""".r
  val pattern2 = """(\d{2}):(\d{2}):(\d{2})""".r

  val result = line match {
    case pattern1(h, m, s, pmOrAm) => {
      if (pmOrAm.toLowerCase == "pm" && h != "12") s"${h.toInt + 12}:$m:$s"
      else if (pmOrAm.toLowerCase == "pm" && h == "12") s"12:$m:$s"
      else if (pmOrAm.toLowerCase == "am" && h == "12") s"00:$m:$s"
      else line.dropRight(2)
    }
    case pattern2(h, m, s) => line
    case _ => "Not matching"
  }

  println(result)
}
