package tutorial.Scala6_Collecter

import scala.collection.mutable

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-31 14:51
 * @note
 */
object k_writeACode {
  def main(args: Array[String]): Unit = {

    val list: List[(String, Int)] = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )
/*
    val result4: List[(String, Int)] = list
      .flatMap((kv: (String, Int)) => {
        val map: mutable.Map[String, Int] = mutable.Map[String, Int]()
        kv._1.split(" ").foreach(word => {
          map.put(word, kv._2)
        })
        map.toList
      })
      .groupBy(kv => {
        kv._1
      })
      .map(kv => {
        val list: List[(String, Int)] = kv._2
        var count = 0
        list.foreach(kv => {
          count += kv._2
        })
        (kv._1, count)
      })
      .toList.sortBy(_._2)(Ordering.Int.reverse)
      .take(3)

    println(result4)

    println("***********")

    val str: String = "hello hello hello hello hello hello hello hello "
    val list1: List[(String, Int)] = str
      .split(" ")
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.size))
      .toList

    println(str.size)

    println(list1)*/

    /**
     * 面对需求的解决流程：
     * 1.需求分析
     *    数据源
     *    结果目标
     *    补充缺少的内容，过滤多余的内容
     *    描述中间步骤（图/文）
     * 2.需求设计
     *    按照描述好的中间步骤和补充过滤的要求整理思路
     *    确认思路后将每个步骤翻译成实现的方法和流程
     * 3.代码实现
     *    使用注释将思路和流程表述在代码中
     *    可以将复杂的数据结构变换的过程表述出来（Scala类型推断的数据类型也可以）
     *    按照步骤写出代码
     * 4.测试
     *    功能检测
     *    从代码层面将代码优化
     */

    //data source structer
    println(list)

    //List( (String,Int) )
    val value: List[(String, Int)] = list
      .flatMap(kv => {
        kv._1.split(" ").toList.map(word => {
          (word, kv._2)
        })
      })
      .groupBy(_._1)
      .map(list => {
        val sum: Int = list._2.map(kv => {
          kv._2
        }).sum
        (list._1,sum)
      })
      .toList
      .sortBy(_._2)(Ordering.Int.reverse)
      .take(3)

//    println(value)


    val sortresult: List[(String, Int)] = list
      .flatMap(kv => {
        kv._1.split(" ").toList.map(word => {
          (word, kv._2)
        })
      })
      .groupBy(_._1)
      .map(list => {
        val sum: Int = list._2.map(kv => {
          kv._2
        }).sum
        (list._1, sum)
      })
      .toList
      .sortWith((l, r) => {//sortWith使用方法
        if (l._2 > r._2) {
          true //左大右小降序
        } else if (l._1 < r._1) {
          true //字符串升序
        } else {
          false //其他情况不符合，需要互换位置
        }
      })
      .take(3)

    println(sortresult)
  }
}
