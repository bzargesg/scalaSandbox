package validbrackets
import org.junit.Assert
import org.scalatest.funsuite.AnyFunSuite

class ValidBracketsTest extends AnyFunSuite{
  val fixture = new ValidBrackets()
  test("has valid brackets"){
    Assert.assertEquals(fixture.isValid("{([])}"), true)
    Assert.assertEquals(fixture.isValid("{([)]}"), false)
    Assert.assertEquals(fixture.isValid("([)]"), false)
    Assert.assertEquals(fixture.isValid("{{}[][][()()()]}"), true)
  }
}
