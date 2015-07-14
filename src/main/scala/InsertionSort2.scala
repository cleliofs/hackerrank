package main.scala

import scala.annotation.tailrec

/**
  * https://www.hackerrank.com/challenges/insertionsort2
  *
  * Created by clelio on 27/06/15.
  */
object InsertionSort2 extends App {

   val lines = io.Source.stdin.getLines()
   val length = lines.next().toInt
   val array: Array[Int] = lines.next().split(" ").map(_.toInt)

   def insertSort2(arr: Array[Int], v: Int): Array[Int] = {

     @tailrec
     def rec(acc: Array[Int], v: Int, pos: Int): Array[Int] = {
       if (pos == 0 || v >= acc(pos-1)) { acc(pos) = v; acc }
       else {
         acc(pos) = acc(pos-1)
         rec(acc, v, pos - 1)
       }
     }

     rec(arr, v, arr.indexOf(v))
   }

  array.drop(1).foreach(e => println(insertSort2(array, e).mkString(" ")))

//  println(array.map(e => insertSort2(array, e)).last.mkString(" "))
}
