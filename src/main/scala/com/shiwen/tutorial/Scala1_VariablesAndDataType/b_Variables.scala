package com.shiwen.tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 13:41
 * @note 变量
 */
object b_Variables {

  //todo 1 语法声明：变量的类型在变量名之后，等号之前声明
  def main(args: Array[String]): Unit = {
    // var | val 变量名 ： 变量类型 = 变量值
    //用户名
    var username: String = "zhangsan"
    //密码
    val password: String = "123456"
  }

  //todo 2 变量的类型如果能够通过变量值推断出来，那么可以省略类型声明
  //这里的省略，并不是不声明，而是由Scala编译器在编译时自动声明编译的
  def main2: Unit ={
    // 因为变量值为字符串，又因为Scala是静态类型语言，所以即使不声明类型
    // Scala也能在编译时正确的判断出变量的类型，这体现了Scala语言的简洁特性。
    var username = "zhangsan"
    val userpswd = "000000"
  }

  //todo 3 变量初始化
  //Java语法中变量在使用前进行初始化就可以，但是Scala语法中是不允许的，必须显示进行初始化操作
  def main3(args: Array[String]): Unit = {
//    var username // Error
    val username = "zhangsan" // OK
  }

  //todo 4 可变变量
  //值可以改变的变量，称之为可变变量，但是变量类型无法发生改变, Scala中可变变量使用关键字var进行声明
  def main4(args: Array[String]): Unit = {
    // 用户名称
    var username : String = "zhangsan"
    username = "lisi" // OK
//    username = true // Error
  }

  //todo 5 不可变变量
  //值一旦初始化后无法改变的变量，称之为不可变变量。Scala中不可变变量使用关键字val进行声明, 类似于Java语言中的final关键字
  def main5(args: Array[String]): Unit = {
    // 用户名称
    val username : String = "zhangsan"
//    username = "lisi" // Error
//    username = true // Error
  }

  /**
   * 1.val和var分别适用于什么场景
   * val开发过程中一定是用的多一些
   *
   * 2.Java中的字符串为何称之为不可变字符串
   * final修饰的变量一旦初始化后，就不能改变
   * 且String初始化后没有提供任何方法来修改字符串的内容
   * 但是此时通过对变量指向的内存地址进行直接访问和修改，仍然可以修改其内容
   * 因此字符串不可变指的是字符串变量在初始化之后其指向的内存地址不能改变。
   */
}