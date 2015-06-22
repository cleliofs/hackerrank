/**
 * https://www.hackerrank.com/challenges/the-time-in-words
 *
 * Created by csouza on 22/06/2015.
 */
object TimeInWords extends App {

  def getNumbersInWords(n: Int):String = n match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case 5 => "five"
    case 6 => "six"
    case 7 => "seven"
    case 8 => "eight"
    case 9 => "nine"
    case 10 => "ten"
    case 11 => "eleven"
    case 12 => "twelve"
    case 13 => "thirteen"
    case 14 => "fourteen"
    case 15 => "fifteen"
    case 16 => "sixteen"
    case 17 => "seventeen"
    case 18 => "eighteen"
    case 19 => "nineteen"
    case 20 => "twenty"
    case number if 21 to 29 contains number => s"twenty ${getNumbersInWords(number - 20)}"
  }

  def getTimeInWords(h: Int, m: Int) = m match {
    case number if number == 0 => s"${getNumbersInWords(h)} o' clock"
    case number if number == 1 => s"one minute past ${getNumbersInWords(h)}"
    case number if 2 until 15 contains number => s"${getNumbersInWords(number)} minutes past ${getNumbersInWords(h)}"
    case number if number == 15 => s"quarter past ${getNumbersInWords(h)}"
    case number if 16 until 30 contains number => s"${getNumbersInWords(number)} minutes past ${getNumbersInWords(h)}"
    case number if number == 30 => s"half past ${getNumbersInWords(h)}"
    case number if number == 45 => s"quarter to ${getNumbersInWords(h+1)}"
    case number if ((46 to 59) contains number) || ((31 until 45) contains number) => s"${getNumbersInWords(60 - number)} minutes to ${getNumbersInWords(h+1)}"
  }

  val lines = io.Source.stdin.getLines()
  val hour = lines.next().trim().toInt
  val min = lines.next().trim().toInt

  println(getTimeInWords(hour, min))

}
