package fizzbuzz
import org.scalatest.funsuite.AnyFunSuite

class FizzBuzzTest extends AnyFunSuite{
  val fixture = new Fizzbuzz()

  test("fizzbuzz"){
    fixture.fizzbuzz()
  }
}