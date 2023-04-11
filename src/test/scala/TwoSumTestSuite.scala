package twosum

import org.scalatest.funsuite.AnyFunSuite
import org.junit.Assert

class TwoSumTestSuite extends AnyFunSuite{
  test("addition"){
    Assert.assertArrayEquals(TwoSum.twoSum(Array(2,7,11,15), 9), Array(0,1))
  }
}
