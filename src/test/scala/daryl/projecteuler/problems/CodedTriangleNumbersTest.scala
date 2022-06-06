package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.CodedTriangleNumbers._
import daryl.projecteuler.utilities.Files

@Test
class CodedTriangleNumbersTest {

  @Test
  def solve {
    assertEquals(162, CodedTriangleNumbers(Files.flatQuotedCsv("src/main/resources/words.txt")))
  }

  @Test
  def testIsTriangleWord {
    assertTrue(isTriangleWord("SKY"))
  }

  @Test
  def testTriangularRoot {
    assertTrue(isTriangle(1))
    assertFalse(isTriangle(2))
    assertTrue(isTriangle(3))
    assertFalse(isTriangle(4))
    assertFalse(isTriangle(5))
    assertTrue(isTriangle(6))
    assertFalse(isTriangle(7))
    assertFalse(isTriangle(8))
    assertFalse(isTriangle(9))
    assertTrue(isTriangle(10))
  }
}