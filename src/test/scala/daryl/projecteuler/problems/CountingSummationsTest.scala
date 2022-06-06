package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.CountingSummations._

@Test
class CountingSummationsTest {

  @Test
  def solve {
    assertEquals(190569291, CountingSummations(100))
  }

  @Test
  def testPartition {
    assertEquals(Seq(1, 1, 2, 3, 5, 7, 11, 15, 22, 30), partition.take(10))
  }

  @Test
  def testPentagonals {
    assertEquals(Seq(1, 2, 5, 7, 12, 15, 22, 26, 35, 40), pentagonals.take(10))
  }
}