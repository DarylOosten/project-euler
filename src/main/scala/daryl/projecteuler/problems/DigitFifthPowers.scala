package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities

/**
 * Digit fifth powers
 * Problem 30
 *
 * Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
 *
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
 *
 * As 1 = 14 is not a sum it is not included.
 *
 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 *
 * @see <a href="http://projecteuler.net/problem=30">Project Euler</a>
 *
 * @author daryl
 */
object DigitFifthPowers {

  def apply(power: Int): Int =
    (2 to upperbound(power)).filter(isSumOfDigitPowers(power)).sum

  def isSumOfDigitPowers(power: Int)(n: Int): Boolean =
    n.toString.map(d => BigInt(d.asDigit).pow(power).toInt).sum == n

  def upperbound(power: Int): Int =
    BigInt(9).pow(power).toString.length * BigInt(9).pow(power).toInt
}