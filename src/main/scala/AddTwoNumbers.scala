package addtwonumbers

import scala.annotation.tailrec

case class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

class AddTwoNumbers {
  def checkNull(p:ListNode) = {
    p match {
      case ListNode(x, next) => (x, next)
      case null => (0, null)
    }
  }

//  def addTwoNumbers(l1: ListNode, l2: ListNode) = {

//  }
//  @tailrec
//  def addTwoNumbersRec(
//                      l1: ListNode,
//                      l2: ListNode,
//                      carry: Int,
//                      result: ListNode
//                      ): Unit = {
//    (l1, l2) match {
//      case (null, null) if carry == 0 => result.next
//      case (ListNode(x1, next1), ListNode(x2, next2)) =>
//        val sum = x1 + x2 + carry
//        dologic(sum,result,next1, next2)
//      case (ListNode(x, next), null) =>
//        val sum = x + carry
//        dologic(sum,result,next, null)
//      case (null, ListNode(x, next)) =>
//        val sum = x + carry
//        dologic(sum, result, null, next)
//    }
//  }
//  def dologic(sum: Int, result: ListNode, next1:ListNode, next2:ListNode) = {
//    val digit = sum % 10
//    val newCarry = sum / 10
//    val nextResult = new ListNode(digit)
//    result.next = nextResult
//    addTwoNumbersRec(next1, next2, newCarry, nextResult)
//  }

  def addTwoNumbers(l1: ListNode, l2: ListNode) = {
    var p1 = l1
    var p2 = l2
    val result = new ListNode()
    var rp = result
    var carry = 0
    while((p1 != null) || (p2 != null)){
      val v1 = if(p1 != null) {
        val f = p1.x
        p1 = p1.next
        f
      }
      else
        0
      val v2 = if (p2 != null) {
        val f = p2.x
        p2 = p2.next
        f
      }
      else
        0
      var sum = v1 + v2 + carry
      carry = 0
      if(sum >= 10 ){
        carry = carry + Math.floor( sum / 10).toInt
        sum = sum % 10
      }

      val nextNum = new ListNode(sum, null)
      rp.next = nextNum
      rp = rp.next
    }
      if(carry !=0){
        val nextNum = new ListNode(carry, null)
        rp.next = nextNum
      }
    result.next
  }


}
