package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities

/**
 * Factorial digit sum
 * Problem 20
 *
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 *
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!
 *
 * @see <a href="http://projecteuler.net/problem=20">Project Euler</a>
 *
 * @author daryl
 */
object FactorialDigitSum {

  def apply(n: Int): Int = {
    Utilities.digits(Utilities.factorial(n)).sum
  }

}