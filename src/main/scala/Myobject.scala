/**
  * @auther 刘文斌
  *         Created on 2018/10/29 下午5:54
  */
object Myobject {
  def abs(d:Int) :Int={
    if(d<0) -d
    else d
  }

  def formateAbs(s:Int):String={
    var jj = "start to lean scala %d adn %d"
    jj.format(s,abs(s))
  }

  def main(args: Array[String]): Unit = {
    println(formateAbs(-99))
  }
}
