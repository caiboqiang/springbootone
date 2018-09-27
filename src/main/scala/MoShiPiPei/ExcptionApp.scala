package MoShiPiPei

object ExcptionApp extends App {
  try {
    var i = 10/0
  }catch {
    case e:Exception => {println("--------------------------")}
  }finally {
    //一定要写释放资源
    println("一定要写释放资源")
  }


}
