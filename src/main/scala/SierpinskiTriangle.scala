/**
 * https://www.hackerrank.com/challenges/functions-and-fractals-sierpinski-triangles
 *
 * Created by csouza on 19/06/2015.
 */
object SierpinskiTriangle extends App {

  def drawTriangles(n: Int): Unit = {
//    for(i <- 1 to 32; j <- 1 to 63) {
//
//    }

  }

  def drawTree(line: String): String = {
    def rec(line: String, lines: Seq[String], size: Int): Seq[String] = {
      if (size <= 0) lines :+ line
      else {
        val P = """_*(_1+_)_*""".r
          line match {
            case P(n) => rec(line.replaceFirst(n, "1" + n.replaceAll("_", "") + "1"), lines :+ line, size - 1)
          }
      }
    }
    rec(line, List(), 32/2).mkString("\n")
  }

  val input = (1 to 64).map(e => "_").mkString
  val parts = input.splitAt(input.size/2)
  println(drawTree(parts._1 + "1" + parts._2))
//  println(drawTree(parts._1.splitAt(parts._1.size/2)._1 + "1" + parts._1.splitAt(parts._1.size/2)._1))


//  drawTriangles(io.Source.stdin.getLines().next().toInt)


}
