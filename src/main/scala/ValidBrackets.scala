package validbrackets

import scala.collection.mutable.Stack
class ValidBrackets {
  def isValid(s: String): Boolean = {
    val stack = new Stack[Char]()
    s.toList.map{
      case c if c=='{' || c=='[' || c=='(' => stack.push(c)
      case ')' if (stack.isEmpty && stack.pop() == '(') =>
      case ']' if (stack.isEmpty && stack.pop() == '[') =>
      case '}' if (stack.isEmpty && stack.pop() == '{') =>
      case _ =>
    }
    stack.isEmpty
  }
}
