package issorted
import org.junit.Assert
import org.scalatest.funsuite.AnyFunSuite

class IsSortedTest extends AnyFunSuite{
  val fixture = new IsSorted()
  test("isSorted"){
    Assert.assertEquals(fixture.isSorted(List(1,2,3,4,5)), true)
    Assert.assertEquals(fixture.isSorted(List(3,2,3,4,5)), false)
    Assert.assertEquals(fixture.isSorted(List(3,3,3,3,3)), true)
    Assert.assertEquals(fixture.isSorted(List(1,2,3,3,2,1)), false)
    Assert.assertEquals(fixture.isSorted(List(1,2,3,2,4)), false)
  }
}
