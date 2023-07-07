import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._
import bdh.utils.Utils

class UtilsTest extends AnyFlatSpec with Matchers {
  it should "assert the equality of two integers" in {
    val a = 3
    val b = 3
    val equalityTwoInt = new Utils().equalityTwoInt(a, b)
    a shouldEqual b
  }

}
