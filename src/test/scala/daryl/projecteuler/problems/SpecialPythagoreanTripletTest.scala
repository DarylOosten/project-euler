package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SpecialPythagoreanTriplet._

@Test
class SpecialPythagoreanTripletTest {

  @Test
  def solve {
    assertEquals(31875000, SpecialPythagoreanTriplet(1000))
  }

  @Test
  def testProductsOfSpecialPythagoreanTriplets {
    assertEquals(1620, productsOfSpecialPythagoreanTriplets(36).head)
  }

  @Test
  def testSpecialPythagoreanTriplets {
    assertEquals((9, 12, 15), specialPythagoreanTriplets(36).head)
  }
}