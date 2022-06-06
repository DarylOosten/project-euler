package daryl.projecteuler.problems

/**
 * Counting summations
 * Problem 76
 *
 * It is possible to write five as a sum in exactly six different ways:
 *
 * 4 + 1
 * 3 + 2
 * 3 + 1 + 1
 * 2 + 2 + 1
 * 2 + 1 + 1 + 1
 * 1 + 1 + 1 + 1 + 1
 *
 * How many different ways can one hundred be written as a sum of at least two positive integers?
 *
 * @see <a href="http://projecteuler.net/problem=76">Project Euler</a>
 *
 * @author daryl
 *
 */
object CountingSummations {

  def apply(n: Int): Int = partition(n) - 1

  /**
   * Uses Euler's generating function to count the summations of k: 
   * 
   * p(k) = p(k − 1) + p(k − 2) − p(k − 5) − p(k − 7) + p(k − 12) + p(k − 15) − p(k − 22) − ...
   * 
   * p(0) = 1 is a special case needed to kickstart calculations.
   * 
   * @see <a href="https://en.wikipedia.org/wiki/Partition_%28number_theory%29#Generating_function">The generating function of partitions</a>
   */
  val partition: Stream[Int] = Stream.cons(1, Stream.from(1).map(
    k => pentagonals.takeWhile(_ <= k).map(p => partition(k - p)).zip(posNegPairs).map(t => t._1 * t._2).sum))

  /**
   * Stream of generalized pentagonal numbers.
   * Same as regular pentagonal numbers: p(n) = (3 * n^2 - n) / 2
   * except n is from 1, -1, 2, -2, 3, -3...
   */
  val pentagonals = Stream.from(1).flatMap(n => Array(n, n * -1)).map(n => (3 * n * n - n) / 2)

  val posNegPairs: Stream[Int] = Stream.continually(Seq(1, 1, -1, -1)).flatten
}