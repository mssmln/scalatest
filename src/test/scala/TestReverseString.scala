import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class TestReverseString extends AnyFlatSpec with Matchers {
  "The string" should "be reversed" in {
    val string = "hello"
    val reversedString = string.reverse
    val expectedString = "olleh"
    //assert(expectedString == reversedString)
    // shouldBe performs a reference equality check using the eq operator.
    // It checks if the actual value and the expected value refer to the exact same object in memory
    expectedString shouldBe reversedString
  }

}
