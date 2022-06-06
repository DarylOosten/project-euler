package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SummationOfPrimes._

@Test
class SummationOfPrimesTest {

  @Test
  def solve {
    assertEquals(BigInt(142913828922L), SummationOfPrimes(2 * 1000 * 1000))
  }

  @Test
  def testSumOfPrimes {
    assertEquals(BigInt(17), SummationOfPrimes(10))
  }
}