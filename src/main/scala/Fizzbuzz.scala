package fizzbuzz
class Fizzbuzz {
  def fizzbuzz(): Unit = {
    val result = (1 to 100).inclusive.map{
      case x if x % 15 == 0 => s"${x.toString}:FizzBuzz"
      case x if x % 3 == 0 => s"${x.toString}:Fizz"
      case x if x % 5 == 0 => s"${x.toString}:Buzz"
      case x => x.toString
    }.mkString("\n")
    print(result)
  }
}
