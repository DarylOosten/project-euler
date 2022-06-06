package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.XorDecryption._
import daryl.projecteuler.utilities.Files

@Test
class XorDecryptionTest {

  @Test
  def solve {
    val encrypted = Files.flatCsvInts("src/main/resources/cipher1.txt")
    assertEquals(107359, XorDecryption(encrypted, 3))
  }

  val plaintext = ("To be, or not to be, that is the question— " +
    "Whether 'tis Nobler in the mind to suffer " +
    "The Slings and Arrows of outrageous Fortune, " +
    "Or to take Arms against a Sea of troubles,").toCharArray.map(c => c.toInt).toSeq

  val encrypted = Seq(50, 0, 79, 4, 10, 67, 70, 0, 29, 70, 1, 0, 18, 79, 27, 9, 79, 13,
    3, 67, 79, 18, 7, 14, 18, 79, 6, 21, 79, 27, 14, 10, 79, 23, 26, 10, 21, 27, 6, 9,
    1, 8315, 70, 56, 7, 3, 27, 7, 3, 29, 79, 65, 27, 6, 21, 79, 33, 9, 13, 3, 3, 29, 79,
    15, 1, 79, 18, 7, 10, 70, 2, 6, 8, 11, 79, 18, 0, 79, 21, 26, 9, 0, 10, 29, 70, 59,
    7, 3, 79, 60, 10, 6, 1, 1, 28, 79, 7, 1, 11, 70, 46, 29, 20, 0, 24, 21, 79, 0, 0, 79,
    0, 19, 27, 29, 7, 8, 10, 9, 26, 28, 70, 41, 0, 20, 27, 26, 8, 10, 67, 70, 32, 29, 70,
    27, 0, 70, 27, 14, 13, 10, 79, 39, 29, 2, 21, 79, 14, 1, 14, 6, 8, 28, 27, 70, 14, 79,
    53, 10, 14, 70, 0, 9, 70, 27, 29, 9, 26, 13, 10, 10, 28, 74)

  val key = "foo".toCharArray.map(_.toInt).toSeq

  @Test
  def testDecryptAndSum {
    assertEquals(23608, XorDecryption(encrypted, key.length))
  }

  @Test
  def testDecrypt {
    assertEquals(plaintext, decrypt(encrypted, key))
  }

  @Test
  def testExtractKey {
    assertEquals(key, extractKey(encrypted, key.length))
  }
}