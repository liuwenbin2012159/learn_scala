/**
  * @auther 刘文斌
  *         Created on 2018/10/29 下午6:18
  */


import Myobject._

object ExtentMyobject {
  def main(args: Array[String]): Unit = {
    println(abs(-88))
    println(formateAbs(factoral(7)))
  }

  def factoral(s: Int): Int = {
    def multi(s: Int, count: Int): Int = {
      if (s == 1) count
      else
        multi(s - 1, (s - 1) * count)
    }

    multi(s, s)
  }

}
