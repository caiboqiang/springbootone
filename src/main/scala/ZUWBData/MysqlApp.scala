package ZUWBData

import java.sql.{Connection, DriverManager}

/**
  * 读取数据mysql
  */
object MysqlApp {
  def main(args: Array[String]): Unit = {
   // val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/spring?characterEncoding=UTF-8"
    val uese = "root"
    val pass = "123456"
    var connection: Connection = null
    try {
      classOf[com.mysql.jdbc.Driver]
      connection = DriverManager.getConnection(url,uese,pass)//连接数据库
      val statement = connection.createStatement()//获取连接
      val execute = statement.executeQuery("SELECT id ,`name`,age FROM A")
      while (execute.next()) {
        val id = execute.getString("id")
        val name = execute.getString("name")
        val age = execute.getInt("age")
        println(s"|$id|$name|$age|")
      }
    }catch {
        case e:Exception =>e.printStackTrace()
    }finally {
      if(connection == null){
        connection.close()
      }
    }

    }
}
