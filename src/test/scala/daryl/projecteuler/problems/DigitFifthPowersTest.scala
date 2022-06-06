package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.DigitFifthPowers._

@Test
class DigitFifthPowersTest {

  @Test
  def solve {
    assertEquals(443839, DigitFifthPowers(5));
  }
  
  @Test
  def testExample {
    assertEquals(19316, DigitFifthPowers(4));
  }
}