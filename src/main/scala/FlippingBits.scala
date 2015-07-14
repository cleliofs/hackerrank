/**
 * https://www.hackerrank.com/challenges/flipping-bits
 *
 * Created by csouza on 24/06/2015.
 */
object FlippingBits extends App {

  val lines = io.Source.stdin.getLines().drop(1)

  def flipBits(s: String) = {
//    val n = s.trim.toLong.toBinaryString
//    val b = n.reverse.padTo(32, '0').reverse
//    val bitsFlipped = b.flatMap(c => if (c.toString == "1") "0" else "1").mkString
//    Integer.parseInt(bitsFlipped, 2)
    Integer.MAX_VALUE - s.trim.toInt
  }

  lines.foreach(l => println(flipBits(l)))

}
