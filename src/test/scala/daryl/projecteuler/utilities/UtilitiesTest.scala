package daryl.projecteuler.utilities

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.utilities.Utilities._

@Test
class UtilitiesTest {

  @Test
  def testLeastCommonDenominator {
    assertEquals(16, leastCommonDenominator(4, 16))
  }

  @Test
  def testGreatestCommonDivisor {
    assertEquals(4, greatestCommonDivisor(4, 16))
  }

  @Test
  def testFactorial {
    assertEquals(BigInt(3628800), factorial(10))
  }

  @Test
  def testDigitOfZero {
    assertEquals(Seq(0), digits(0))
  }

  @Test
  def testDigitOfOne {
    assertEquals(Seq(1), digits(1))
  }

  @Test
  def testDigitsOfTen {
    assertEquals(Seq(1, 0), digits(10))
  }

  @Test
  def testDigitsOfNinetyNine {
    assertEquals(Seq(9, 9), digits(99))
  }

  @Test
  def testDigitsOfHundred {
    assertEquals(Seq(1, 0, 0), digits(100))
  }

  @Test
  def testDigitsOfBigInt {
    assertEquals(Seq(4, 2, 9, 4, 9, 6, 7, 2, 9, 4), digits(BigInt(Int.MaxValue) * 2))
  }
}


