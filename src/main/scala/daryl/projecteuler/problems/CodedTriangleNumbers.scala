package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Files

/**
 * Coded triangle numbers
 * Problem 42
 *
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten triangle numbers are:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * By converting each letter in a word to a number corresponding to its alphabetical position and adding these values we form a word value.
 * For example, the word value for SKY is 19 + 11 + 25 = 55 = t10.
 * If the word value is a triangle number then we shall call the word a triangle word.
 *
 * Using words.txt (right click and 'Save Link/Target As...'),
 * a 16K text file containing nearly two-thousand common English words, how many are triangle words?
 *
 * @see <a href="http://projecteuler.net/problem=42">Project Euler</a>
 *
 * @author daryl
 */
object CodedTriangleNumbers {

  def apply(words: Seq[String]): Int = {
    words.map(isTriangleWord).filter(identity).length
  }

  def isTriangleWord(word: String): Boolean = {
    isTriangle(word.map(c => c.toInt - 64).sum)
  }

  def isTriangle(x: Int): Boolean = {
    ((math.sqrt(8.0 * x.toDouble + 1.0) - 1.0) / 2.0).isWhole
  }
}