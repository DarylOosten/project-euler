package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities

/**
 * Sum square difference
 * Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 *
 * @see <a href="http://projecteuler.net/problem=6">Project Euler</a>
 * 
 * @author daryl
 */
object SumSquareDifference {

  def apply(n: Int): Int = {
    squareOfSum(n) - sumOfSquares(n)
  }

  def squareOfSum(n: Int): Int = {
    Utilities.squared((1 to n).sum)
  }

  def sumOfSquares(n: Int): Int = {
    (1 to n).map(x => x * x).sum
  }
}