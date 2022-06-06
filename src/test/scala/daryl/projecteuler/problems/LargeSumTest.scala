package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LargeSum._
import daryl.projecteuler.utilities.Files

@Test
class LargeSumTest {

  @Test
  def solve {
    assertEquals(BigInt(5537376230L), LargeSum(Files.bigIntLines("src/main/resources/largeSum.txt")))
  }

  @Test
  def testFirstTenDigits {
    assertEquals(BigInt(2222222211L), LargeSum(Files.bigIntLines("src/test/resources/largeSum.txt")))
  }

  @Test
  def testFirstDigits {
    assertEquals(BigInt(123), firstDigits(BigInt(1234567890), 3))
  }
}