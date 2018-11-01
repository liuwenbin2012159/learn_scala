/**
  * @auther 刘文斌
  *         Created on 2018/11/1 上午10:01
  */
trait TestTrait {

  sealed trait List[+A]

  case object Nil extends List[Nothing]

  case class cons[+B](head: B, tail: List[B]) extends List[B]

  object List {
    def sum(a: List[Int]): Int = a match {
      case Nil => 0
      case cons(x, xs) => x + sum(xs)
    }

    def product(ds: List[Double]): Double = ds match {
      case Nil => 1.0
      case cons(0.0, _) => 0.0
      case cons(x, xs) => x * product(xs)
    }
    //_:默认初始化，2。不关心结果的变量（即任意值）
    //as：可变参数，apply用于构造伴生对象的实例
    def apply[A](as: A*): List[A] =
      if (as.isEmpty) Nil
      else cons(as.head, apply(as.tail: _*))
  }

}
