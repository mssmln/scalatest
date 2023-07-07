import org.scalatest.flatspec.AnyFlatSpec


class TestReverseString extends AnyFlatSpec {
  ignore should "be reversed" in {
    val string = "hello"
    val reversedString = string.reverse
    val expectedString = "olleh"
    assert(expectedString == reversedString)
  }

}
