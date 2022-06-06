package daryl.projecteuler.utilities

import scala.io.Source

object Files {

  def lines(filename: String): Seq[String] = {
    Source.fromFile(filename).getLines.toSeq
  }

  def bigIntLines(filename: String): Seq[BigInt] = {
    lines(filename).map(BigInt(_))
  }

  def spaceSeperated(filename: String): Seq[Seq[String]] = {
    lines(filename).map(_.split(' ').toSeq)
  }

  def spaceSeperatedInts(filename: String): Seq[Seq[Int]] = {
    spaceSeperated(filename).map(_.map(_.toInt))
  }

  def csv(filename: String): Seq[Seq[String]] = {
    lines(filename).map(_.split(',').toSeq)
  }

  def flatCsv(filename: String): Seq[String] = {
    csv(filename).flatten
  }

  def quotedCsv(filename: String): Seq[Seq[String]] = {
    csv(filename).map(a => a.map(s => s.substring(1, s.length() - 1)))
  }

  def flatQuotedCsv(filename: String): Seq[String] = {
    quotedCsv(filename).flatten
  }

  def flatCsvInts(filename: String): Seq[Int] =
    flatCsv(filename).map(_.toInt)
}