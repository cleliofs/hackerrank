import scala.annotation.tailrec

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 *
 * Created by csouza on 18/06/2015.
 */
object UtopianTree extends App {

////  @tailrec
//  def rec(cycle: Int, size: Long, acc: Long): Long = {
//    if (cycle == 0) size
//    else if (cycle == 1) rec(0, size * 2, size + (acc * 2))
//    else if (cycle == 2) rec(1, rec(1, size, 1) + 1, 1)
//    else if (cycle % 2 == 0) rec(cycle - 1, size * 2, acc + (size * 2))
//    else rec(cycle - 1, size + 1, acc + (size + 1))
//  }

//  def utopianTreeDepth(n: Int): Long = {
//
//  }

  def growUtopianTree(n: Int): Long = {
    var size: Long = 1
    (0 until n).foreach { n =>
      if (n%2==0) size *= 2 else size += 1
    }

    size
  }

  def growUtopianTreeRec(n: Int): Long = {
    var growth: Long = 0;
    if(n == 0)
      return 1
    else if (n % 2 == 1)
      growth = growth + (2 * growUtopianTreeRec(n - 1));
    else
      growth = growth + (1 + growUtopianTreeRec(n - 1));

    growth;
  }

  println(growUtopianTree(10000))
  println(growUtopianTreeRec(10000))

//  val lines = io.Source.stdin.getLines()
//  val n = lines.next().toInt
//  lines.map(e => growUtopianTree(e.toInt)).foreach(println)

}
