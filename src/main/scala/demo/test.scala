package demo

object test {

  def main(args: Array[String]): Unit = {
    /**
      * 定义常量
      */
    val s = 5;
    /**
      * 定义变量
      */
    var x = 1;
    /**
      * 把判断后的值fu
      */
    var x1 = if (x>1){
      8
    }else{
      9
    }
    println(x1);

    // i 是输出值
    for (i <- 1 to 100){
     // println(i+"GGG")
    }

    for (i <- 1 to 3; j <- 1 to 3 if (i != j) ){
      println(i*10+j)
    }
  }





  /**
    * 这种写法不可行
    */
  /*var ds =  for( i <- 1 to 10){
    yield i*10
  }*/

  var d = for( i <- 1 to 10) yield i*10
 println(d)
}
