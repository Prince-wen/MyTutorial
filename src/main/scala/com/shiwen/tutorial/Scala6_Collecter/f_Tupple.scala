package com.shiwen.tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 10:14
 * @note Tupple元组
 */
object f_Tupple {

  /**
   * 在Scala语言中，我们可以将多个无关的数据元素封装为一个整体，这个整体我们称之为：
   * 元素组合，简称元组。有时也可将元组看成容纳元素的容器，其中最多只能容纳22个
   */

  def main(args: Array[String]): Unit = {

    // 创建元组，使用小括号
    val tuple = (1, "zhangsan", 30)

    // 根据顺序号访问元组的数据
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)
    // 迭代器
    val iterator: Iterator[Any] = tuple.productIterator

    // 根据索引访问元素
    tuple.productElement(0)
    // 获取整体
//    println(tuple.x)

    // 如果元组的元素只有两个，那么我们称之为对偶元组，也称之为键值对
    val kv: (String, Int) = ("a", 1)
    val kv1: (String, Int) = "a" -> 1
    println( kv eq kv1 )
  }

  /**
   * 思考两个问题:
   * 	只能放22个数据，是不是太少了呢？
   * 	函数的参数最多能放多少个呢？
   */

}
