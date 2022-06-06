package daryl.projecteuler.problems

import scala.math.BigInt
import daryl.projecteuler.utilities.Utilities

/**
 * Self powers
 * Problem 48
 *
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 *
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 *
 * @see <a href="http://projecteuler.net/problem=48">Project Euler</a>
 *
 * @author daryl
 */
object SelfPowers {

  def apply(max: Int, limit: Int): BigInt = {
    val series = Stream.from(1).take(max).map(n => insignificantDigits(Utilities.selfPower(n), limit))
    insignificantDigits(series.sum, limit)
  }

  def insignificantDigits(n: BigInt, limit: Int): BigInt = {
    BigInt(n.toString.takeRight(limit))
  }
}