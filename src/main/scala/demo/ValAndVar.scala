package demo

/**
  * val 和var的区别
  * val:常量一单初始化就不可变
  *
  * var:变量，可以赋值
  */
object ValAndVar {

  def main(args: Array[String]): Unit = {
    //定义格式 val xx = xxx or val nane:类型 = xxx

    val money = 5
    val T : String = "aaa"
    //定义格式  var xx = xxx or var nane:类型 = xxx
    var age : Int = 25
    var ages = 26
    val  v = t(money)
    println(v)

  }
  //定义方法
  def t(s:Int): Int ={
    s
  }

  /**
    *  方法的定义
    *  def 方法名（参数:数据类型,参数:数据类型）:返回值 {
    *      if(){
    *
    *      }
    *  }
    */
}
