package daryl.projecteuler.problems.maximumpathsum

import org.junit._
import org.junit.Assert._

@Test
class MaximumPathSumIITest {
  
  @Test
  def testMaximumPathSumII {
    assertEquals(7273, MaximumPathSumII("src/main/resources/triangle.txt"))
  }
  
}