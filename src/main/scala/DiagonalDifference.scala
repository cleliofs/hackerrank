package main.scala

import scala.io.Source
import scala.math._

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 *
 * Created by csouza on 17/06/2015.
 */
object DiagonalDifference extends App {

  val lines = Source.fromFile("src/main/resources/input.txt").getLines()

  val n = lines.next().toInt

  val array = lines.map(l => l.split(" ")).toArray[Array[String]]

  val diagonals = for {
    i <- 0 until n
  } yield(array(i)(i).toInt, array(i)((n-1)-i).toInt)

  val sumD1 = diagonals.map(t => t._1).sum
  val sumD2 = diagonals.map(t => t._2).sum

  println(abs(sumD1 - sumD2))
}
