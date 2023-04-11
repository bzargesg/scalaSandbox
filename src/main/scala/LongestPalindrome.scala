package longestpalindrome

class LongestPalindrome {

  def something(s: List[Char], i: Int): String = {
    var one = i - 1
    var two = i + 1
    var str = s(i).toString
    while (one != -1 && two < s.length) {
      if (s(one) == s(two)) {
        str = s(one) + str + s(two)
        one -= 1
        two += 1
      } else {
        return str
      }
    }
    return str
  }

  def longestPalindrome(s: String): String = {
//    List.range(0, s.length).map(index => something(s.toList, index)).maxBy(_.length)
    s.zipWithIndex.flatMap{
      case (_, in)=> List(getLongestFromIndex(s,in, in,""), getLongestFromIndex(s, in, in+1, ""))
    }.maxBy(_.length)
  }

  def getLongestFromIndex(s: String, start: Int, end: Int, longest: String): String ={
    if(start >= 0 && end < s.length && s(start) == s(end)) {
      getLongestFromIndex(s, start - 1, end + 1, s.substring(start, end+1))
    }else{
      longest
    }
  }
}