package daryl.projecteuler.utilities

object Primes {

  val primes: Stream[Int] = Stream.cons(2, Stream.from(3, 2).filter(n => isPrime(n)))

  def apply(n: Int): Int = primes(n)

  def isPrime(n: Int): Boolean = {
    if (n == 1) false
    else if (n < 4) true
    else if (n % 2 == 0) false
    else if (n < 9) true
    else if (n % 3 == 0) false
    else (5 to Utilities.sqrt(n).toInt by 6).
      filter(f => n % f == 0 || n % (f + 2) == 0).isEmpty
  }

  def arePrimes(s: Set[Int]): Boolean = {
    s.map(n => isPrime(n)).find(b => !b).getOrElse(true)
  }
}