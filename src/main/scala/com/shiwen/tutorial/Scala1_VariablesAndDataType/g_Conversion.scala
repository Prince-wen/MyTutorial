package com.shiwen.tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 15:38
 * @note 类型转换
 */
object g_Conversion {
  def main(args: Array[String]): Unit = {

    //todo 自动类型转化（隐式转换）
    val b : Byte = 10
    val s : Short = b
    val i : Int = s
    val lon : Long = i

    //思考一个问题：如下代码是否正确？
    //      val c : Char = 'A' + 1
    //      println(c)

    //todo 强制类型转化
    //	Java语言
    //      int a = 10
    //      byte b = (byte)a
    //	Scala语言
    var aa : Int = 10
    var bb : Byte = aa.toByte
    // 基本上Scala的类型之间都提供了相应转换的方法。

    //todo 字符串类型转化
    //scala是完全面向对象的语言，所有的类型都提供了toString方法，可以直接转换为字符串
    lon.toString
    //任意类型都提供了和字符串进行拼接的方法
    val ii = 10
    val ss = "hello " + ii
  }
}
