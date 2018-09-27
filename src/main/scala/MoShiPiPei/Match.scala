package MoShiPiPei

object Match extends App {
  val app = new MatchApp
  //println(app.getName("X"))
  //println(app.getNames("s",0))
  app.array(Array("F","F","F","F"))
}

/**
  * 一般数据类型的模式匹配
  */
class MatchApp {
  /**
    * 模式匹配的语法
    *
    * @param name
    * @return
    */
  def getName(name: String): String = {
    name match {
      case "X" => {
        "ffffffffff"
      }
      case "Y" => {
        "gggggggggg"
      }
      case _ => {
        "什么也不是"
      }
    }
  }

  /**
    * 加判断的模式匹配
    * @param name
    * @param i
    * @return
    */
  def getNames(name: String, i: Int): String = {
    name match {
      case "X" if (i > 20) => {
        "ffffffffff"
      }
      case "Y" if (i < 20) => {
        "gggggggggg"
      }
      case _ if (i == 0) => {
        "什么也不是"
      }
    }
  }
  /**
    * Array模式匹配（数组）
    */
  def array(arr:Array[String]): Unit ={
            arr match {
              case Array("A") => {println("A")}
              case Array(x,y) => {println("Hello"+x+",heello"+y)}
              case Array("A",_*) => {println("A。。。。。")}
              case _ => { println(".....................")}
            }
  }
  /**
    * List模式匹配（集合）
    */
  def getList(list:List[String]): Unit ={
    list match {
      case "A"::Nil => { println("A")}
      case x::y::nil::Nil => {println("Hi"+x+","+y)}
      case "A"::tail => {println("AAAA")}
      case _ => {println("---------")}
    }
  }

  /**
    * 类型匹配
    */
  def matchType(obj:Any): Unit ={
    obj match {
      case y:Int => {println("Int")}
      case s:String => {println("String")}
      case m:Map[_,_] => {m.foreach(println)}
        //Map("K"->"V")
      case _ => {println("什么都没有")}
    }
    }
}


