package Class

/**
  * 继承
  */
object ExtendsClass extends App {
  val sc = new Stu("666",444,"大学")
 // println(sc.name+":"+sc.age+":"+sc.school+":"+sc.id)

  //println(sc)
  val j =new JApp()
  println(j.eat("5555"))
}

class Preson(var name:String,var age:Int){
      val id:Int = 0
  println("人开始产生。。。。。。。。。。。")
  println("人开始消失。。。。。。。。。。。")
}

/**
  * 当继承对像时候，首先初始化被继承的对象，然后初始化被new对象
  * 例：先初始化 Preson 然后初始化 Stu
  * @param name
  * @param age
  * @param school
  */
class Stu(name:String,age:Int,var school:String) extends Preson(name ,age) {
  /**
    * val 修饰属性可以重写必须用override修饰
    * var 修饰属性不可以重写
    * 抽象类 val var 修饰的都可以重写 不需要override修饰
    */
  //重写父类属性必须要用override修饰
  override val id:Int = 20
  println("学生开始产生。。。。。。。。。。。")
  println("学生开始消失。。。。。。。。。。。")

  /**
    * 被重写的方法一定要用override修饰
    * @return
    */
  override def toString: String = {
    "66666666666"
  }
}
/**
  * 抽象类
  * 类的一个属性或方法没有实现(只定义 没有具体实现)
  */
abstract class HAPP{
  val id:Int
  var name:String

  /**
    * 不带参有返回值抽象方法
    * @return
    */
  def eat():String

  /**
    * 带参有返回值的抽象方法
    * @param name
    * @return
    */
  def eat(name:String):String

}

class JApp extends HAPP{
  override def eat(): String = {
    "88888888888"
  }

  override def eat(name: String): String = {
    name
  }

  override val id: Int = 0

  override var name: String = "1"
}