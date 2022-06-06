package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.MultiplesOfThreeAndFive._

@Test
class MultiplesOfThreeAndFiveTest {
  
  @Test
  def solve {
    assertEquals(233168, MultiplesOfThreeAndFive(1000))
  }

  @Test
  def testSumOccurencesOfProductsOfThreeAndFive {
    assertEquals(23, sumOccurencesOfProducts(3, 5, 9))
  }

  @Test
  def testOccurrencesOfProductsOfThree {
    assertEquals(18, sumOccurrencesOfProducts(3, 9))
  }

  @Test
  def testOccurrencesOfProductsOfFive {
    assertEquals(5, sumOccurrencesOfProducts(5, 9))
  }
}