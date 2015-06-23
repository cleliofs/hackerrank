package main.scala

import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/rotate-string
 *
 * Created by clelio on 23/06/15.
 */
object RotateString extends App {

  val lines: Iterator[String] = io.Source.stdin.getLines().drop(1)


  def rotateString(s: String) = {

    def rotate(s: String): String = s.drop(1) + s(0)

    @tailrec
    def rec(l: List[String], s: String, c: Int): List[String] = {
      if (c == 0) l
      else {
        val s2 = rotate(s)
        rec(l:+s2, s2, c-1)
      }
    }

    rec(List(), s, s.length)
  }

  val res: Iterator[String] = lines.map(l => rotateString(l).mkString(" "))
  res.foreach(println)

}
