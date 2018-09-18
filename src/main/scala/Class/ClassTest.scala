package Class

object ClassTest {

  def main(args: Array[String]): Unit = {
    //类的调用
    val CU = new ClassUser()
    //set
    CU.age=20
    CU.name="梅西"
    //gat
    val q = CU.QQ
    //CU.QQ="666"
     println(q)
    println(CU.age)
    //方法调用
    println(CU.eat(CU.name))
    CU.F()

  }

}
