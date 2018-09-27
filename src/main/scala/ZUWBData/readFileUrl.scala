package ZUWBData

import java.io.File
import java.net.URI

import scala.io.Source._
import scala.io.{BufferedSource, Source}

object readFileUrl {
  //定义个读取文件函数
  def re(file:BufferedSource)={
    for (line <- file.getLines()){
      println(line)
    }
  }
  def main(args: Array[String]): Unit = {
    //读取文件
    val file = new File("G:\\e.txt")
    val line1 = Source.fromFile(file.getPath,"GBK")
    val line2 = Source.fromFile("G:\\e.txt","GBK")
   // re(line1)
    //函数
    def res(): Unit ={
    for (file <- line2){
      println(file)
     }
    }
   // res()
    //读取网络数据
   val text = Source.fromURL("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&tn=25017023_10_pg&wd=JSONObject%20%E8%BD%AC%E6%88%90JSONArray&oq=jsonobject%2520%25E8%25BD%25AC%25E6%2588%2590JSONArray&rsv_pq=b567aa0e001b6cc7&rsv_t=8ae4KiIu63klWFrgMpIY2jG8YjK4N%2BNQMrUlbqhDwRpf1Lxw%2FnQ2i03WCLSwH3yea1aSIJI&rqlang=cn&rsv_enter=0&inputT=2478&rsv_n=2&rsv_sug3=3&bs=jsonobject%20%E8%BD%AC%E6%88%90JSONArray","GBK")
    for (line <- text.getLines()){
      println(line)
    }

  }
}
