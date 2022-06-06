package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.utilities.Factoring

@Test
class LargestPrimeFactorTest {
  
  @Test
  def solve {
    assertEquals(BigInt(6857), LargestPrimeFactor(BigInt(600851475143L)))
  }

}