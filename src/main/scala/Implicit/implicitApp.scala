package Implicit

import java.io.File

import scala.io.Source

object implicitApp extends App {

  /**
    * 隐式类 定义什么类型 什么类型就有该方法 构建的是int 只有int类型有该方法
    * 不能用在单独的类中，要和object配合使用 增强该类
    * @param int
    */
  implicit class adds(int: Int){
    //构建String类型
    def add(x: Int): Int ={
      int+x
    }
    //构建string类型
    def addStr(x: String): String ={
      s"$int ：$x"
    }
  }
1.add(3)
  /**
    * 当有两个隐式变量时候 方式隐式参数不知道找那个（当隐式方法不指定变量时候）
    *
    */
  implicit val str = "hahaha"
  //implicit val strs = "hahaha1111111111111"
  /**
    * 隐式转换函数
    *
    * @param gman
    * @return
    * 格式
    * implicit def 函数名(参数)：返回值类型={
    * //函数体
    * //返回值
    * }
    */
implicit def get(gman: gMan): Man ={
  new Man(gman.name,gman.age)
}
  implicit def ReFiles(file: File): ReFile ={
      new ReFile(file)
  }
 val g = new gMan("A",10)
  println(g.getNameAge(g.name,g.age))

val path = new File("G:\\e.txt")
  var line = path.Re()
  /**
    * 隐式参数
    */
  def getImp(implicit name:String): Unit ={
    println(name+"~~~~~~~~~~~~~~~~~")
  }
  getImp



}

class Man(var name:String,var age: Int){
   def getNameAge(name:String,age:Int): String ={
    s"$name$age"
   }
}

class gMan(var name:String,var age :Int){
  def get(name:String): String ={
    name
  }
}

class ReFile(var file: File){
  def Re(): String ={
    //设置成GBK可以读取中文
    Source.fromFile(file.getPath,"GBK").mkString
  }
}

