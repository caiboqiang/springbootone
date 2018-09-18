package Class
/**
  * 类的定义和使用 属性
  */
class ClassUser {
  /**
    * 属相的定义
    * var定义的属性scala会自动生成get、set方法
    * val定义的属性scala会自动生成get方法
    * "_"站位符只能用在var修饰的变量，val修饰的会报错
    * 用占位符必须加上类型 scala不能自动推断类型
    */
  var name = ""
  var f : String = _
  var age:Int = _
  val QQ:String = "908507670@qq.com"
  /**
    * 被private [this]修饰的属相只能在类的内部使用
    */
  private [this] val group : String = "name"

  /**
    * 定义方法
    */
  def eat(name:String): String ={
    name+"吃饭"
  }

  def F(): Unit ={
    println(group)
  }
}
