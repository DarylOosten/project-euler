package daryl.projecteuler.problems

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.problems.LargestPalindromeProduct._

@Test
class LargestPalindromeProductTest {

  @Test
  def solve {
    assertEquals(906609, LargestPalindromeProduct(100, 999))
  }

  @Test
  def testLargestPalindromeProduct {
    assertEquals(9009, LargestPalindromeProduct(10, 99))
  }

  @Test
  def testProducts {
    assertEquals(List(120, 132, 144, 110, 121), products(10, 12).toList)
  }

  @Test
  def testIsPalindrome {
    assertTrue(isPalindrome(101))
    assertTrue(isPalindrome(11))
    assertFalse(isPalindrome(78))
  }
}