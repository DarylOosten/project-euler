package daryl.projecteuler.problems

/**
 * Special Pythagorean triplet
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which, a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * @see <a href="http://projecteuler.net/problem=9">Project Euler</a>
 *
 * @author daryl
 */
object SpecialPythagoreanTriplet {

  def apply(sum:Int): Int = productsOfSpecialPythagoreanTriplets(sum).head

  def productsOfSpecialPythagoreanTriplets(sum: Int): Stream[Int] = {
    specialPythagoreanTriplets(sum).map { case (a, b, c) => a * b * c }
  }

  def specialPythagoreanTriplets(sum: Int): Stream[(Int, Int, Int)] = {
    for {
      a <- (1 to (sum - 3) / 3).toStream;
      b <- (a + 1 until (sum - a) / 2);
      c <- (b + 1 until sum)
      if (a * a + b * b == c * c)
      if (a + b + c == sum)
    } yield (a, b, c)
  }
}