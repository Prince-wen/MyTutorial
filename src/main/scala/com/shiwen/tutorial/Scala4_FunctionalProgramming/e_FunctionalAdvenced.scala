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
//  val f11:()=>String = fun1 _d

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
  //匿名函数规则： (参数列表)=> {代码逻辑}
  def fun4( f:Int => Int ): Int = {
    f(10)
  }
  //匿名函数的至简原则
  println( fun4( (x:Int)=>{x * 20} ) )//参数类型可以推断，参数类型省略
  println(fun4((x)=>{x * 20}))//代码逻辑只有一行，大括号省略
  println(fun4((x)=>x * 20))//参数只有一个，括号省略
  println(fun4(x=>x * 20))//函数中的参数在逻辑中，用且只用了一次，那么 “参数=>” 可以省略
  println(fun4(_ * 20))//在匿名函数中使用下划线代替参数使用
  //也可以将下划线理解为占位符，当存在 (x,y)=>(x+y)的时候，可以转换为(_+_)的形式

  //()=>集合
  val name = "zhangsan";val password = "123456"
  //需要注意的是，println()这个函数只有一个参数：Any
  //而函数如果只有一个参数或者没有参数，那么调用时，小括号可以省略
  println(("name = "+name,"password = "+password))//打印Tupple的完整写法
  println("name = "+name,"password = "+password)//Tupple省略了括号后
  println("name = "+name+",password = "+password)//字符串拼接

  //匿名函数后面的代码不执行，而且匿名函数没有单独声明的用法

  //todo 嵌套函数
  def fun(j : Int): Int => Int ={

    def test(i : Int)={
      i * j
    }

    test
  }

  //todo 闭包
  /**
   * 函数在使用外部变量时，如果外部变量失效，会将这个外部变量包含到当前的函数内部
   * 形成闭合的使用效果，改变变量的生命周期（我没有这个变量，但是我可以用）
   * 将这种操作称之为closure(闭包)
   *
   * 1.反编译后，发现编译器重新声明了内部函数的参数，将使用外部变量的参数作为内部参数。
   * 2.在早期的Scala版本(2.11)，闭包会被编译为匿名函数类，如果使用外部变量，会将外部变量作为类的属性
   *  同时，即使没有使用外部变量，也会有闭包的效果，只是没有包含外部变量
   * 3.Spark判断闭包的方式：判断类名中是否为匿名函数类
   * 4.判断：  >匿名函数肯定为闭包，
   *          >将函数值赋值给变量使用也是闭包，
   *          >嵌套的内部函数在外部使用会有闭包
   *
   * 栈上分配：用完就抛弃的对象保存到栈中，用完就抛弃
   * 逃逸分析：判断一个对象是否可以被抛弃，需要先判断这个对象是否有相关的引用正在被使用，如果没有才能抛弃，否则应当保留。
   */
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
   * 并不能完全决定，还是要依据是否使用了外部变量，改变了声明周期。并且已经逐渐变成了一个理论性的概念。
   * 如果是2.11版本，最好是将编译出来的字节码文件中是否有匿名函数类作为主要的依据。
   */

  //todo 函数柯里化
  /**
   * 所谓的函数柯里化就是多个参数列表
   * 1.简化嵌套函数开发
   * 2.将复杂的逻辑简单化，可以支持更多的语法。
   */
  def fun6(i:Int)(j:Int) = {
    i * j
  }

  //todo 控制抽象
  /**
   * 参数列表中如果有多行逻辑，可以用大括号代替小括号
   * Scala支持将代码逻辑作为参数传递给函数使用
   * 如果函数参数想要传递代码逻辑，那么类型声明的方式应该为：
   * 参数名: => 返回值类型 (Unit)
   */
  def fun7(op: => Unit) = {
    op
  }
  fun7{
    println("xx")
  }

  //todo 递归函数
  /**
   * 1.方法执行过程中调用自身
   * 2.存在可以跳出递归的逻辑，可能会存在StackOverflowError(栈滚动错误；又叫栈溢出)
   * 3.方法调用时，传递的参数之间应该存在规律
   * 4.Scala中递归方法需要明确返回值类型，并且不能省略
   */
  def fun8(j:Int):Int = {
    if ( j <= 1 ) {
      1
    } else {
      j * fun8(j-1)
    }
  }
  println(fun8(5))
  /**
   * 递归函数-尾递归
   * 递归的方法不依赖于其他外部变量
   * 编译器碰见尾递归操作时会自动优化为while循环
   */
  def tailRecursion( i : Int, result : Int ):Int ={
    if (i <= 1) {
      result
    } else {
      tailRecursion( i-1 , i + result )
    }
  }
  def main(args: Array[String]): Unit = {
    println("||||||||||||||")
    println(tailRecursion(5, 1))
  }

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
   * 函数是相对于Java中的method的另一种叫法，function既可以理解为单独的方法，不依赖于类和对象的方法，也可以理解为和方法相同的意思。
   * 	如果一台机器想让另外一台机器执行函数功能怎么办？
   */

}
