package length
import org.scalatest.funsuite.AnyFunSuite
import org.junit.Assert

class LengthOfLongestSubstringTest extends AnyFunSuite{
  val fixture = new lengthOfLongestSubstring()

  test("longestsubstring"){
    Assert.assertEquals(3, fixture.lengthOfLongestSubstring("abcabcbb"))
    Assert.assertEquals(1, fixture.lengthOfLongestSubstring("bbbbb"))
    Assert.assertEquals(3, fixture.lengthOfLongestSubstring("dvdf"))
    Assert.assertEquals(0, fixture.lengthOfLongestSubstring(""))
  }
}
