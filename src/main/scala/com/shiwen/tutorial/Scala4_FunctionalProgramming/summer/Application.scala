package com.shiwen.tutorial.Scala4_FunctionalProgramming.summer

import com.shiwen.tutorial.Scala4_FunctionalProgramming.summer.util.PropertiesUtil

import java.net.{ServerSocket, Socket}

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 9:31
 * @note 自定义的应用框架
 */
class Application {
  /**
   * 开发原则 : OCP Open-Close (开闭原则)
   * Open   : 开发的程序代码应该对功能的扩展开发
   * Close  : 在扩展的同时不应该对原有的代码进行修改。
   */
  def start(t:String = "jdbc")(op: => Unit)={

    var envData : Any = null

    //todo 1.初始化环境
    if (t=="socket"){
      envData = new Socket(
        PropertiesUtil.getValue("server.host"),
        PropertiesUtil.getValue("server.port").toInt)
    } else if (t=="serverSocket"){
      envData = new ServerSocket(
        PropertiesUtil.getValue("server.port").toInt
      )
    }

    //todo 2.业务逻辑
    try {
      op
    } catch {
      case ex: Exception => println("业务执行失败：" + ex.getMessage)
    }

    //todo 3.环境关闭
    if (t == "socket"){
      val socket: Socket = envData.asInstanceOf[Socket]
      if (!socket.isClosed){
        socket.close()
      }
    } else if (t == "serverSocket"){

    }
  }

}
