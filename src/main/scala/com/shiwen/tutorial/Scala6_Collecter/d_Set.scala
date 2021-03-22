package com.shiwen.tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 10:09
 * @note Set集合
 */
object d_Set {

  //todo 不可变Set
  //1)	基本语法
  def main1(args: Array[String]): Unit = {

    val set1 = Set(1,2,3,4)
    val set2 = Set(5,6,7,8)

    // 增加数据
    val set3: Set[Int] = set1 + 5 + 6
    val set4: Set[Int] = set1.+(6,7,8)
    println( set1 eq set3 ) // false
    println( set1 eq set4 ) // false
    set4.foreach(println)
    // 删除数据
    val set5: Set[Int] = set1 - 2 - 3
    set5.foreach(println)

    val set6: Set[Int] = set1 ++ set2
    set6.foreach(println)
    println("********")
    val set7: Set[Int] = set2 ++: set1
    set7.foreach(println)
    println(set6 eq set7)
  }
  //2)	基本操作
  def main2(args: Array[String]): Unit = {

    val set1 = Set(1,2,3,4)
    val set2 = Set(5,6,7,8)

    // 增加数据
    val set3: Set[Int] = set1 + 5 + 6
    val set4: Set[Int] = set1.+(6,7,8)
    println( set1 eq set3 ) // false
    println( set1 eq set4 ) // false
    set4.foreach(println)
    // 删除数据
    val set5: Set[Int] = set1 - 2 - 3
    set5.foreach(println)

    val set6: Set[Int] = set1 ++ set2
    set6.foreach(println)
    println("********")
    val set7: Set[Int] = set2 ++: set1
    set7.foreach(println)
    println(set6 eq set7)
  }
  //todo 可变Set
  //1)	基本语法
  import scala.collection.mutable
  def main3(args: Array[String]): Unit = {

    val set1 = mutable.Set(1,2,3,4)
    val set2 = mutable.Set(5,6,7,8)

    // 增加数据
    set1.add(5)
    // 添加数据
    set1.update(6,true)
    println(set1.mkString(","))
    // 删除数据
    set1.update(3,false)
    println(set1.mkString(","))

    // 删除数据
    set1.remove(2)
    println(set1.mkString(","))

    // 遍历数据
    set1.foreach(println)
  }
  //2)	基本操作
  import scala.collection.mutable
  def main4(args: Array[String]): Unit = {

    val set1 = mutable.Set(1,2,3,4)
    val set2 = mutable.Set(4,5,6,7)

    // 交集
    val set3: mutable.Set[Int] = set1 & set2
    println(set3.mkString(","))
    // 差集
    val set4: mutable.Set[Int] = set1 &~ set2
    println(set4.mkString(","))
  }


}
