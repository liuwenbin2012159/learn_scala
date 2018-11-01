/**
  * @auther 刘文斌
  *         Created on 2018/10/29 下午6:49
  */
object MultiTai {
  def getAyyayIndex[S](array: Array[S], s: String, p: Array[S] => Boolean): Int = {
    if (p(array)) println("true")
    else println("false")
    val n = array.length - 1;
    def loop(array: Array[S], index: Int): Int = {
      if (array(index).equals(s)) index
      else
        loop(array, index - 1)
    }

    loop(array, n)
  }

  val lesjjj = new Function2[Int, String, Boolean] {
    def apply(a: Int, b: String) = {
      a == b.length
    }
  }


  def main(args: Array[String]): Unit = {
    println(lesjjj(5, "hell5o"))
    val array = Array("a", "b", "c", "d")
    println(getAyyayIndex(array, "d", (x: Array[String]) => x.size == 4))
  }
}
