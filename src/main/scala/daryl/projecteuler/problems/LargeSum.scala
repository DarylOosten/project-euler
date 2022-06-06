package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Files

/**
 * Large sum
 * Problem 13
 *
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *
 * 37107287533902102798797998220837590246510135740250
 * 46376937677490009712648124896970078050417018260538
 * 74324986199524741059474233309513058123726617309629
 * 919422133635741615...
 *
 * @see <a href="http://projecteuler.net/problem=13">Project Euler</a>
 *
 * @author daryl
 */
object LargeSum {

  def apply(numbers: Seq[BigInt]): BigInt = {
    firstDigits(numbers.sum, 10)
  }

  def firstDigits(i: BigInt, n: Int): BigInt = {
    BigInt(i.toString.take(n))
  }
}