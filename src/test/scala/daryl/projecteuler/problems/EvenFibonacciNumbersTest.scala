package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.EvenFibonacciNumbers._

@Test
class EvenFibonacciNumbersTest {

  @Test
  def solve {
    assertEquals(BigInt(4613732), EvenFibonacciNumbers(4 * 1000 * 1000))
  }

  @Test
  def testSumOfEvenFibonacci {
    assertEquals(BigInt(10), EvenFibonacciNumbers(10))
  }
}