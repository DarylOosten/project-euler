package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.CircularPrimes._

@Test
class CircularPrimesTest {

  @Test
  def solveProblem {
    assertEquals(55, CircularPrimes(1000*1000))
  }

  @Test
  def solveExample {
    assertEquals(13, CircularPrimes(100))
  }

  @Test
  def testMultiDigitPrimes {
    assertEquals(Set(), multiDigitPrimes(9))
    assertEquals(Set(11, 13, 17, 31, 37, 71, 73, 79, 97), multiDigitPrimes(99))
    assertEquals(Set(11, 13, 17, 31, 37, 71, 73, 79, 97, 113, 131, 197, 199),
      multiDigitPrimes(200))
  }

  @Test
  def testRotationsArePrimes {
    assertTrue(rotationsArePrime(List(7)))
    assertTrue(rotationsArePrime(List(1, 1)))
    assertTrue(rotationsArePrime(List(1, 9, 7)))
    assertFalse(rotationsArePrime(List(8)))
    assertFalse(rotationsArePrime(List(1, 9)))
    assertFalse(rotationsArePrime(List(1, 2, 7)))
  }

  @Test
  def testRotations {
    assertEquals(Set(List()), rotations(List()))
    assertEquals(Set(List(1)), rotations(List(1)))
    assertEquals(Set(List(1, 2), List(2, 1)), rotations(List(1, 2)))
    assertEquals(Set(List(1, 2, 3), List(2, 3, 1), List(3, 1, 2)),
      rotations(List(1, 2, 3)))
  }
  
  @Test
  def testCombinations {
    assertEquals(List(List(0, 0)), combinations(List(0))(2).toList)
    assertEquals(List(List(0, 0), List(0, 1), List(1, 1)), combinations(List(0, 1))(2).toList)

    assertEquals(List(List(0, 0, 0)), combinations(List(0))(3).toList)
    assertEquals(
      List(List(0, 0, 0), List(0, 0, 1), List(0, 1, 1), List(1, 1, 1)),
      combinations(List(0, 1))(3).toList)
  }

  @Test
  def testToInt {
    assertEquals(0, toInt(List(0)))
    assertEquals(1, toInt(List(1)))
    assertEquals(11, toInt(List(1, 1)))
  }
}