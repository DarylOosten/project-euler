package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Primes

/**
 * Circular primes
 * Problem 35
 *
 * The number, 197, is called a circular prime
 * because all rotations of the digits: 197, 971, and 719, are themselves prime.
 *
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 *
 * How many circular primes are there below one million?
 *
 * @see <a href="http://projecteuler.net/problem=35">Project Euler</a>
 *
 * @author daryl
 *
 */
object CircularPrimes {

  /**
   * Multi-digit circular primes can only contain the digits 1, 3, 7, and 9.
   * If it would contain a 0, 2, 4, 6, or 8 then that would end up at the end of the number at one of the rotations.
   * Which means that rotation is not a prime, as it is divisible by 2.
   * The same goes for 5, but it would be divisible by 5.
   */
  val primeDigits = List(1, 3, 7, 9)

  val singleDigitPrimes = List(2, 3, 5, 7)

  /**
   * @param upperbound is exclusive.
   * @return the number of circular primes below the upperbound.
   */
  def apply(upperbound: Int): Int =
    singleDigitPrimes.filter(_ < upperbound).length + multiDigitPrimes(upperbound).size

  def multiDigitPrimes(upperbound: Int): Set[Int] =
    combinations(primeDigits, 2, upperbound.toString.length)
      .flatMap(_.permutations)
      .filter(rotationsArePrime)
      .map(toInt)
      .filter(_ < upperbound)
      .toSet

  def rotationsArePrime(digits: List[Int]): Boolean =
    Primes.arePrimes(rotations(digits).map(toInt))

  def rotations(digits: List[Int]): Set[List[Int]] = {
    def recur(digits: List[Int], n: Int): Set[List[Int]] = {
      if (n < 2) return Set(digits)
      else return recur(digits.tail :+ digits.head, n - 1) + digits
    }
    recur(digits, digits.length).toSet
  }

  def combinations(digits: List[Int], min: Int, max: Int): Iterator[List[Int]] =
    (min to max).flatMap(combinations(digits)).toIterator

  def combinations(digits: List[Int])(n: Int): Iterator[List[Int]] =
    (List.fill(n)(digits)).flatten.combinations(n)

  def toInt(digits: List[Int]): Int = digits.mkString.toInt
}