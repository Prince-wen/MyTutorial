package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 10:02
 * @note Seq集合
 */
object c_Seq {

  //todo 不可变List
  //1)	基本语法
  def main1(args: Array[String]): Unit = {
    // Seq集合
    val list = List(1,2,3,4)
    // 增加数据
    val list1: List[Int] = list :+ 1
    println(list1 eq list)
    list1.foreach(println)
    val list2: List[Int] = 1 +: list
    list2.foreach(println)
    println("*****************")
    val list3: List[Int] = list.updated(1,5)
    println(list eq list3)
    list3.foreach(println)
  }
  //2)	基本操作
  def main2(args: Array[String]): Unit = {
    // Seq集合
    val list1 = List(1,2,3,4)
    // 空集合
    val list2: List[Nothing] = List()
    val nil = Nil
    println(list2 eq nil)
    // 创建集合
    val list3: List[Int] = 1::2::3::Nil
    val list4: List[Int] = list1 ::: Nil//扁平化操作
    // 连接集合
    val list5: List[Int] = List.concat(list3, list4)
    list5.foreach(println)
    // 创建一个指定重复数量的元素列表
    val list6: List[String] = List.fill[String](3)("a")
    list6.foreach(println)
  }

  //todo 可变List
  //1)	基本语法
  import scala.collection.mutable.ListBuffer
  def main3(args: Array[String]): Unit = {
    // 可变集合
    val buffer = new ListBuffer[Int]()
    // 增加数据
    buffer.append(1,2,3,4)
    // 修改数据
    buffer.update(1,3)
    // 删除数据
    buffer.remove(2)
    buffer.remove(2,2)
    // 获取数据
    println(buffer(1))
    // 遍历集合
    buffer.foreach(println)
  }
  //2)	基本操作
  import scala.collection.mutable.ListBuffer
  def main4(args: Array[String]): Unit = {
    // 可变集合
    val buffer1 = ListBuffer(1,2,3,4)
    val buffer2 = ListBuffer(5,6,7,8)
    // 增加数据
    val buffer3: ListBuffer[Int] = buffer1 :+ 5
    val buffer4: ListBuffer[Int] = buffer1 += 5
    val buffer5: ListBuffer[Int] = buffer1 ++ buffer2
    val buffer6: ListBuffer[Int] = buffer1 ++= buffer2
    println( buffer5 eq buffer1 )
    println( buffer6 eq buffer1 )
//    val buffer7: ListBuffer[Int] = buffer1 - 2
    val buffer8: ListBuffer[Int] = buffer1 -= 2
//    println( buffer7 eq buffer1 )
    println( buffer8 eq buffer1 )
  }

  //todo 可变集合和不可变集合转换
  import scala.collection.mutable
  import scala.collection.mutable.ListBuffer
  def main5(args: Array[String]): Unit = {
    val buffer = ListBuffer(1,2,3,4)
    val list = List(5,6,7,8)
    // 可变集合转变为不可变集合
    val list1: List[Int] = buffer.toList
    // 不可变集合转变为可变集合
    val buffer1: mutable.Buffer[Int] = list.toBuffer
  }
}
