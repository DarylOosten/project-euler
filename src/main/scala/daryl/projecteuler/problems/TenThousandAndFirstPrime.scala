package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Primes

/**
 * 10001st prime
 * Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * 
 * Please note: the entire solution to this problem has been generalized to the Primes class in utilities.
 *
 * @see <a href="http://projecteuler.net/problem=7">Project Euler</a>
 * 
 * @author daryl
 */
object TenThousandAndFirstPrime {

  def apply(n: Int):Int = Primes(n)
}