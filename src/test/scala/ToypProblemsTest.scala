package toyproblems

import org.junit.Assert
import org.scalatest.funsuite.AnyFunSuite
import toyproblems.ToyProblems.SubrectangleQueries

class ToypProblemsTest extends AnyFunSuite{

  test("final prices"){
    Assert.assertArrayEquals(ToyProblems.finalPrices(Array(8,4,6,2,3)), Array(4,2,4,2,3))
    Assert.assertArrayEquals(ToyProblems.finalPrices(Array(1,2,3,4,5)), Array(1,2,3,4,5))
    Assert.assertArrayEquals(ToyProblems.finalPrices(Array(10,1,1,6)), Array(9,0,1,6))
    Assert.assertArrayEquals(ToyProblems.finalPrices(Array(1,1,1,1)), Array(0,0,0,1))
  }

  test("Subrectangle Queries"){
    //would probably just rewrite this to make it more testable or use reflection
    val fixture = new SubrectangleQueries(Array(Array(1,2,1),Array(4,3,4),Array(3,2,1),Array(1,1,1)))
    Assert.assertEquals(fixture.getValue(0,2), 1)
    fixture.updateSubrectangle(0,0,3,2,5)
  }

}
