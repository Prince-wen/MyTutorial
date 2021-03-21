package com.shiwen.tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @create 2021-03-17 13:30
 * @note 注释
 */
object a_Annotation {

  /*
  scala注释的使用和Java完全一样。
   */

  //todo 1 单行注释
  //单行注释

  //todo 2 多行注释
  /*
  多行注释
   */

  //todo 3 文档注释
  /**
   * 文档注释
   */

  /**
   * idea中target目录是classpath路径
   *
   * Object是Scala为了模仿Java中的静态而产生的
   * class在Scala中是完全对象化的，不能直接执行的
   *
   * Object编译会产生两个字节码文件，~.class & ~$.class
   * class编译只会产生一个字节码文件，但这个字节码文件是不能执行的，需要被其他的方法调用才能执行。
   */
}
