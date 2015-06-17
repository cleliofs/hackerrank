/**
 * https://www.hackerrank.com/challenges/plus-minus
 *
 * Created by csouza on 17/06/2015.
 */
object PlusMinus extends App {

  val lines = io.Source.stdin.getLines()
  val total = lines.next().toFloat
  val numbers = lines.next().split(" ").map(n => n.toInt)

  val fractionPositive = numbers.count(_ > 0) / total
  val fractionNegative = numbers.count(_ < 0) / total
  val fractionZero = numbers.count(_ == 0) / total

  println(f"$fractionPositive%.3f")
  println(f"$fractionNegative%.3f")
  println(f"$fractionZero%.3f")
}
