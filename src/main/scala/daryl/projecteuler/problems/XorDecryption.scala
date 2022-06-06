package daryl.projecteuler.problems

import daryl.projecteuler.utilities.Files

/**
 * XOR decryption
 * Problem 59
 *
 * Each character on a computer is assigned a unique code and the preferred standard is ASCII (American Standard Code for Information Interchange).
 * For example, uppercase A = 65, asterisk (*) = 42, and lowercase k = 107.
 *
 * A modern encryption method is to take a text file, convert the bytes to ASCII, then XOR each byte with a given value, taken from a secret key.
 * The advantage with the XOR function is that using the same encryption key on the cipher text, restores the plain text;
 * for example, 65 XOR 42 = 107, then 107 XOR 42 = 65.
 *
 * For unbreakable encryption, the key is the same length as the plain text message, and the key is made up of random bytes.
 * The user would keep the encrypted message and the encryption key in different locations, and without both "halves", it is impossible to decrypt the message.
 *
 * Unfortunately, this method is impractical for most users, so the modified method is to use a password as a key.
 * If the password is shorter than the message, which is likely, the key is repeated cyclically throughout the message.
 * The balance for this method is using a sufficiently long password key for security, but short enough to be memorable.
 *
 * Your task has been made easy, as the encryption key consists of three lower case characters.
 * Using cipher1.txt (right click and 'Save Link/Target As...'), a file containing the encrypted ASCII codes,
 * and the knowledge that the plain text must contain common English words, decrypt the message and find the sum of the ASCII values in the original text.
 *
 * @see <a href="http://projecteuler.net/problem=59">Project Euler</a>
 *
 * @author daryl
 */
object XorDecryption {

  /**
   * Decrypts the given encrypted message and sums its ASCII values.
   * @param encrypted to be decrypted.
   * @param keyLength with which the message was encrypted.
   * @return the sum of the ASCII values of the decrypted message.
   */
  def apply(encrypted: Seq[Int], keyLength: Int): Int = {
    val key = extractKey(encrypted, keyLength)
    decrypt(encrypted, key).sum
  }

  /**
   * Decrypts the encrypted message by XOR'ing it with the given key.
   * @param encrypted message
   * @param key with which the message was encrypted.
   * @return the decrypted message.
   */
  def decrypt(encrypted: Seq[Int], key: Seq[Int]): Seq[Int] =
    encrypted.zip(Stream.continually(key).flatten).map(t => t._1 ^ t._2)

  /**
   * Extracts the key from the given encrypted text using frequency analysis.
   * @param encrypted text.
   * @param keyLength
   * @return the extracted key.
   */
  def extractKey(encrypted: Seq[Int], keyLength: Int): Seq[Int] = {
    // Partitions the encrypted text along the length of the key.
    val partitions: Map[Int, Seq[Int]] = encrypted.zipWithIndex.groupBy {
      case (character: Int, index: Int) => (index % keyLength)
    }.map { //Remove the indexes
      case (partition: Int, indexedCharacters: Seq[(Int, Int)]) =>
        (partition -> indexedCharacters.map(_._1))
    }

    // Collects the frequencies of the encrypted characters in the partitions.
    val frequencies: Map[Int, Map[Int, Int]] = partitions.map {
      case (partition: Int, characters: Seq[Int]) =>
        (partition -> characters.foldLeft(Map[Int, Int]() withDefaultValue 0)(
          (map: Map[Int, Int], char: Int) => map + (char -> (map(char) + 1))))
    }

    // Finds the most frequent encrypted character in each partition.
    val mostFrequent: Map[Int, Int] = frequencies.map {
      case (partition: Int, charFrequencies: Map[Int, Int]) =>
        (partition -> charFrequencies.reduce((charFreqA, charFreqB) =>
          if (charFreqA._2 > charFreqB._2) charFreqA else charFreqB)._1)
    }

    // Recreates the key from the most frequent encrypted characters in each partition.
    mostFrequent.toSeq.sortBy(partChar => partChar._1).map(partChar => partChar._2 ^ ' '.toInt)
  }
}