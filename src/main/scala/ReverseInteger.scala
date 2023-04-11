package reverseinteger



class ReverseInteger {
//  def reverse(x: Int): Int = {
//    val strNum = x.toString
//    val result = if(strNum.head == '-' ) -BigInt(strNum.tail.reverse.mkString) else BigInt(strNum.reverse.mkString)
//    if(result.compareTo(Integer.MAX_VALUE) > 0 || result.compareTo(Integer.MIN_VALUE) < 0) {
//      0
//    }else
//      result.toInt
//  }
  import scala.util.Try
  def reverse(x: Int): Int = {
    val reverseStr = x.abs.toString.reverse
    val result = (if (x < 0) "-" else "") + reverseStr
    Try(result.toInt).getOrElse(0)
  }
}