package daryl.projecteuler.utilities

object Fibonacci {

  val fibonacci: Stream[BigInt] = {
    Stream.from(0, 2).map(n => fibonacciPair(n)).flatMap { case (a, b) => Array(a, b) }
  }

  def apply(n: Int): BigInt = {
    fibonacciPair(n)._1
  }

  /**
   * @param n nth fibonacci number
   * @return (F(n), F(n+1))
   */
  def fibonacciPair(n: Int): (BigInt, BigInt) = {
    if (n == 0) (0, 1)
    else {
      val (a, b) = fibonacciPair(n / 2)
      val c = a * (2 * b - a)
      val d = b * b + a * a
      if (n % 2 == 0) (c, d)
      else (d, c + d)
    }
  }

  /**
   * The even fibonacci numbers follow F(n) = 4 * F(n - 1) + F(n - 2)
   *
   * @return a stream containing the even fibonacci numbers.
   */
  val evenFibonacci: Stream[BigInt] = {
    Stream.cons(2, Stream.cons(8, evenFibonacci.zip(evenFibonacci.tail).map { case (a, b) => 4 * b + a }))
  }
}