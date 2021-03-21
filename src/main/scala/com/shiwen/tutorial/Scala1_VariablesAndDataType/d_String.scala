package com.shiwen.tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 14:58
 * @note 字符串
 */
object d_String {
  /**
   * 在 Scala 中，字符串的类型实际上就是 Java中的 String类，它本身是没有 String 类的。
   * 在 Scala 中，String 是一个不可变的字符串对象，所以该对象不可被修改。这就意味着你如果修改字符串就会产生一个新的字符串对象。
   */
  def main(args: Array[String]): Unit = {
    val name : String = "scala"
    val subname : String = name.substring(0,2)
  }
  //todo 1字符串连接
  def main1(args: Array[String]): Unit = {
    val name : String = "scala"
    // 字符串连接
    println("Hello " + name)
  }

  //todo 2传值字符串
  def main2(args: Array[String]): Unit = {
    val name : String = "scala"
    // 传值字符串(格式化字符串)
    printf("name=%s\n", name)
  }

  //todo 3插值字符串
  def main3(args: Array[String]): Unit = {
    val name : String = "scala"
    // 插值字符串
    // 将变量值插入到字符串
    println(s"name=$name")
  }

  //todo 4多行字符串
  def main4(args: Array[String]): Unit = {
    val name : String = "scala"
    // 多行格式化字符串
    // 在封装JSON或SQL时比较常用
    // | 默认顶格符
    println(
      s"""
         | Hello
         | ${name}
        """.stripMargin)
  }
}
