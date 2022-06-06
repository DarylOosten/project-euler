package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SumSquareDifference._

@Test
class SumSquareDifferenceTest {

  @Test
  def solve {
    assertEquals(25164150, SumSquareDifference(100))
  }

  @Test
  def testSumSquareDifference {
    assertEquals(2640, SumSquareDifference(10))
  }

  @Test
  def testSquareOfSum {
    assertEquals(3025, squareOfSum(10))
  }

  @Test
  def testSumOfSquares {
    assertEquals(385, sumOfSquares(10))
  }
}