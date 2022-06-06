package daryl.projecteuler.problems.maximumpathsum

import org.junit._
import org.junit.Assert._

@Test
class MaximumPathSumITest {

  @Test
  def solve {
    assertEquals(1074, MaximumPathSumI(MaximumPathSumI.triangle))
  }
}