package daryl.projecteuler.utilities

import org.junit._
import org.junit.Assert._
import daryl.projecteuler.utilities.Fibonacci._

@Test
class FibonacciTest {

  @Test
  def testFibonacci {
    assertEquals(List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), fibonacci.take(10).toList)
  }

  @Test
  def testNthFibonacci {
    assertEquals(BigInt("434665576869374564356885276750406258025646605173717804024817" +
      "290895365554179490518904038798400792551692959225930803226347752096896232398733" +
      "22471161642996440906533187938298969649928516003704476137795166849228875"), Fibonacci(1000))
  }

  @Test
  def testFibonacciPair {
    assertEquals((BigInt("354224848179261915075"), BigInt("573147844013817084101")), fibonacciPair(100))
  }

  @Test
  def testEvenFibonacci {
    assertEquals(List(2, 8, 34, 144, 610), evenFibonacci.take(5).toList)
  }
}