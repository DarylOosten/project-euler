package daryl.projecteuler.problems

/**
 * Largest product in a grid
 * Problem 11
 *
 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 *
 * 08 02 22 97 38 15 ...(see numbers below)... 43 52 01 89 19 67 48
 *
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 *
 * What is the greatest product of four adjacent numbers in the same direction
 * (up, down, left, right, or diagonally) in the 20×20 grid?
 *
 * @see <a href="http://projecteuler.net/problem=11">Project Euler</a>
 *
 * @author daryl
 */
object LargestProductInAGrid {

  val numbers = Seq(
    Seq(8, 02, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91, 8),
    Seq(49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00),
    Seq(81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65),
    Seq(52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91),
    Seq(22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80),
    Seq(24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50),
    Seq(32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70),
    Seq(67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21),
    Seq(24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72),
    Seq(21, 36, 23, 9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95),
    Seq(78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14, 9, 53, 56, 92),
    Seq(16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57),
    Seq(86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58),
    Seq(19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40),
    Seq(04, 52, 8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66),
    Seq(88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69),
    Seq(04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36),
    Seq(20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16),
    Seq(20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54),
    Seq(01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48))

  def apply(grid: Grid, length: Int): Int = {
    grid.getSequencesInAllDirections(grid.getCoordinates, length).
      map(_.reduce((a: Int, b: Int) => a * b)).max
  }

  class Grid(numbers: Seq[Seq[Int]]) {

    def getCoordinates: Seq[(Int, Int)] = {
      for (x <- (0 until numbers(0).length); y <- (0 until numbers.length)) yield (x, y)
    }

    def getSequencesInAllDirections(coordinates: Seq[(Int, Int)], length: Int): Seq[Seq[Int]] = {
      coordinates.flatMap(c => getSequences(c, length, Seq(
        ((x: Int, y: Int, d: Int) => (x + d, y)),
        ((x: Int, y: Int, d: Int) => (x, y + d)),
        ((x: Int, y: Int, d: Int) => (x - d, y + d)),
        ((x: Int, y: Int, d: Int) => (x + d, y + d)))))
    }

    def getSequences(xy: (Int, Int), length: Int, next: Seq[(Int, Int, Int) => (Int, Int)]): Seq[Seq[Int]] = {
      next.map(n => getSequence(xy, length, n))
    }

    def getSequence(xy: (Int, Int), length: Int, next: (Int, Int, Int) => (Int, Int)): Seq[Int] =
      xy match {
        case (x: Int, y: Int) => (for (d <- 0 until length) yield next(x, y, d)).map(getNumber)
      }

    def getNumber(xy: (Int, Int)): Int = xy match {
      case (x: Int, y: Int) =>
        if (x < 0 || y < 0) 0
        else if (y >= numbers.length) 0
        else if (x >= numbers(y).length) 0
        else numbers(y)(x)
    }
  }
}