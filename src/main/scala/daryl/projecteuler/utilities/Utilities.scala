package daryl.projecteuler.utilities

import scala.math.BigInt.int2bigInt

/**
 * Various utilities reused throughout the problems.
 *
 * @author daryl
 *
 */
object Utilities {

  def sqrt(number: BigInt): BigInt = {
    def next(n: BigInt, i: BigInt): BigInt = (n + i / n) >> 1

    val one = BigInt(1)

    var n = one
    var n1 = next(n, number)

    while ((n1 - n).abs > one) {
      n = n1
      n1 = next(n, number)
    }

    while (n1 * n1 > number) {
      n1 -= one
    }

    n1
  }

  def squared(n: Int): Int = n * n

  def squared(n: BigInt): BigInt = n * n

  def selfPower(n: Int): BigInt = BigInt(n).pow(n)

  def leastCommonDenominator(a: Int, b: Int): Int = {
    a * b / greatestCommonDivisor(a, b)
  }

  def greatestCommonDivisor(a: Int, b: Int): Int = {
    if (b == 0) a
    else greatestCommonDivisor(b, a % b)
  }

  def factorial(x: BigInt): BigInt = {
    if (x == 1) 1
    else x * factorial(x - 1)
  }

  def digits(n: Int): Seq[Int] = digits(BigInt(n))

  def digits(n: BigInt): Seq[Int] = {
    def recur(n: BigInt, s: Seq[Int]): Seq[Int] = {
      if (n == 0) s
      else recur(n / 10, s) :+ (n % 10).toInt
    }
    if (n == 0) Seq(0)
    else recur(n, Seq())
  }
}