package daryl.projecteuler.problems

import scala.collection.mutable.HashMap

/**
 * Longest Collatz sequence
 * Problem 14
 *
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * @see <a href="http://projecteuler.net/problem=14">Project Euler</a>
 *
 * @author daryl
 */
object LongestCollatzSequence {

  private val knownSolutions = HashMap[Long, Int]()

  def apply(max: Int): Int = {
    (1 until max).reduce((a: Int, b: Int) =>
      if (collatzSequenceMemo(a) > collatzSequenceMemo(b)) a else b)
  }

  def collatzSequenceMemo(n: Long): Int = {
    knownSolutions.getOrElseUpdate(n, collatzSequence(n))
  }

  def collatzSequence(n: Long): Int = {
    if (n == 1) 1
    else collatzSequenceMemo(nextCollatz(n)) + 1
  }

  def nextCollatz(n: Long): Long = {
    if (n % 2 == 0) n / 2
    else 3 * n + 1
  }
}