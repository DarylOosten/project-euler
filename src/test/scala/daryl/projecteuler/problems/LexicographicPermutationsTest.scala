package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LexicographicPermutations._

@Test
class LexicographicPermutationsTest {

  @Test
  def solve {
    assertEquals("2783915460", LexicographicPermutations("0123456789", 1000 * 1000))
  }

  @Test
  def testNthPermutation {
    assertEquals("210", LexicographicPermutations("012", 6))
  }
}