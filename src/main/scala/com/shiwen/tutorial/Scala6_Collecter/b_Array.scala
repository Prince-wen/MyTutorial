package com.shiwen.tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 9:55
 * @note 数组
 */
object b_Array {

  //todo 不可变数组
  //1)	基本语法
  def mainImmutable1(args: Array[String]): Unit = {
    //（1）数组定义
    val arr01 = new Array[Int](4)
    println(arr01.length) // 4

    //（2）数组赋值
    //（2.1）修改某个元素的值
    arr01(3) = 10
    val i = 10
    arr01(i/3) = 20
    //（2.2）采用方法的形式修改数组的值
    arr01.update(0,1)

    //（3）遍历数组
    //（3.1）查看数组
    println(arr01.mkString(","))

    //（3.2）普通遍历
    for (i <- arr01) {
      println(i)
    }

    //（3.3）简化遍历
    def printx(elem:Int): Unit = {
      println(elem)
    }
    arr01.foreach(printx)
    arr01.foreach((x)=>{println(x)})
    arr01.foreach(println(_))
    arr01.foreach(println)
  }

  //2)	基本操作
  def mainImmutable2(args: Array[String]): Unit = {
    // 创建数组的另外一种方式
    val arr1 = Array(1,2,3,4)
    val arr2 = Array(5,6,7,8)
    // 添加数组元素，创建新数组
    val arr3: Array[Int] = arr1 :+ 5
    println( arr1 == arr3 ) // false

    val arr4: Array[Int] = arr1 ++: arr2
    // 添加集合
    val arr5: Array[Int] = arr1 ++ arr2

    arr4.foreach(println)
    println("****************")
    arr5.foreach(println)
    println("****************")
    // 多维数组
    var myMatrix = Array.ofDim[Int](3,3)
    myMatrix.foreach(list=>list.foreach(println))
    // 合并数组
    val arr6: Array[Int] = Array.concat(arr1, arr2)
    arr6.foreach(println)

    // 创建指定范围的数组
    val arr7: Array[Int] = Array.range(0,2)
    arr7.foreach(println)

    // 创建并填充指定数量的数组
    val arr8:Array[Int] = Array.fill[Int](5)(-1)
    arr8.foreach(println)
  }

  //todo 可变数组
  //1)	基本语法
  import scala.collection.mutable.ArrayBuffer
  def mainMutable1(args: Array[String]): Unit = {
    val buffer = new ArrayBuffer[Int]
    // 增加数据
    buffer.append(1,2,3,4)
    // 修改数据
    buffer.update(0,5)
    buffer(1) = 6
    // 删除数据
    val i: Int = buffer.remove(2)
    buffer.remove(2,2)
    // 查询数据
    println(buffer(3))
    // 循环集合
    for ( i <- buffer ) {
      println(i)
    }
  }
  //2)	基本操作
  //    import scala.collection.mutable.ArrayBuffer
  def mainMutable2(args: Array[String]): Unit = {
    val buffer1 = ArrayBuffer(1,2,3,4)
    val buffer2 = ArrayBuffer(5,6,7,8)

    val buffer3: ArrayBuffer[Int] = buffer1 += 5
    println( buffer1 eq buffer3 ) // true

    // 使用 ++ 运算符会产生新的集合数组
    val buffer4: ArrayBuffer[Int] = buffer1 ++ buffer2
    // 使用 ++= 运算符会更新之前的集合，不会产生新的数组
    val buffer5: ArrayBuffer[Int] = buffer1 ++= buffer2
    println( buffer1 eq buffer4 ) // false
    println( buffer1 eq buffer5 ) // true
  }

  //todo 可变数组和不可变数组转换
  import scala.collection.mutable
  //    import scala.collection.mutable.ArrayBuffer
  def mainSwitch(args: Array[String]): Unit = {
    val buffer = ArrayBuffer(1,2,3,4)
    val array = Array(4,5,6,7)

    // 将不可变数组转换为可变数组
    val buffer1: mutable.Buffer[Int] = array.toBuffer
    // 将可变数组转换为不可变数组
    val array1: Array[Int] = buffer.toArray
  }

}
