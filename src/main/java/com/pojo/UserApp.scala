package com.pojo

import org.springframework.stereotype.Component

@Component class UserApp {

  var id : String =_
  var name : String = _
  val age = 10
  var ages : Int = 15

  def say(name : String): String ={
    name+"666666"
  }

}
