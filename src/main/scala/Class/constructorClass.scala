package Class

/**
  * 主构造器
  * 附属构造器
  *
  */
object constructorClass {
  def main(args: Array[String]): Unit = {
    val B = new constructorA("aaa",20);
    val C = new constructorA("aaa",20,25);
    println(C.id)
  }
}

/**
  * 主构造器:跟在类后面的有参属性
  * 主构造器的参数必须用 val  var修饰，否则不能访问该属性
  * @param name
  * @param age
  */
class constructorA(val name:String,val age:Int) {
  var id :Int = _
  var school = "大学"
  println("创建对象开始....................")
  println("创建对象结束....................")

  /**
    * 有参附属构造器
    */
  def this(name:String,age:Int,id:Int){
   this(name,age)//附属构造器的第一行代码必须调用主构造器或其他附属构造器
   this.id = id
  }

}
