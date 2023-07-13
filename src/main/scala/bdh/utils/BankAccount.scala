package bdh.utils

class InsufficientFundsException extends Exception

class BankAccount(initialBalance: Double) {
  var balance: Double = initialBalance
  final def withdraw(amount: Double): Unit = {
    if (amount > balance) {
      throw new InsufficientFundsException
    } else {
      balance -= amount
    }
  }
}