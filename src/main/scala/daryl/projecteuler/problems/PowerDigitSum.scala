package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities

/**
 * Power digit sum
 * Problem 16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 *
 * @see <a href="http://projecteuler.net/problem=16">Project Euler</a>
 *
 * @author daryl
 */
object PowerDigitSum {

  def apply(n: BigInt, p: Int): Int = {
    Utilities.digits(n.pow(p)).sum
  }
}