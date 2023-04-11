package zigzag
import org.junit.Assert
import org.scalatest.funsuite.AnyFunSuite

class ZigZagTest extends AnyFunSuite{
  val fixture = new Zigzag()

  test("longestsubstring"){
    Assert.assertEquals("PAHNAPLSIIGYIR", fixture.convert("PAYPALISHIRING",3))
    Assert.assertEquals("PINALSIGYAHRPI", fixture.convert("PAYPALISHIRING",4))
  }
}
