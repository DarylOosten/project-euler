package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LargestProductInASeries._

@Test
class LargestProductInASeriesTest {

  @Test
  def solve {
    assertEquals(40824, LargestProductInASeries(5))
  }

  @Test
  def testProductOfHighestScoringSeries {
    assertEquals(40824, LargestProductInASeries(5))
  }

  @Test
  def testHighestScoringSeries {
    assertEquals(List(9, 9, 8, 7, 9), highestScoringSeries(5))
  }

  @Test
  def testScoredSeries {
    assertEquals((List(7, 3, 1, 6, 7), 24), scoredSeries(5).head)
  }

  @Test
  def testSeries {
    assertEquals(List(7, 3, 1, 6, 7), series(5).head)
    assertEquals(List(3, 1, 6, 7, 1), series(5)(1))
    assertEquals(List(6, 3, 4, 5, 0), series(5).last)
  }
}