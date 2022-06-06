package daryl.projecteuler.problems

/**
 * Square digit chains
 * Problem 92
 *
 * A number chain is created by continuously adding the square of the digits in a number
 * to form a new number until it has been seen before.
 *
 * For example,
 *
 * 44 → 32 → 13 → 10 → 1 → 1
 * 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
 *
 * Therefore any chain that arrives at 1 or 89 will become stuck in an endless loop.
 * What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.
 *
 * How many starting numbers below ten million will arrive at 89?
 *
 * @see <a href="http://projecteuler.net/problem=92">Project Euler</a>
 *
 * @author daryl
 */
object SquareDigitChains {

  def apply(upperbound: Int): Int = {
    val secondUpperbound = squareDigits(upperbound - 1)
    val cache = new Array[Int](secondUpperbound)
    cache(1) = -1
    cache(89) = 1

    def leadsTo89(n: Int): Int = {
      if (n >= secondUpperbound) leadsTo89(squareDigits(n))
      else if (cache(n) != 0) cache(n)
      else { val v = leadsTo89(squareDigits(n)); cache(n) = v; v }
    }

    (1 until upperbound).map(n => leadsTo89(n) + 1).sum / 2
  }

  def squareDigits(n: Int): Int = {
    if (n == 0) 0
    else (n % 10) * (n % 10) + squareDigits(n / 10)
  }
}