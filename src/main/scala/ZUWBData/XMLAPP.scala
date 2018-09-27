package ZUWBData

import java.io.{FileInputStream, InputStreamReader}

import scala.xml.XML


/**
  * 读取xml文件
  */
object XMLAPP {
  def main(args: Array[String]): Unit = {
    loudXml()
    XMLSX()
  }

  def loudXml(): Unit ={
   // val xml1 =  XML.load(this.getClass.getClassLoader.getResource("UserMapper.xml"))
    val xml1 =  XML.load(new FileInputStream("G:\\IntelliJ Work\\springbootone\\src\\main\\resources\\mapper\\UserMapper.xml"))
    val xml2 =  XML.load(new InputStreamReader(new FileInputStream("G:\\IntelliJ Work\\springbootone\\src\\main\\resources\\mapper\\UserMapper.xml")))
    //println(xml1)
    //println(xml2)
  }
//读取xml属性
  def XMLSX(): Unit ={
    val xml2 =  XML.load(new InputStreamReader(new FileInputStream("G:\\IntelliJ Work\\springbootone\\src\\main\\resources\\mapper\\UserMapper.xml")))
    //println(xml2)
    val xml3 = xml2 \ "select"
    //获取所有的resultMap下内容
    val xml4 = xml2 \\ "select"
    //获取标签的属性值
    val V = (xml2 \ "select").map( _ \ "@id")
    val V2 = (xml2 \ "select" \\ "@id")
    //过滤标签
    val V3 = (xml2 \\ "select").filter(_.attribute("id").exists(_.text.equals("findByUsername")))
    //或这样写
    val V4 = (xml2 \\ "select").filter(x=>(x \ "@id").text.equals("findByUsername"))
    //println(xml4)
    println(V4)
    for (k <- V){
      println(k)
    }
  }

}
