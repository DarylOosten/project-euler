package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities._

/**
 * Smallest multiple
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * @see <a href="http://projecteuler.net/problem=5">Project Euler</a>
 *
 * @author daryl
 */
object SmallestMultiple {

  def apply(n: Int): Int = {
    (1 until n).reduce((a,b) => leastCommonDenominator(a,b))
  }
}