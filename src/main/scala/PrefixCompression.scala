package main.scala

/**
 * https://www.hackerrank.com/challenges/prefix-compression
 *
 * Created by clelio on 23/06/15.
 */
object PrefixCompression extends App {

  val lines = io.Source.stdin.getLines()
  val x = lines.next()
  val y = lines.next()

  val p = (x zip y).takeWhile(t => t._1.toString == t._2.toString).map(_._1).mkString
  println(s"${p.size} $p")

  val x1 = x.replaceFirst(p, "")
  println(s"${x1.size} $x1")

  val y1 = y.replaceFirst(p, "")
  println(s"${y1.size} $y1")

}
