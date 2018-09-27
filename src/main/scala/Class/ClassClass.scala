package Class

/**
  * 半生类半生对象 统一在一个文件或文件夹里面（半生对象中有一个apply方法）
  * class name  object name  当class名字和object名子相同时候 就是半生类 半生对象
  */
object ClassClass extends App {

  /*for (i<- 1 to 10){
    AplyTest.sum()
  }
  println(AplyTest.coun)*/

 val b = AplyTest()
  println(b)

  val c = new AplyTest()
  //println(c)
  c()
}

//object AplyTest是class AplyTest半生对象
class AplyTest{
  def apply()={
    println("class apply方法")

  }
}
//class AplyTest是object AplyTest半生对象  object是单例对象
object AplyTest {
  println("开始......")
  var coun: Int = 0
  def sum(): Unit = {
    coun = coun + 1
  }

  def apply()={
    println("object apply方法")
    new AplyTest()
  }

  println("结束......")
}