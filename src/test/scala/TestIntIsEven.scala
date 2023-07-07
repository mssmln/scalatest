import org.scalatest.flatspec.AnyFlatSpec


class TestIntIsEven extends AnyFlatSpec {
  "The integer" should "be even" in {
    val evenNumber = 10
    assert(evenNumber % 2 == 0)
  }

}
