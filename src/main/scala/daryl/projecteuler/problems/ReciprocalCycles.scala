package daryl.projecteuler.problems

/**
 * Reciprocal cycles
 * Problem 26
 *
 * A unit fraction contains 1 in the numerator.
 * The decimal representation of the unit fractions with denominators 2 to 10 are given:
 *
 * 1/2	= 	0.5
 * 1/3	= 	0.(3)
 * 1/4	= 	0.25
 * 1/5	= 	0.2
 * 1/6	= 	0.1(6)
 * 1/7	= 	0.(142857)
 * 1/8	= 	0.125
 * 1/9	= 	0.(1)
 * 1/10	= 	0.1
 *
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 * It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 *
 * @see <a href="http://projecteuler.net/problem=26">Project Euler</a>
 *
 * @author daryl
 *
 */
object ReciprocalCycles {

  def apply(upperbound: Int): Int =
    if (upperbound < 4) -1
    else maxLongestCycle(lowerbound(upperbound), upperbound)

  /**
   * Determines the lowerbound for the search for the longest recurring cycle.
   * The lowerbound is the highest denominator lower than the upperbound which produces a cycle
   * that equals itself minus one. This works because the denominator is the 'space' through
   * which a recurrence cycles. So a recurring cycle cannot be longer than its denominator.
   * @param upperbound for which to find the lowerbound
   * @return the lowerbound.
   */
  def lowerbound(upperbound: Int): Int =
    (upperbound - 1 to 2 by -1)
      .find(n => lengthOfLongestCycle(n) + 1 == n)
      .getOrElse(2)

  def maxLongestCycle(lowerbound: Int, upperbound: Int): Int =
    (lowerbound until upperbound)
      .map(n => (n, lengthOfLongestCycle(n)))
      .reduce((a: (Int, Int), b: (Int, Int)) => if (a._2 > b._2) a else b)
      ._1

  def lengthOfLongestCycle(denominator: Int): Int = longestCycle(1, denominator).length

  def longestCycle(numerator: Int, denominator: Int,
    partial: List[(Int, Int)] = List(), aux: Set[(Int, Int)] = Set()): List[(Int, Int)] =
    if (numerator == 0) List()
    else if (aux.contains((numerator, denominator)))
      partial.slice(partial.indexOf((numerator, denominator)), partial.length)
    else longestCycle(numerator * 10 % denominator, denominator,
      partial :+ (numerator, denominator), aux + ((numerator, denominator)))
}