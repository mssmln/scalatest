import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.BeforeAndAfter
import bdh.utils.Calculator


class CalculatorTest extends AnyFlatSpec with BeforeAndAfter {
  var calculator: Calculator = _

  // By using the fixture, we ensure that a new instance of Calculator is set up
  // before each test case, allowing for a clean and isolated environment for each scenario.
  before {
    calculator = new Calculator
  }

  "A calculator" should "add two numbers correctly" in {
    val result = calculator.add(2, 3)
    assert(result == 5)
  }


  it should "add negative numbers correctly" in {
    val result = calculator.add(-5, -8)
    assert(result == -13)
  }

}




