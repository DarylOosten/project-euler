package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.NumberSpiralDiagonals._

@Test
class NumberSpiralDiagonalsTest {

  @Test
  def solve {
    assertEquals(669171001, NumberSpiralDiagonals(1001))
  }
  
  @Test
  def testSumOfDiagonalsWithLength1 {
    assertEquals(1, NumberSpiralDiagonals(1))
  }

  @Test
  def testSumOfDiagonalsWithLength3 {
    assertEquals(25, NumberSpiralDiagonals(3))
  }

  @Test
  def testSumOfDiagonalsWithLength5 {
    assertEquals(101, NumberSpiralDiagonals(5))
  }

  @Test
  def testSumOfDiagonalsWithLength7 {
    assertEquals(261, NumberSpiralDiagonals(7))
  }

  @Test
  def testSumOfDiagonalsWithLength9 {
    assertEquals(537, NumberSpiralDiagonals(9))
  }

  @Test
  def testSumOfDiagonalsWithLength11 {
    assertEquals(961, NumberSpiralDiagonals(11))
  }
}