package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LatticePaths._

@Test
class LatticePathsTest {

  @Test
  def solve {
    assertEquals(137846528820l, LatticePaths(20))
  }

  @Test
  def testRoutes1 {
    assertEquals(2, LatticePaths(1))
  }

  @Test
  def testRoutes2 {
    assertEquals(6, LatticePaths(2))
  }

  @Test
  def testRoutes3 {
    assertEquals(20, LatticePaths(3))
  }

  @Test
  def testRoutes4 {
    assertEquals(70, LatticePaths(4))
  }

  @Test
  def testRoutes5 {
    assertEquals(252, LatticePaths(5))
  }
}