/**
 * https://www.hackerrank.com/challenges/library-fine
 *
 * Created by csouza on 18/06/2015.
 */
object LibraryFine extends App {

  val lines = io.Source.stdin.getLines().map(l => l.split(" "))
  val actualDeliveryDate = lines.next()
  val expectedDeliveryDate = lines.next()

  val res = actualDeliveryDate zip expectedDeliveryDate match {
    case Array((d1, d2), (m1, m2), (y1, y2)) => {
      if (y1.toInt > y2.toInt) "10000"
      else if (y1.toInt < y2.toInt) "0"
      else if (m1.toInt > m2.toInt) (500 * (m1.toInt - m2.toInt)).toString
      else if (m1.toInt == m2.toInt && d1.toInt > d2.toInt) (15 * (d1.toInt - d2.toInt)).toString
      else "0"
    }
  }

  println(res)

}
