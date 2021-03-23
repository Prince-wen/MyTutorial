package com.shiwen.tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:21
 * @note 常用方法
 */
object j_Method {
  def main(args: Array[String]): Unit = {

    //todo 1)	常用方法
    def main1(args: Array[String]): Unit = {
      val list = List(1,2,3,4)

      // 集合长度
      println("size =>" + list.size)
      println("length =>" + list.length)
      // 判断集合是否为空
      println("isEmpty =>" + list.isEmpty)
      // 集合迭代器
      println("iterator =>" + list.iterator)
      // 循环遍历集合
      list.foreach(println)
      // 将集合转换为字符串
      println("mkString =>" + list.mkString(","))
      // 判断集合中是否包含某个元素
      println("contains =>" + list.contains(2))
      // 取集合的前几个元素
      println("take =>" + list.take(2))
      // 取集合的后几个元素
      println("takeRight =>" + list.takeRight(2))
      // 查找元素
      println("find =>" + list.find(x => x % 2== 0))
      // 丢弃前几个元素
      println("drop =>" + list.drop(2))
      // 丢弃后几个元素
      println("dropRight =>" + list.dropRight(2))
      // 反转集合
      println("reverse =>" + list.reverse)
      // 去重
      println("distinct =>" + list.distinct)
    }
    //todo 2)	衍生集合
    def main2(args: Array[String]): Unit = {
      val list = List(1,2,3,4)
      val list1 = List(3,4,5,6)

      // 集合头
      println("head => " + list.head)
      // 集合尾
      println("tail => " + list.tail)
      // 集合尾迭代
      println("tails => " + list.tails)
      // 集合初始化
      println("init => " + list.init)
      // 集合初始化迭代
      println("inits => " + list.inits)
      // 集合最后元素
      println("last => " + list.last)
      // 集合并集
      println("union => " + list.union(list1))
      // 集合交集
      println("intersect => " + list.intersect(list1))
      // 集合差集
      println("diff => " + list.diff(list1))
      // 切分集合
      println("splitAt => " + list.splitAt(2))
      // 滑动
      println("sliding => " + list.sliding(2))
      // 滚动
      println("sliding => " + list.sliding(2,2))
      // 拉链
      println("zip => " + list.zip(list1))
      // 数据索引拉链
      println("zipWithIndex => " + list.zipWithIndex)
    }

    //todo 3)	计算函数
    def main3(args: Array[String]): Unit = {
      val list = List(1,2,3,4)
      val list1 = List(3,4,5,6)

      // 集合最小值
      println("min => " + list.min)
      // 集合最大值
      println("max => " + list.max)
      // 集合求和
      println("sum => " + list.sum)
      // 集合乘积
      println("product => " + list.product)
      // 集合简化规约
      println("reduce => " + list.reduce((x:Int,y:Int)=>{x+y}))
      println("reduce => " + list.reduce((x,y)=>{x+y}))
      println("reduce => " + list.reduce((x,y)=>x+y))
      println("reduce => " + list.reduce(_+_))
      // 集合简化规约(左)
      println("reduceLeft => " + list.reduceLeft(_+_))
      // 集合简化规约(右)
      println("reduceRight => " + list.reduceRight(_+_))
      // 集合折叠
      println("fold => " + list.fold(0)(_+_))
      // 集合折叠(左)
      println("foldLeft => " + list.foldLeft(0)(_+_))
      // 集合折叠(右)
      println("foldRight => " + list.foldRight(0)(_+_))
      // 集合扫描
      println("scan => " + list.scan(0)(_+_))
      // 集合扫描(左)
      println("scanLeft => " + list.scanLeft(0)(_+_))
      // 集合扫描(右)
      println("scanRight => " + list.scanRight(0)(_+_))
    }

    //todo 4)	功能函数
    def main4(args: Array[String]): Unit = {
      val list = List(1,2,3,4)

      // 集合映射
      println("map => " + list.map(x=>{x*2}))
      println("map => " + list.map(x=>x*2))
      println("map => " + list.map(_*2))
      // 集合扁平化
      val list1 = List(
        List(1,2),
        List(3,4)
      )
      println("flatten =>" + list1.flatten)
      // 集合扁平映射
      println("flatMap =>" + list1.flatMap(list=>list))
      // 集合过滤数据
      println("filter =>" + list.filter(_%2 == 0))
      // 集合分组数据
      println("groupBy =>" + list.groupBy(_%2))
      // 集合排序
      println("sortBy =>" + list.sortBy(num=>num)(Ordering.Int.reverse))
      println("sortWith =>" + list.sortWith((left, right) => {left < right}))
    }

  }
}
