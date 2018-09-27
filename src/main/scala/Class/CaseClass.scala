package Class

/**
  * case class 用在模式匹配上面
  */
object CaseClass extends App {

  println(Dog("66666").name)
}

case class Dog(name:String)