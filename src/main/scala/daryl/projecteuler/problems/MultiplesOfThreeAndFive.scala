package daryl.projecteuler.problems

/**
 * Multiples of 3 and 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see <a href="http://projecteuler.net/problem=1">Project Euler</a>
 * 
 * @author daryl
 */
object MultiplesOfThreeAndFive {

  def apply(max: Int): Int = {
    sumOccurencesOfProducts(3, 5, max - 1)
  }

  def sumOccurencesOfProducts(a: Int, b: Int, max: Int): Int = {
    val union = sumOccurrencesOfProducts(a, max) + sumOccurrencesOfProducts(b, max)
    union - sumOccurrencesOfProducts(a * b, max)
  }

  /**
   * Uses arithmetic progression to calculate the sum of the occurrences of the products of n below max.
   *
   * @param n for which the occurrences of its products are to be summed.
   * @param max upperbound of n
   * @return the sum of the occurrences of products of n in {1 ... max}
   */
  def sumOccurrencesOfProducts(n: Int, max: Int): Int = {
    val p = max / n
    n * (p * (p + 1)) / 2
  }
}