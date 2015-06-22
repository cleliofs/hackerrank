import scala.collection.immutable.IndexedSeq

/**
 * https://www.hackerrank.com/challenges/find-digits
 *
 * Created by csouza on 22/06/2015.
 */
object FindDigits extends App {

  val lines = io.Source.stdin.getLines().drop(1)

  val res: Iterator[IndexedSeq[Option[Char]]] = lines.map(l => l.map(n => if (n != '0' && (l.toInt % n.toString.toInt) == 0) Some(n) else None))
  res.foreach(e => println(e.flatten.size))

}
