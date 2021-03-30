package tutorial.Scala1_VariablesAndDataType

import java.io.{BufferedReader, File, InputStreamReader, OutputStreamWriter, PrintWriter}
import java.net.{ServerSocket, Socket}

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 15:09
 * @note 输入输出
 */
object e_I_O {

  //todo 输入
  //	从屏幕（控制台）中获取输入
  object ScalaIn1 {
    def main(args: Array[String]): Unit = {
      // 标准化屏幕输入
      val age : Int = scala.io.StdIn.readInt()
      println(age)
    }
  }
  //	从文件中获取输入
  object ScalaIn2 {
    def main(args: Array[String]): Unit = {
      // 请注意文件路径的位置
      //idea中的相对路径是以Project的根（root）路径为基准
      scala.io.Source.fromFile("input/user.json").foreach(
        line => {
          print(line)
        }
      )
      scala.io.Source.fromFile("input/user.json").getLines()
    }
  }

  //todo 输出
  //Scala进行文件写操作，用的都是 java中的I/O类
  object ScalaOut {
    def main(args: Array[String]): Unit = {
      val writer = new PrintWriter(new File("output/test.txt" ))
      writer.write("Hello Scala")
      writer.close()
    }
  }

  //todo 网络
  //Scala进行网络数据交互时，采用的也依然是 java中的I/O类
  object TestServer {
    def main(args: Array[String]): Unit = {
      val server = new ServerSocket(9999)
      while ( true ) {
        val socket: Socket = server.accept()
        val reader = new BufferedReader(
          new InputStreamReader(
            socket.getInputStream,
            "UTF-8"
          )
        )
        var s : String = ""
        var flg = true
        while ( flg  ) {
          s = reader.readLine()
          if ( s != null ) {
            println(s)
          } else {
            flg = false
          }
        }
      }
    }
  }

  object TestClient {
    def main(args: Array[String]): Unit = {
      val client = new Socket("localhost", 9999)
      val out = new PrintWriter(
        new OutputStreamWriter(
          client.getOutputStream,
          "UTF-8"
        )
      )
      out.print("hello Scala")
      out.flush()
      out.close()
      client.close()
    }
  }

  /**
   * java的序列化怎么回事？
   *
   * 将对象转换为可以持久化和网络传输的字节码文件
   */
}
