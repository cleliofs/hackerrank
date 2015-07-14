package main.scala

/**
 * https://www.hackerrank.com/challenges/tutorial-intro
 *
 * Created by clelio on 27/06/15.
 */
object TutorialIntro extends App {

  val lines = io.Source.stdin.getLines()
  val n = lines.next().toInt
  val length = lines.next()
  val array: Array[Int] = lines.next().split(" ").map(_.toInt)
  val arrayWithIndex = array.zipWithIndex
  println(arrayWithIndex.filter(_._1 == n).head._2)
}
