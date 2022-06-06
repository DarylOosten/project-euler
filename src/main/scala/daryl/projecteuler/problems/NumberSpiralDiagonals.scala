package daryl.projecteuler.problems

/**
 * Number spiral diagonals
 * Problem 28
 *
 * Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:
 *
 * |21|  22  23  24 |25|
 *  20  |07| 08 |09| 10
 *  19   06 |01| 02  11
 *  18  |05| 04 |03| 12
 * |17|  16  15  14 |13|
 *
 * It can be verified that the sum of the numbers on the diagonals is 101.
 *
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 *
 * @see <a href="http://projecteuler.net/problem=28">Project Euler</a>
 *
 * @author daryl
 */
object NumberSpiralDiagonals {

  /**
   * |73| 74  75  76  77  78  79  80 |81|
   *  72 |43| 44  45  46  47  48 |49| 50
   *  71  42 |21| 22  23  24 |25| 26  51
   *  70  41  20 |07| 08 |09| 10  27  52
   *  69  40  19  06 |01| 02  11  28  53
   *  68  39  18 |05| 04 |03| 12  29  54
   *  67  38 |17| 16  15  14 |13| 30  55
   *  66 |37| 36  35  34  33  32 |31| 56
   * |65| 64  63  62  61  60  59  58 |57|
   *
   * square:           0| 1      | 2          | 3          | 4          | 5
   * length of sides:  1| 3      | 5          | 7          | 9          | 11
   * sequence:         1| 3 5 7 9| 13 17 21 25| 31 37 43 49| 57 65 73 81| 91 101 111 121
   * sum of diagonals: 1|      25|         101|         261|         537|            961
   *
   * this problem can be solved iteratively by summing the values of each square.
   *
   * value of top right corner of square with sides with length l:
   * f(l) = l^2
   *
   * values of top right and left corners of square with sides with length l:
   * f(l) = (l^2) + (l^2 - l + 1)
   * => f(l) = 2l^2 - l + 1
   *
   * values of top right and left corners plus bottom left corner of square with sides with length l:
   * f(l) = (2l^2 - l + 1) + (l^2 - 2l + 2)
   * => f(l) = 3l^2 - 3l + 3
   *
   * values of top right and left corners plus bottom left and right corners of square with sides with length l:
   * f(l) = (3l^2 - 3l + 3) + (l^2 - 3l + 3)
   * => f(l) = 4l^2 - 6l + 6
   *
   * values of the corners of square with sides with length l plus the values of the contained squares:
   * f(l) = 4l^2 - 6l + 6 + f(l - 2)
   *
   * @param lengthOfSides length of the sides of the square
   * @return sum of diagonals in the square
   */
  def apply(lengthOfSides: Int): Int = {
    (3 to lengthOfSides by 2).map(length => 4 * length * length - 6 * length + 6).sum + 1
  }
}