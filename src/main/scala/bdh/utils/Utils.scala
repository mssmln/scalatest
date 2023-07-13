package bdh.utils

class Utils {

  final def equalityTwoInt(a: Int, b: Int): Boolean = a == b

  final def problem1(arr: Array[Int], k: Int): Array[Array[Int]] = {
    val arOfArMatchK = for {
      (it, i) <- arr.zipWithIndex
      el <- arr.slice(i + 1, arr.length)
      if it + el == k
    } yield Array(it, el)
    arOfArMatchK
  }



}
