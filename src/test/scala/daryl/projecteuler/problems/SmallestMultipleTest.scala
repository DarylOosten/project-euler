package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SmallestMultiple._

@Test
class SmallestMultipleTest {

  @Test
  def solve {
    assertEquals(232792560, SmallestMultiple(20))
  }
  
  @Test
  def testSmallestEvenlyDivisible {
    assertEquals(2520, SmallestMultiple(10))
  }
}