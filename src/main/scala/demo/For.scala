package demo

/**
  * 循环
  */
object For {
  def main(args: Array[String]): Unit = {
    /**
      * 1 to 10 等价 1.to 10 包前包后
      */
    for (i <- 1 to 10 ){
          println(i)
    }

    /**
      * until 包前不宝后 1 until（20） 等价 1 until 20
      */
    for(t <- 1 until 20){
      //println(t)
    }

    /**
      * 定义数组
      */
    val arr = Array("q","w","e","r","t");
    arr.foreach(s => println(s))
  }
}
