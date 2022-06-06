package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.ThousandDigitFibonacciNumber._

@Test
class ThousandDigitFibonacciNumberTest {

  @Test
  def solve {
    assertEquals(4782, ThousandDigitFibonacciNumber(1000))
  }

  @Test
  def testFirstTerm {
    assertEquals(12, ThousandDigitFibonacciNumber(3))
  }
}