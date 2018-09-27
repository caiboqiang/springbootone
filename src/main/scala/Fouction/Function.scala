package Fouction

/**
  * 匿名函数
  * （参数名:参数类型....）=>{函数体}
  */
object Function extends App {



  //匿名函数
  (x:Int,v:Int)=>{
    x+v
  }
  //非函数
  val fun = (x:Int)=>{
    s"是$x"
  }
  def add = (x:Int,v:Int)=>{x+v}
  println(fun(3))
}
