package daryl.projecteuler.utilities

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.utilities.Primes._

@Test
class PrimesTest {

  @Test
  def testPrimes {
    assertEquals(List(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), primes.take(10).toList)
  }

  @Test
  def testIsPrime {
    assertFalse(isPrime(1))
    assertTrue(isPrime(2))
    assertTrue(isPrime(3))
    assertFalse(isPrime(4))
    assertTrue(isPrime(5))
    assertFalse(isPrime(6))
    assertTrue(isPrime(7))
    assertFalse(isPrime(8))
    assertFalse(isPrime(9))
    assertFalse(isPrime(10))
  }

  @Test
  def testArePrimes {
    assertTrue(arePrimes(Set(2, 3, 5)))
    assertFalse(arePrimes(Set(1, 4, 6)))
    assertFalse(arePrimes(Set(1, 2, 3)))
  }

  @Test
  def testApply {
    assertEquals(17, Primes(6))
  }
}