package main.scala

import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/captain-prime
 * 
 * Created by clelio on 23/06/15.
 */
object CaptainPrime extends App {

  def isPrime(n: String) = {
    @tailrec
    def rec(divisor: Int, n: Int): Boolean = {
      if (n == 1) false
      else if (n%divisor==0 && n == divisor) true
      else if (divisor != n && n%divisor == 0) false
      else rec(divisor+1, n)
    }

    rec(2, n.toInt)
  }

  def getShipPart(s: String): String = {

    def checkLeft(s: String) = {
      @tailrec
      def recCheckLeft(l: List[Char], acc: Boolean): Boolean = {
        if (!acc) false
        else {
          l match {
            case Nil => true
            case h :: Nil => recCheckLeft(List(), isPrime(h.toString))
            case h :: tail => recCheckLeft(tail, isPrime(tail.mkString))
          }
        }
      }

      recCheckLeft(s.toList, acc = true)
    }

    def checkRight(s: String) = {
      @tailrec
      def recCheckRight(l: List[Char], acc: Boolean): Boolean = {
        if (!acc) false
        else {
          l match {
            case Nil => true
            case h :: Nil => recCheckRight(List(), isPrime(h.toString))
            case h :: tail => {
              val l2 = h :: tail.dropRight(1)
              recCheckRight(l2, isPrime(l2.mkString))
            }
          }
        }
      }

      recCheckRight(s.toList, acc = true)
    }

    val zero = s.contains("0")
    val p = isPrime(s)
    val l = checkLeft(s)
    val r = checkRight(s)

    (zero, p, l, r) match {
      case (false, true, true, true) => "CENTRAL"
      case (false, true, true, false) => "LEFT"
      case (false, true, false, true) => "RIGHT"
      case (true, _, _, _) | (false, false, _, _) | (false, true, false, false)=> "DEAD"
    }

  }

  val lines = io.Source.stdin.getLines()
  lines.drop(1).map(getShipPart).foreach(println)

}
