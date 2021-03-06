package demo

/**
  * 方法的定义
  * def 方法名(参数:参数类型,参数:参数类型):返回值={
  *
  *  方法体
  *
  *  最后一行为返回值，不用return
  * }
  */
object Def{
  def main(args: Array[String]): Unit = {
  val vul = Tdef()
    //println(vul)
    //当方法没有返回值时候不需要写（）
    //println(Tdef)
    sayName()
    //命名参数传递
    add(b=10,x=20)
    add(x=20,b=30)
    //默认方式
    add(10,20)
    println(Bsum(1,2,14,59))
  }

  /**
    * 定义一个方法
    * @return
    */
  def Tdef(): Int ={
    var num=0
    for(i <- 1 to 10;j <- 1 to 5 if(i != j)){
        num=i*10+j
      //println(i*10+j)
    }
    num //最后一行为返回值
  }

  def add(x:Int,b:Int): Int ={
    x+b
  }

  /**
    * 默认方法使用
    */
  def sayName(name:String = "CBQ"): Unit ={
    println(name)
  }

  /**
    * 可变参数 用* 表示 求和
    */
  def Bsum(nums:Int*): Int ={
     var re = 0
    for (v <- nums){
      re += v
    }
    re
  }
}
