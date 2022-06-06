package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.NamesScores._
import daryl.projecteuler.utilities.Files

@Test
class NamesScoresTest {

  @Test
  def solve {
    assertEquals(871198282, NamesScores(Files.flatQuotedCsv("src/main/resources/names.txt")))
  }

  @Test
  def testNamesScores {
    assertEquals(2970, NamesScores(Files.flatQuotedCsv("src/test/resources/names.txt")))
  }

  @Test
  def testNamesFrom {
    assertEquals(List("MARY", "PATRICIA", "LINDA", "BARBARA", "ELIZABETH",
      "JENNIFER", "MARIA", "SUSAN", "MARGARET"),
      Files.quotedCsv("src/test/resources/names.txt").flatten)
  }

  @Test
  def testScore {
    assertEquals(49714, score("COLIN", 937))
  }
}