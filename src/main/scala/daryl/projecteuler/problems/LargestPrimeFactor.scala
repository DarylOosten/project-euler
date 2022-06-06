package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Factoring

/**
 * Largest prime factor
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 *
 * Please note: the solution to this problem has been generalized to the Factoring class in utilities.
 *
 * @see <a href="http://projecteuler.net/problem=3">Project Euler</a>
 *
 * @author daryl
 */
object LargestPrimeFactor {

  def apply(n:BigInt): BigInt = Factoring.largestPrimeFactor(n)
}