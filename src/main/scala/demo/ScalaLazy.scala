package demo

/**
  * lazy懒加载 在使用时候才会加载
  * 比较耗费网络、IO 、计算的 用的比较多
  */
object ScalaLazy {
  def main(args: Array[String]): Unit = {
    //定义 lazy val = xxx
    lazy val  lv = 56
  }
}
