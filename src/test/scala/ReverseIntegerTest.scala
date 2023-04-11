package reverseinteger
import org.junit.Assert
import org.scalatest.funsuite.AnyFunSuite

class ReverseIntegerTest extends AnyFunSuite{
  val fixture = new ReverseInteger()

  test("longestsubstring"){
    Assert.assertEquals(123, fixture.reverse(321))
    Assert.assertEquals(-123, fixture.reverse(-321))
    Assert.assertEquals(21, fixture.reverse(120))
    Assert.assertEquals(0, fixture.reverse(Integer.MAX_VALUE))
    Assert.assertEquals(0, fixture.reverse(Integer.MAX_VALUE-1))
  }
}
