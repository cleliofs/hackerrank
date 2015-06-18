import scala.collection.immutable.IndexedSeq

/**
 * https://www.hackerrank.com/challenges/staircase
 *
 * Created by csouza on 17/06/2015.
 */
object Staircase extends App {

  val size = io.Source.stdin.getLines().next().toInt

  val template: Seq[String] = (1 to size).map(_ => "#")

  val res: Seq[Seq[String]] = (0 to size).map(i => template.drop((size-1) - i))

  (0 until size).foreach(e => println(res(e).padTo(size, " ").reverse.mkString))
}
