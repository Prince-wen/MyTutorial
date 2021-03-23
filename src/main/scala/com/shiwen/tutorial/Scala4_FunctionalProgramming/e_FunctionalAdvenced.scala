package com.shiwen.tutorial.Scala4_FunctionalProgramming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 12:37
 * @note 高阶函数编程
 */
object e_FunctionalAdvenced {
  /**
   * 所谓的高阶函数，其实就是将函数当成一个类型来使用，而不是当成特定的语法结构。
   */

  //todo 函数作为值
  def fun1(): String = {
    "zhangsan"
  }
  val a = fun1
  val b = fun1 _
  println(a)
  println(b)
  //如果不想使用下划线明确将函数作为整体使用，那么也可以直接声明变量的类型为
  //函数类型：参数列表 => 返回值类型
//  val f11:()=>String = fun1 _

  def ffff():String = {
    "ffff"
  }
  val ff1 = ffff
  //todo 函数作为参数
  def fun2( i:Int ): Int = {
    i * 2
  }
  def fun22( f : Int => Int ): Int = {
    f(10)
  }
  println(fun22(fun2))

  //todo 函数作为返回值
  def fun3( i:Int ): Int = {
    i * 2
  }
  def fun33( ) = {
    fun3 _
  }
  println(fun33()(10))

  //todo 匿名函数
  def fun4( f:Int => Int ): Int = {
    f(10)
  }
  println(fun4((x:Int)=>{x * 20}))
  println(fun4((x)=>{x * 20}))
  println(fun4((x)=>x * 20))
  println(fun4(x=>x * 20))
  println(fun4(_ * 20))

  //todo 闭包
  def fun5() = {
    val i = 20
    def fun55() = {
      i * 2
    }
    fun55 _
  }
  fun5()()

  /**
   * 问题: 没有使用外部变量还能称之为闭包吗？
   */

  //todo 函数柯里化
  def fun6(i:Int)(j:Int) = {
    i * j
  }

  //todo 控制抽象
  def fun7(op: => Unit) = {
    op
  }
  fun7{
    println("xx")
  }

  //todo 递归函数
  def fun8(j:Int):Int = {
    if ( j <= 1 ) {
      1
    } else {
      j * fun8(j-1)
    }
  }
  println(fun8(5))

  /**
   * 思考两个问题:
   * 	递归常用吗？
   * 	递归会出问题吗？
   */

  //todo 惰性函数
  //当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。这种函数我们称之为惰性函数。
  def fun9(): String = {
    println("function...")
    "zhangsan"
  }
  lazy val aa = fun9()
  println("----------")
  println(aa)

  /**
   * 思考两个问题:
   * 	函数到底是什么？实现原理？
   * 	如果一台机器想让另外一台机器执行函数功能怎么办？
   */

}
