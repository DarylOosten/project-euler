package daryl.projecteuler.problems

/**
 * Largest palindrome product
 * Problem 4
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @see <a href="http://projecteuler.net/problem=4">Project Euler</a>
 *
 * @author daryl
 */
object LargestPalindromeProduct {

  def apply(min: Int, max: Int): Int =
    products(min, max).filter(isPalindrome).max;

  def products(min: Int, max: Int): Stream[Int] = {
    for {
      n <- (max until min by -1).toStream;
      m <- (min to n)
    } yield n * m
  }

  def isPalindrome(n: Int): Boolean = {
    val s = n.toString();
    return s == s.reverse;
  }
}