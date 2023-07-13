import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._
import bdh.utils.Utils

class UtilsTest extends AnyFlatSpec with Matchers {
  it should "assert the equality of two integers without Matchers" in {
    val a = 3
    val b = 3
    val equalityTwoInt = new Utils().equalityTwoInt(a, b)
    assert(equalityTwoInt)
  }

  it should "assert the equality of two integers with Matchers" in {
    val a = 3
    val b = 3
    a shouldEqual b
  }


  "The method problem1" should "return a 2D array containing 10 and 7" in {
    val arr = Array(10, 15, 3, 7)
    val int = 17
    val problem1 = new Utils().problem1(arr, int)
    problem1(0)(0) shouldEqual 10
    problem1(0)(1) shouldEqual 7
  }

}
