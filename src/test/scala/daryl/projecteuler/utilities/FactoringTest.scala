package daryl.projecteuler.utilities

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.utilities.Factoring._

@Test
class FactoringTest {

  @Test
  def testFactorsOf10 {
    assertEquals(4, Factoring(10))
  }

  @Test
  def testFactorsOf15 {
    assertEquals(4, Factoring(15))
  }

  @Test
  def testFactorsOf21 {
    assertEquals(4, Factoring(21))
  }

  @Test
  def testFactorsOf28 {
    assertEquals(6, Factoring(28))
  }

  @Test
  def testLargestPrimeFactor() = {
    assertEquals(BigInt(29), largestPrimeFactor(BigInt(13195)))
  }

  @Test
  def testSmallestPrimeFactor() = {
    assertEquals(Some(5), smallestPrimeFactor(BigInt(13195)))
  }
}