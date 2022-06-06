package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.DoubleBasePalindromes._

@Test
class DoubleBasePalindromesTest {

  @Test
  def solve {
    assertEquals(872187, DoubleBasePalindromes(1e6.toInt, Set(2, 10)));
  }

  @Test
  def testApply {
    assertEquals(25, DoubleBasePalindromes(10, Set(2, 10)));
  }
}