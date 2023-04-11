package longestpalindrome
import org.scalatest.funsuite.AnyFunSuite
import org.junit.Assert

class LongestPalindromeTest extends AnyFunSuite{
  val fixture = new LongestPalindrome()

  test("longestsubstring"){
    Assert.assertEquals("bab", fixture.longestPalindrome("babad"))
    Assert.assertEquals("bbb", fixture.longestPalindrome("cbbbd"))
  }
}
