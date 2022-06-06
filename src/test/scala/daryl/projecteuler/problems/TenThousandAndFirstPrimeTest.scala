package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._

@Test
class TenThousandAndFirstPrimeTest {

  @Test
  def solve {
    assertEquals(104743, TenThousandAndFirstPrime(10000))
  }

}