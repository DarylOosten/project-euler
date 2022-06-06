package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.ChampernownesConstant._

@Test
class ChampernownesConstantTest {

  @Test
  def solve {
    val powersOfTen = ChampernownesConstant.powersOfTen.take(7).toSet
    assertEquals(210, ChampernownesConstant(powersOfTen))
  }

  @Test
  def testChampernownes {
    assertEquals(Stream(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1),
      champernownes.take(25))
  }

  @Test
  def testPowersOfTen {
    assertEquals(Stream(1, 10, 100, 1000), powersOfTen.take(4))
  }

  @Test
  def testChampernownesConstant {
    assertEquals(24, ChampernownesConstant(Set(1, 2, 3, 4)))
  }
}