package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LargestProductInAGrid._

@Test
class LargestProductInAGridTest {

  @Test
  def solve {
    assertEquals(70600674, LargestProductInAGrid(new Grid(numbers), 4))
  }

  val grid = new Grid(Seq(
    Seq(1, 2, 3),
    Seq(4, 5, 6),
    Seq(7, 8, 9)))

  @Test
  def testMaxProductOfSequences {
    assertEquals(72, LargestProductInAGrid(grid, 2))
  }

  @Test
  def testGridGetCoordinates {
    val coords = Seq(
      (0, 0), (0, 1), (0, 2),
      (1, 0), (1, 1), (1, 2),
      (2, 0), (2, 1), (2, 2))

    assertEquals(coords, grid.getCoordinates)
  }

  @Test
  def testGridGetSequencesInAllDirections {
    assertEquals(Seq(Seq(5, 6), Seq(5, 8), Seq(5, 7), Seq(5, 9)),
      grid.getSequencesInAllDirections(Seq((1, 1)), 2))
  }

  @Test
  def testGridGetSequenceRightFrom {
    assertEquals(Seq(5, 6), grid.getSequence((1, 1), 2, (x: Int, y: Int, d: Int) => (x + d, y)))
  }

  @Test
  def testGridGetSequenceDownFrom {
    assertEquals(Seq(5, 8), grid.getSequence((1, 1), 2, (x: Int, y: Int, d: Int) => (x, y + d)))
  }

  @Test
  def testGridGetSequenceDiagonalLeftFrom {
    assertEquals(Seq(5, 7), grid.getSequence((1, 1), 2, (x: Int, y: Int, d: Int) => (x - d, y + d)))
  }

  @Test
  def testGetSequenceDiagonalRightFrom {
    assertEquals(Seq(5, 9), grid.getSequence((1, 1), 2, (x: Int, y: Int, d: Int) => (x + d, y + d)))
  }

  @Test
  def testGridGetTopLeftNumber {
    assertEquals(1, grid.getNumber((0, 0)))
  }

  @Test
  def testGridGetTopRightNumber {
    assertEquals(3, grid.getNumber((2, 0)))
  }

  @Test
  def testGridGetBottomLeftNumber {
    assertEquals(7, grid.getNumber((0, 2)))
  }

  @Test
  def testGridGetBottomRightNumber {
    assertEquals(9, grid.getNumber((2, 2)))
  }

  @Test
  def testGridGetInvalidNumber {
    assertEquals(0, grid.getNumber((3, 3)))
  }
}