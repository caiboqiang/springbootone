package demo

/**
  * scala基本数据类型
  * Byte/Char
  * Short/Int/Long/Float/Double
  * Boolean
  */
object ScalDataType {
  def main(args: Array[String]): Unit = {
    val a : Int = 10
    val b : Short = 12
    val c : Float = 20.26f
    val d : Double = 12.03
    //类型转换
    var f : Float = 120.26f
    //数据类型转换 Float-》Int
    val g : Double = f.asInstanceOf[Double]
    println(g)
    //数据类型判断
   val t = d.isInstanceOf[Int]
    println(t)
  }
}
