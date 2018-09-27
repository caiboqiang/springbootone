package Fouction

/**
  * 字符串的2个高级操作
  */
object StringApp extends App {
  val He = "hello:"
  val name = "小名"

  //代替println(He+name)拼接
  println(s"$He$name")
  //多行字符串操作
  val hello =
    """
      |这是多行字符串操作
      |hello
      |哈哈
    """.stripMargin
  println(hello)
}
