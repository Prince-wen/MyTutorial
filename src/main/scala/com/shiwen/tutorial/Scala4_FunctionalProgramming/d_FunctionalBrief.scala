package com.shiwen.tutorial.Scala4_FunctionalProgramming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 11:50
 * @note 函数至简原则
 */
object d_FunctionalBrief {
  def main(args: Array[String]): Unit = {

    /**
     * 所谓的至简原则，其实就是Scala的作者为了开发人员能够大幅度提高开发效率。
     * 通过编译器的动态判定功能，帮助我们将函数声明中能简化的地方全部都进行了简化。
     * 也就是说将函数声明中那些能省的地方全部都省掉。所以这里的至简原则，简单来说就是：能省则省。
     */

    //todo 省略return关键字
    def fun1(): String = {
      return "zhangsan"
    }
    def fun11(): String = {
      "zhangsan"
    }

    //todo 省略花括号
    def fun2(): String = "zhangsan"

    //todo 省略返回值类型
    def fun3() = "zhangsan"

    //todo 省略参数列表
    def fun4 = "zhangsan"

    //todo 省略等号
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
    () => {
      println("zhangsan")
    }

  }
}
