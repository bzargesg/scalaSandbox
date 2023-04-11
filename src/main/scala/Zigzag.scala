package zigzag

import java.util
import scala.collection.mutable.ArrayBuffer

class Zigzag {
  import collection.immutable.SortedSet
  def convert(s: String, numRows: Int): String = {
   if(numRows == 1) s
    else{
     (0 until numRows).flatMap{r=>
       (r until s.length by ((numRows-1)*2)).flatMap{i =>
         SortedSet(i, i + (numRows-1-r)*2%((numRows-1)*2) )
       }
     }.filter(_ < s.length).map(s).mkString
   }
  }
}