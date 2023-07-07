import org.scalatest.flatspec.AnyFlatSpec

class MyTest extends AnyFlatSpec {
  it should "return true if the given number is positive" in {
    val number = 42
    assert(number > 0)
  }
}
