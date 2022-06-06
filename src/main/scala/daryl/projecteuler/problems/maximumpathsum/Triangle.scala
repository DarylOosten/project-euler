package daryl.projecteuler.problems.maximumpathsum

/**
 * Utility class to build the triangles from the maximum path sum problems.
 *
 * @author daryl
 *
 */
object Triangle {
  /**
   * @param triangle a sequence of sequences of integers in the following (triangle) form:
   * Seq(
   * __Seq(1),
   * _Seq(2,3),
   * Seq(4,5,6)
   * )
   *
   * @return the maximum sum of the paths from the root to any leaf,
   * which would be 10 in the example above (1 -> 3 -> 6)
   */
  def apply(triangle: Seq[Seq[Int]]): Int =
    triangle.reduceRight((parents: Seq[Int], children: Seq[Int]) =>
      parents.zipWithIndex.map(parent =>
        parent._1 + math.max(children(parent._2), children(parent._2 + 1))))
      .head
}