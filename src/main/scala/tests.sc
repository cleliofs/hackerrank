val P = """_*(_1+_)_*""".r
val P2 = """(1+)""".r
val line = "111111111111111111111111111111111111111111111111111111111111111"
line match {
  case P(n) => line.replaceFirst(n, "1" + n.replaceAll("_", "") + "1")
  case P2(n) => line
  case _ => "Not found"
}

val s = "1000000001 1000000002 1000000003 1000000004 1000000005"
s.split(" ").map(_.toLong).sum

val n = "4294967294".toLong.toBinaryString

val b = "1111111111111111111111111111110"
Integer.parseInt(b, 2)

val h = 0x801002
Integer.parseInt("000000001111", 2)