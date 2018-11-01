/**
  * @auther 刘文斌
  *         Created on 2018/10/30 上午10:52
  */
object notimaousFunction {
  def partll[A, B, C](a: A, f: (A, B) => C): B => C = {
    (b: B) => f(a, b)
  }


  def main(args: Array[String]): Unit = {
    println(partll(1, (a: Int, b: Int) => a + b)(9))
    println(partll(1,(a:Int,b:Int)=>a+b).apply(9))
    //TODO andthen
    println(partll(1,(a:Int,b:Int)=>a+b).andThen((g:Int)=>9)(2))
  }
}
