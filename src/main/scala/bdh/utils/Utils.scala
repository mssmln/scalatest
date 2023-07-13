package bdh.utils

class Utils {

  final def equalityTwoInt(a: Int, b: Int): Boolean = a == b

  final def problem1(arr: Array[Int], k: Int): Array[Array[Int]] = {
    var arOfArMatchK = Array.empty[Array[Int]]
    for (it <- arr) {
      var arMatchK = Array.empty[Int]
      for (el <- arr.slice(1, arr.length)) {
        var result = 0
        if (arr.indexOf(el) > arr.indexOf(it)) {
          result = it + el
        }
        if (result == k) {
          arMatchK = arMatchK :+ it
          arMatchK = arMatchK :+ el
          arOfArMatchK = arOfArMatchK :+ arMatchK
        }
      }
    }
    arOfArMatchK
  }


}
