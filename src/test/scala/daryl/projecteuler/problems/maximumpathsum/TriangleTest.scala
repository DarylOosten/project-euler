package daryl.projecteuler.problems.maximumpathsum

import org.junit._
import org.junit.Assert._

@Test
class TriangleTest {
  @Test
  def testFromInts {
    val numbers = Seq(
      Seq(3),
      Seq(7, 4),
      Seq(2, 4, 6),
      Seq(8, 5, 9, 3))
    assertEquals(23, Triangle(numbers))
  }
}