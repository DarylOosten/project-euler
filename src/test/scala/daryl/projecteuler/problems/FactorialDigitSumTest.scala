package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.FactorialDigitSum._

@Test
class FactorialDigitSumTest {

  @Test
  def solve {
    assertEquals(648, FactorialDigitSum(100))
  }

  @Test
  def testSumOfFactorial {
    assertEquals(27, FactorialDigitSum(10))
  }
}