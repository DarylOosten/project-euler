package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SquareDigitChains._

@Test
class SquareDigitChainsTest {

  @Test
  def solve {
    assertEquals(8581146, SquareDigitChains(10 * 1000 * 1000))
  }
  
  @Test
  def testSquareDigitChains {
    assertEquals(80, SquareDigitChains(100))
  }

  @Test
  def testSquareDigits44 {
    assertEquals(32, squareDigits(44))
  }

  @Test
  def testSquareDigits32 {
    assertEquals(13, squareDigits(32))
  }

  @Test
  def testSquareDigits13 {
    assertEquals(10, squareDigits(13))
  }

  @Test
  def testSquareDigits10 {
    assertEquals(1, squareDigits(10))
  }

  @Test
  def testSquareDigits1 {
    assertEquals(1, squareDigits(1))
  }

  @Test
  def testSquareDigits85 {
    assertEquals(89, squareDigits(85))
  }

  @Test
  def testSquareDigits89 {
    assertEquals(145, squareDigits(89))
  }

  @Test
  def testSquareDigits145 {
    assertEquals(42, squareDigits(145))
  }

  @Test
  def testSquareDigits42 {
    assertEquals(20, squareDigits(42))
  }

  @Test
  def testSquareDigits20 {
    assertEquals(4, squareDigits(20))
  }

  @Test
  def testSquareDigits4 {
    assertEquals(16, squareDigits(4))
  }

  @Test
  def testSquareDigits16 {
    assertEquals(37, squareDigits(16))
  }

  @Test
  def testSquareDigits37 {
    assertEquals(58, squareDigits(37))
  }

  @Test
  def testSquareDigits58 {
    assertEquals(89, squareDigits(58))
  }
}