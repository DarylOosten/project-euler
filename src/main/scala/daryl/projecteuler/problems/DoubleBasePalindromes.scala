package daryl.projecteuler.problems

/**
 * Double-base palindromes
 * Problem 36
 *
 * The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
 *
 * Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
 *
 * (Please note that the palindromic number, in either base, may not include leading zeros.)
 *
 * @see <a href="http://projecteuler.net/problem=36">Project Euler</a>
 *
 * @author daryl
 */
object DoubleBasePalindromes {

  def apply(upperBound: Int, bases: Set[Int]): Int =
    (0 until upperBound).filter(palindromes(bases)).sum;

  def palindromes(bases: Set[Int])(n: Int): Boolean =
    bases.map(palindrome(n)).find(!_).isEmpty;

  def palindrome(n: Int)(base: Int): Boolean = {
    val s = Integer.toString(n, base);
    return s == s.reverse;
  }
}