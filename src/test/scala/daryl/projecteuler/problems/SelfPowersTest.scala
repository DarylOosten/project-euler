package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.SelfPowers._

@Test
class SelfPowersTest {

  @Test
  def solve {
    assertEquals(BigInt(9110846700L), SelfPowers(1000, 10))
  }

  @Test
  def testSumOfSelfPowers() = {
    assertEquals(BigInt(405071317L), SelfPowers(10, 10))
  }
}