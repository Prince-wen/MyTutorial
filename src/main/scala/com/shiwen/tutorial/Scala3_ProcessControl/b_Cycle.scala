package com.shiwen.tutorial.Scala3_ProcessControl

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 17:06
 * @note 循环控制
 */
object b_Cycle {
  /**
   * 有的时候，我们可能需要多次执行同一块代码。
   * 一般情况下，语句是按顺序执行的：函数中的第一个语句先执行，接着是第二个语句，依此类推。
   * 编程语言提供了更为复杂执行路径的多种控制结构。循环语句允许我们多次执行一个语句或语句组
   * Scala语言提供了以下几种循环类型
   */

  //todo for循环
  /**
   * 1)	基本语法
   * for ( 循环变量 <- 数据集 ) {
   *   循环体
   * }
   * 这里的数据集可以是任意类型的数据集合，如字符串，集合，数组等，这里我们还没有讲到集合，数组语法，请大家不要着急，先能演示例子，后面咱们详细讲。
   */
  def Loop1(args: Array[String]): Unit = {
    for ( i <- Range(1,5) ) { // 范围集合
      println("i = " + i )
    }
    for ( i <- 1 to 5 ) { // 包含5
      println("i = " + i )
    }
    for ( i <- 1 until 5 ) { // 不包含5
      println("i = " + i )
    }
  }

  /**
   * 2)	循环守卫
   * 循环时可以增加条件来决定是否继续循环体的执行,这里的判断条件我们称之为循环守卫
   */
  def Loop2(args: Array[String]): Unit = {
    for ( i <- Range(1,5) if i != 3  ) {
      println("i = " + i )
    }
  }

  /**
   * 3)	循环步长
   * scala的集合也可以设定循环的增长幅度，也就是所谓的步长step
   */
  def Loop3(args: Array[String]): Unit = {
    for ( i <- Range(1,5,2) ) {
      println("i = " + i )
    }
    for ( i <- 1 to 5 by 2 ) {
      println("i = " + i )
    }
  }

  /**
   * 4)
   * 循环嵌套
   */
  def Loop4(args: Array[String]): Unit = {
    for ( i <- Range(1,5); j <- Range(1,4) ) {
      println("i = " + i + ",j = " + j )
    }
    for ( i <- Range(1,5) ) {
      for ( j <- Range(1,4) ) {
        println("i = " + i + ",j = " + j )
      }
    }
  }
  //请好好体会上面两种嵌套方式的区别。
  /**
   * 5)	引入变量
   */
  def Loop5(args: Array[String]): Unit = {
    for ( i <- Range(1,5); j = i - 1 ) {
      println("j = " + j )
    }
  }

  /*
  思考一个问题: 你们学java的时候都学过杨辉三角，那如何只使用一次for循环实现九层妖塔呢？蒙了吧？什么是九层妖塔！
  *
  ***
  *****
  *******
  *********
  ***********
  *************
  ***************
  *****************
   */
  /**
   * 6)	循环返回值
   * scala所有的表达式都是有返回值的。但是这里的返回值并不一定都是有值的哟。
   * 如果希望for循环表达式的返回值有具体的值，需要使用关键字yield
   */
  def Loop6(args: Array[String]): Unit = {
    val result = for ( i <- Range(1,5) ) yield {
      i * 2
    }
    println(result)
  }

  /**
   * 思考两个问题:
   * 	怎么全是问题？
   * 	Java中的线程有yield方法，Scala中该如何调用？
   */

  //todo while循环
  /**
   * 1)	基本语法
   * 当循环条件表达式返回值为true时，执行循环体代码
   * while( 循环条件表达式 ) {
   *   循环体
   * }
   * 一种特殊的while循环就是，先执行循环体，再判断循环条件是否成立
   * do {
   *   循环体
   * } while ( 循环条件表达式 )
   * 2)	while循环
   */
  def Loop7(args: Array[String]): Unit = {
    var i = 0
    while ( i < 5 ) {
      println(i)
      i += 1
    }
  }

  /**
   * 3)	do...while循环
   */
  def Loop8(args: Array[String]): Unit = {
    var i = 5
    do {
      println(i)
    } while ( i < 5 )
  }

  //todo 循环中断
  /**
   * scala是完全面向对象的语言，所以无法使用break，continue关键字这样的方式来中断，或继续循环逻辑，
   * 而是采用了函数式编程的方式代替了循环语法中的break和continue
   */
  def Loop9(args: Array[String]): Unit = {
    scala.util.control.Breaks.breakable {
      for ( i <- 1 to 5 ) {
        if ( i == 3 ) {
          scala.util.control.Breaks.break
        }
        println(i)
      }
    }
  }

}
