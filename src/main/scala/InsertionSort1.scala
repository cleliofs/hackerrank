package main.scala

import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 *
 * Created by clelio on 27/06/15.
 */
object InsertionSort1 extends App {

  val lines = io.Source.stdin.getLines()
  val length = lines.next().toInt
  val array: Array[Int] = lines.next().split(" ").map(_.toInt)

  def insertSort1(arr: Array[Int], v: Int) = {

    @tailrec
    def rec(acc: Array[Int], v: Int, pos: Int): Array[Int] = {
      if (pos == 0 || v >= acc(pos-1)) { acc(pos) = v; acc }
      else {
        acc(pos) = acc(pos-1)
        println(acc.mkString(" "))
        rec(acc, v, pos - 1)
      }
    }

    println(rec(arr, v, arr.indexOf(v)).mkString(" "))
  }

  insertSort1(array, array(length-1))

}
