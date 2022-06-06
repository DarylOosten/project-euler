package daryl.projecteuler.utilities

import daryl.projecteuler.utilities.Primes._
import daryl.projecteuler.utilities.Utilities._

object Factoring {

  def apply(number: Int): Int = {
    val sqrt = math.ceil(math.sqrt(number.toDouble)).toInt
    (1 until sqrt).toStream.filter(i => number % i == 0).length * 2
  }

  def largestPrimeFactor(n: BigInt): BigInt = {
    smallestPrimeFactor(n) match {
      case None => n
      case Some(p) => largestPrimeFactor(n / p)
    }
  }

  def smallestPrimeFactor(n: BigInt): Option[BigInt] = {
    primes.takeWhile(p => p < sqrt(n)).filter(p => n % p == 0) match {
      case h #:: _ => Some(h)
      case _ => None
    }
  }
  
}