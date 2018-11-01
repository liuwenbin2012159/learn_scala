/**
  * @auther 刘文斌
  *         Created on 2018/10/30 上午11:22
  */

import Myobject._

object CurryTest {
  /*
    def curry[A, B, C](a: A, f: (A, B) => C): A => (B => C) = {
    }
  */
  def main(args: Array[String]): Unit = {
    //    curry((a: Int, b: Int) => a * b)(2)(2)(2)
    val i = abs(-99)
    println(multi2(5))
    println(multi3(23)(2))
    println(multi4(23)(2))
    println(multi6(7, 2))
    //    println(multi5(23)(2)(5))
    val curried = (multi6 _).curried
    println(curried(2)(7))

  }

  def multi2(a: Int) = (b: Int) => {
    println("a" + a)
    println("b" + b)
    a * b
  }

  def multi3(a: Int)(b: Int) = {
    a * b
  }

  def multi6(a: Int, b: Int): Int = {
    a * b +6
  }

  def multi4(a: Int)(b: Int): String = String.valueOf(a - b)

  //  def multi5[multi3, multi4](a: Int, f1: mul?ti4 => (c: Int) => a + b + c
  //  def multi5[multi3,multi4](a:Int,f1:multi3):Int=>multi3(a)(3)


}
