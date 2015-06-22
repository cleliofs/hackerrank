/**
 * https://www.hackerrank.com/challenges/lonely-integer
 *
 * Created by csouza on 22/06/2015.
 */
object LonelyInt extends App {

  def zipWithCount(arr: Seq[Int]): Seq[(Int, Int)] = {
    arr.map(e => (e, arr.count(_==e))).distinct
  }

  val line = io.Source.stdin.getLines().drop(1).next()
  val items: Array[Int] = line.split(" ").map(e => e.toInt)
  println(zipWithCount(items).filter(_._2==1).map(_._1).mkString(" "))

}
