package array

import scala.collection.mutable.ArrayBuffer

/**
  * 数组
  */
object Arrays extends App{
val a = new ArrayClass
 val list = new listApp
  println(list.l4)
  //println(a.arrBuf.tail)
}
 class ArrayClass{
   //不可变数组
   val arr = new Array[String](6)
   //低从是通过apply方法new的 默认调用的是apply方法
   val b = Array("hadoop","spark")
   //类型转换（数组转换成字符串）
   println(b.mkString)
   //可变数组
   var arrBuf = ArrayBuffer[String]()
   //添加元素
   arrBuf += "1"
   arrBuf += ("2","3")
   //删除数据
   arrBuf -= "2"
   //添加数据
   arrBuf ++= Array("hadoop","storm")
   //指定位置添加
   arrBuf.insert(0,"222","5555")
   //删除元素
   arrBuf.remove(1)
   arrBuf.remove(0,2)
   //从尾部删除
   arrBuf.trimEnd(2)
   //转换成不可变数组
   arrBuf.toArray

   //获取第一元素
   arrBuf.head
   //获取第一除外的元素
   arrBuf.tail

   //遍历集合元素
   for(v <- arrBuf){
      println(v)
   }
   //集合反着输出 reverse
   for(i <- (0 until arrBuf.length).reverse){
        println(arrBuf(i))
   }


 }

/**
  * Nil 就是不可变list集合（空的）
  */
class listApp{
  val L = List(1,2,3,4,5)
  //第一个元素
  L.head
  //除第一个以外的所有元素
  L.tail

  // Nil 返回的就是个list 1作为头部
  val l1 = 1 :: Nil
  val l2 = 2 :: l1 //2作为头 1作为尾部
  val l3 = l1 :: l2 :: Nil
  val l4 = 1 :: 2 :: 3 :: Nil

}

