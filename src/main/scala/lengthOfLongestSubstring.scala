package length

import scala.annotation.tailrec
import scala.collection.mutable


class lengthOfLongestSubstring {
//  def lengthOfLongestSubstring(s: String): Int = {
//    if(s.length==0) return 0
//    var prevChars = new mutable.HashSet[String]()
//    var result = 1
//    var running = 1
//    s.split("").map{char=>
//      if(prevChars.contains(char)) {
//        running = 1
//        prevChars = new mutable.HashSet[String]()
//      }
//      if(running > result)
//        result = running
//      running += 1
//      prevChars.add(char)
//    }
//    result
//  }
  def lengthOfLongestSubstring(s: String): Int = {
    if(s.length==0) return 0

    def lengthOfLongestSubstringRec(s: List[Char], chars: Set[Char], len: Int, maxLen: Int): Int ={
      s match {
        case Nil => maxLen max len
        case c :: tail if chars.contains(c) =>
          lengthOfLongestSubstringRec(tail, Set(c), 1, maxLen max len)
        case c :: tail =>
          lengthOfLongestSubstringRec(tail, chars + c, len + 1, maxLen) max lengthOfLongestSubstringRec(tail, Set(c), 1, maxLen max len)
      }
    }
  lengthOfLongestSubstringRec(s.toList, Set.empty[Char], 0 , 0)
}
//  def lengthOfLongestSubstring(s: String): Int = {
//    s.tails.toList.flatMap(_.inits).filter(s => s.length == s.toSet.size).map(_.length).maxOption.getOrElse(0)
//  }
}
