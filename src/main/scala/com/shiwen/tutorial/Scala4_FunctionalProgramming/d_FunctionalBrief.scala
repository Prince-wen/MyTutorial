package com.shiwen.tutorial.Scala4_FunctionalProgramming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 11:50
 * @note 函数至简原则
 */
object d_FunctionalBrief {
  /**
   * 所谓的至简原则，其实就是Scala的作者为了开发人员能够大幅度提高开发效率。
   * 通过编译器的动态判定功能，帮助我们将函数声明中能简化的地方全部都进行了简化。
   * 也就是说将函数声明中那些能省的地方全部都省掉。所以这里的至简原则，简单来说就是：能省则省。
   */

  //todo 省略return关键字
  //  1.当函数需要返回值时，可以将函数体中最后一行执行的代码作为返回结果，所以可以省略return关键字
  def fun1(): String = {
    return "zhangsan"
  }
  def fun11(): String = {
    "zhangsan"
  }

  //todo 省略返回值类型
  //  2.如果编译器可以推断出函数的返回值类型，那么返回值类型可以省略
  def fun3() = "zhangsan"

  //todo 省略花括号
  //  3.如果函数体逻辑只有一行代码，那么大括号可以省略
  def fun2(): String = "zhangsan"

  //todo 省略参数列表
  //  4.如果函数没有提供参数，那么调用的时候，小括号可以省略
  //    如果函数没有提供参数，那么声明时，小括号可以省略，调用时，必须不能使用小括号
  def fun4 = "zhangsan"

  //todo 省略等号
  //  5.函数如果明确使用Unit声明没有返回值，那么函数体中的return关键字不起作用
  //    函数如如果明确使用return关键字，那么返回值类型不能省
  //    明确函数就是没有返回值，但是Unit又不想声明，那么可以同时省略等号
  //    将这种函数的声明方式称之为过程函数(procedure function)，不省略花括号
  //如果函数体中有明确的return语句，那么返回值类型不能省略
  def fun5(): String = {
    return "zhangsan"
  }
  println(fun5())

  //如果函数体返回值类型明确为Unit, 那么函数体中即使有return关键字也不起作用
  def fun55(): Unit = {
    return "zhangsan"
  }
  println(fun55())

  //如果函数体返回值类型声明为Unit, 但是又想省略，那么此时就必须连同等号一起省略
  def fun555() {
    return "zhangsan"
  }
  println(fun555())

  //todo 省略名称和关键字
  //  6.当只关心代码逻辑，不关心函数名称时，函数名和def关键字可以省略
  //    将没有名称和def关键字的函数称之为匿名函数
  //    规则： (参数列表) => { 代码逻辑 }
  //
  () => {
    println("zhangsan")
  }

  val a = () => { println("no name") }
  //调用
  a()

}
