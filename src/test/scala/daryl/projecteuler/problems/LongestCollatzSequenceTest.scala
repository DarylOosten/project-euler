package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LongestCollatzSequence._

@Test
class LongestCollatzSequenceTest {

  @Test
  def solve {
    assertEquals(837799, LongestCollatzSequence(1000 * 1000))
  }

  @Test
  def testLongestCollatzSequence {
    assertEquals(9, LongestCollatzSequence(10))
  }

  @Test
  def testCollatzSequence {
    assertEquals(10, collatzSequence(13))
  }

  @Test
  def testNextCollatz {
    assertEquals(BigInt(40), nextCollatz(13))
    assertEquals(BigInt(20), nextCollatz(40))
    assertEquals(BigInt(10), nextCollatz(20))
    assertEquals(BigInt(5), nextCollatz(10))
    assertEquals(BigInt(16), nextCollatz(5))
    assertEquals(BigInt(8), nextCollatz(16))
    assertEquals(BigInt(4), nextCollatz(8))
    assertEquals(BigInt(2), nextCollatz(4))
    assertEquals(BigInt(1), nextCollatz(2))

    assertEquals(BigInt(0), nextCollatz(0))
  }
}