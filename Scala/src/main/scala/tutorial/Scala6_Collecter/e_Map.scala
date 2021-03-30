package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 10:12
 * @note Map集合
 */
object e_Map {
  /**
   * Map(映射)是一种可迭代的键值对（key/value）结构。所有的值都可以通过键来获取。Map 中的键都是唯一的。
   */

  //todo 不可变Map
  //1)	基本语法
  def main1(args: Array[String]): Unit = {
    val map1 = Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    val map2 = Map( "d" -> 4, "e" -> 5, "f" -> 6 )
    // 添加数据
    val map3 = map1 + ("d" -> 4)
    println(map1 eq map3) // false
    // 删除数据
    val map4 = map3 - "d"
    println(map4.mkString(","))
    val map5: Map[String, Int] = map1 ++ map2
    println(map5 eq map1)
    println(map5.mkString(","))
    val map6: Map[String, Int] = map1 ++: map2
    println(map6 eq map1)
    println(map6.mkString(","))
    // 修改数据
    val map7: Map[String, Int] = map1.updated("b", 5)
    println(map7.mkString(","))
    // 遍历数据
    map1.foreach(println)
  }
  //2)	基本操作
  def main2(args: Array[String]): Unit = {
    val map1 = Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    val map2 = Map( "d" -> 4, "e" -> 5, "f" -> 6 )
    // 创建空集合
    val empty: Map[String, Int] = Map.empty
    println(empty)
    // 获取指定key的值
    val i: Int = map1.apply("c")
    println(i)
    println(map1("c"))
    // 获取可能存在的key值
    val maybeInt: Option[Int] = map1.get("c")
    // 判断key值是否存在
    if ( !maybeInt.isEmpty ) {
      // 获取值
      println(maybeInt.get)
    } else {
      // 如果不存在，获取默认值
      println(maybeInt.getOrElse(0))
    }
    // 获取可能存在的key值, 如果不存在就使用默认值
    println(map1.getOrElse("c", 0))
  }

  //todo 可变Map
  //1)	基本语法
  import scala.collection.mutable
  def main3(args: Array[String]): Unit = {
    val map1 = mutable.Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    val map2 = mutable.Map( "d" -> 4, "e" -> 5, "f" -> 6 )
    // 添加数据
    map1.put("d", 4)
    val map3: mutable.Map[String, Int] = map1 + ("e" -> 4)
    println(map1 eq map3)
    val map4: mutable.Map[String, Int] = map1 += ("e" -> 5)
    println(map1 eq map4)
    // 修改数据
    map1.update("e",8)
    map1("e") = 8
    // 删除数据
    map1.remove("e")
    val map5: mutable.Map[String, Int] = map1 - "e"
    println(map1 eq map5)
    val map6: mutable.Map[String, Int] = map1 -= "e"
    println(map1 eq map6)
    // 清除集合
    map1.clear()
  }
  //2)	基本操作
  import scala.collection.mutable
  def main4(args: Array[String]): Unit = {
    val map1 = mutable.Map( "a" -> 1, "b" -> 2, "c" -> 3 )
    val map2 = mutable.Map( "d" -> 4, "e" -> 5, "f" -> 6 )
    val set: Set[(String, Int)] = map1.toSet
    val list: List[(String, Int)] = map1.toList
    val seq: Seq[(String, Int)] = map1.toSeq
    val array: Array[(String, Int)] = map1.toArray
    println(set.mkString(","))
    println(list.mkString(","))
    println(seq.mkString(","))
    println(array.mkString(","))
    println(map1.get("a"))
    println(map1.getOrElse("a", 0))
    println(map1.keys)
    println(map1.keySet)
    println(map1.keysIterator)
    println(map1.values)
    println(map1.valuesIterator)
  }
}
