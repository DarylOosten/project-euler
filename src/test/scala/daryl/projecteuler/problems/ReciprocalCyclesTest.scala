package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.ReciprocalCycles._

@Test
class ReciprocalCyclesTest {

  @Test
  def solveProblem =
    assertEquals(983, ReciprocalCycles(1000))

  @Test
  def solveExample =
    assertEquals(7, ReciprocalCycles(10))
    
  @Test
  def solveForEight =
    assertEquals(7, ReciprocalCycles(8))

  @Test
  def solveForSeven =
    assertEquals(6, ReciprocalCycles(7))

  @Test
  def solveForFour =
    assertEquals(3, ReciprocalCycles(4))

  @Test
  def solveForThree =
    assertEquals(-1, ReciprocalCycles(3))

  @Test
  def testLongestCycleOfOneOverTwo =
    assertEquals("", digitsOfLongestCycle(1, 2))

  @Test
  def testLongestCycleOfOneOverThree =
    assertEquals("3", digitsOfLongestCycle(1, 3))

  @Test
  def testLongestCycleOfOneOverFour =
    assertEquals("", digitsOfLongestCycle(1, 4))

  @Test
  def testLongestCycleOfOneOverFive =
    assertEquals("", digitsOfLongestCycle(1, 5))

  @Test
  def testLongestCycleOfOneOverSix =
    assertEquals("6", digitsOfLongestCycle(1, 6))

  @Test
  def testLongestCycleOfOneOverSeven =
    assertEquals("142857", digitsOfLongestCycle(1, 7))

  @Test
  def testLongestCycleOfOneOverEight =
    assertEquals("", digitsOfLongestCycle(1, 8))

  @Test
  def testLongestCycleOfOneOverNine =
    assertEquals("1", digitsOfLongestCycle(1, 9))

  @Test
  def testLongestCycleOfOneOverTen =
    assertEquals("", digitsOfLongestCycle(1, 10))

  @Test
  def testLongestCycleOfOneOverSeventeen =
    assertEquals("0588235294117647", digitsOfLongestCycle(1, 17))

  def digitsOfLongestCycle(numerator: Int, denominator: Int): String =
    longestCycle(numerator, denominator)
      .map((nd: (Int, Int)) => nd._1 * 10 / nd._2)
      .mkString
}