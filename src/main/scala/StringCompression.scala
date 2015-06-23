package main.scala

import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/string-compression
 *
 * Created by clelio on 23/06/15.
 */
object StringCompression extends App {

  val line = io.Source.stdin.getLines().next()

  def zipWithCount(s: String): Seq[(Char, Int)] = {
    @tailrec
    def rec(s: List[Char], c: Char, count: Int, acc: List[(Char, Int)]): Seq[(Char, Int)] = s match {
      case Nil => (c, count)::acc
      case h :: Nil if h == c => rec(List(), h, count + 1, acc)
      case h :: Nil if h != c => rec(List(), h, 1, (c, count)::acc)
      case h :: tail if h == c => rec(tail, h, count + 1, acc)
      case h :: tail if h != c => rec(tail, h, 1, (c, count)::acc)

    }

    rec(s.toList, s.head, 0, List()).reverse
  }

  println(zipWithCount(line).map(t => if (t._2>1) s"${t._1}${t._2}" else s"${t._1}").mkString)

}
