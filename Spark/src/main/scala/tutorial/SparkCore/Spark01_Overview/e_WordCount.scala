package tutorial.SparkCore.Spark01_Overview

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-12 11:20
 * @note WordCount
 */
object e_WordCount {
  def main(args: Array[String]): Unit = {

    //todo 使用Spark框架来完成WordCount的统计

    //todo 1.获取Spark框架的环境（连接）
    //SparkContext
    //创建Spark的基础配置
    val sparkConf: SparkConf = new SparkConf().setMaster("local").setAppName("wordCount")
    //根据配置创建上下环境连接对象
    val sc: SparkContext = new SparkContext(sparkConf)

    //todo 2.对象Spark环境对数据进行处理（API）
    //2.1从文本中读取数据
    //Scala：Source.fromFile()
    //textFile:Spark框架可以从文件中的内容一行一行的读取进来
    val lines: RDD[String] = sc.textFile("input/words.txt")

    //2.2 将每一行的字符串进行分词操作：扁平化
    val words: RDD[String] = lines.flatMap(line => line.split(" "))

    //2.3 将相同的单词分到一个组中
    val group: RDD[(String, Iterable[String])] = words.groupBy(word => word)

    //2.4 将分组后的数据进行统计（Iterable，length）
    val wordToCount: RDD[(String, Int)] = group.mapValues(list => list.size)

    //2.5 将采集的数据打印到控制台
    wordToCount.collect().foreach(println)

    //todo 3.将环境（连接）关闭掉
    sc.stop()

  }
}
