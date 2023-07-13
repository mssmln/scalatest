import org.scalatest.flatspec.AnyFlatSpec
import bdh.utils.BankAccount
import bdh.utils.InsufficientFundsException


class BankAccountTest extends AnyFlatSpec {
  "A bank account" should "throw InsufficientFundsException when withdrawing more than the account balance" in {
    val bankAccount = new BankAccount(100.0)
    val withdrawalAmount = 150.0
    // The intercept method is used to catch and capture exceptions.
    // It takes a type parameter in square brackets to specify the expected type of the exception.
    // Inside the scope, you place the code that is expected to throw the exception
    val exception = intercept[InsufficientFundsException] {
      bankAccount.withdraw(withdrawalAmount)
    }
    assert(exception.isInstanceOf[InsufficientFundsException])
  }

}