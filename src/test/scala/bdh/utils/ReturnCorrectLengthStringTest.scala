import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._
import bdh.utils.ReturnCorrectLengthString

class ReturnCorrectLengthStringTest extends AnyFlatSpec with Matchers {
  it should "return the correct string's length as integer" in {
    val returnCorrectLengthStringInstance = new ReturnCorrectLengthString()
    val string = "hello scalatest"
    string should have length returnCorrectLengthStringInstance.returnCorrectLengthString(string)
  }

}
