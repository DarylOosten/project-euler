package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.HighlyDivisibleTriangularNumber._

@Test
class HighlyDivisibleTriangularNumberTest {

  @Test
  def solve {
    assertEquals(76576500, HighlyDivisibleTriangularNumber(500))
  }

  @Test
  def testTriangleOf {
    assertEquals(28, triangle(7))
  }

  @Test
  def testFirstTriangle {
    assertEquals(28, HighlyDivisibleTriangularNumber(5))
  }

  @Test
  def testTriangleWithFactorsOf {
    assertEquals((28, 6), triangleWithFactorsOf(7))
  }

  @Test
  def testTriangleFactors {
    assertEquals(List((1, 0), (3, 2), (6, 4), (10, 4), (15, 4), (21, 4), (28, 6)),
      triangleFactors.take(7).toList)
  }
}