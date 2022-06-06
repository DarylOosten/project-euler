package daryl.projecteuler.problems

/**
 * Lattice paths
 * Problem 15
 *
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 *
 * @see <a href="http://projecteuler.net/problem=15">Project Euler</a>
 *
 * @author daryl
 */
object LatticePaths {

  /**
   * Turning the problem upside down, we can keep track of all the possible paths at each node.
   * The solution for each node is the sum of its two parent nodes. For the 2x2 grid this results in:
   *
   *   1
   *  1 1
   * 1 2 1
   *  3 3
   *   6
   *
   * To make things easier we just continue the pattern until we find the row that contains the solution:
   *
   *     1
   *    1 1
   *   1 2 1
   *  1 3 3 1
   * 1 4 6 4 1
   *
   * So element (length) of row (length * 2 + 1) contains the solution.
   *
   * @param length of the grid.
   * @return the number of routes from the top left to the bottom right of the grid.
   */
  def apply(length: Int): Long = {
    def recur(routes: Seq[Long], max: Int): Seq[Long] = {
      if (routes.length == max) routes
      else recur(1l +: routes.zip(routes.tail).map(t => t._1 + t._2) :+ 1l, max)
    }
    recur(Seq(1), length * 2 + 1)(length)
  }
}