package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Primes

/**
 * Summation of primes
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * @see <a href="http://projecteuler.net/problem=10">Project Euler</a>
 *
 * @author daryl
 */
object SummationOfPrimes {

  def apply(max: Int): BigInt = {
    Primes.primes.takeWhile(_ < max).map(BigInt(_)).sum
  }
}