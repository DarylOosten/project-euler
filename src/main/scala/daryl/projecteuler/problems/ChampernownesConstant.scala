package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Utilities

/**
 * Champernowne's constant
 * Problem 40
 *
 * An irrational decimal fraction is created by concatenating the positive integers:
 *
 * 0.123456789101112131415161718192021...
 *
 * It can be seen that the 12th digit of the fractional part is 1.
 *
 * If dn represents the nth digit of the fractional part, find the value of the following expression.
 *
 * d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 *
 * @see <a href="http://projecteuler.net/problem=40">Project Euler</a>
 *
 * @author daryl
 */
object ChampernownesConstant {

  val champernownes: Stream[Int] = Stream.from(0).flatMap(Utilities.digits)

  val powersOfTen: Stream[Int] = Stream.from(0).map(n => BigInt(10).pow(n).toInt)

  def apply(d: Set[Int]): Int = d.map(champernownes).product
}