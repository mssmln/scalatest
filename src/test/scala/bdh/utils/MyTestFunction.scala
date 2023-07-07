import org.scalatest.flatspec.AnyFlatSpec
import bdh.utils.IsOdd

class MyTestFunction extends AnyFlatSpec {
  it should "return true for odd numbers" in {
    val isOddInstance = new IsOdd()
    val int = 1
    assert(isOddInstance.isOdd(int))
  }
}