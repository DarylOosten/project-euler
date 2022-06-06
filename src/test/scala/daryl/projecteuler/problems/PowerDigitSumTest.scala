package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.PowerDigitSum._

@Test
class PowerDigitSumTest {

  @Test
  def solve {
    assertEquals(1366, PowerDigitSum(2, 1000))
  }

  @Test
  def testPowerDigitSum {
    assertEquals(26, PowerDigitSum(2, 15))
  }
}