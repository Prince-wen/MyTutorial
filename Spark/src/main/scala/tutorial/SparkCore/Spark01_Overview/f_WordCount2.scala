package tutorial.SparkCore.Spark01_Overview

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-12 13:48
 * @note 使用另一种方式，进行真正的wordCount
 */
object f_WordCount2 {
  def main(args: Array[String]): Unit = {

    //todo 使用reduceByKey的方式要比groupBy + map()的性能要高一些

    val sparkConf: SparkConf = new SparkConf().setMaster("local").setAppName("wordCount")

    val sc: SparkContext = new SparkContext(sparkConf)

    /*val lines: RDD[String] = sc.textFile("input/words.txt")

    val word: RDD[String] = lines.flatMap(lines => lines.split(" "))

    val map: RDD[(String, Int)] = word.map(word => (word, 1))

    val result: RDD[(String, Int)] = map.reduceByKey(_ + _)

    result.collect().foreach(println)*/

    sc.textFile("input/words.txt")
      .flatMap(lines => lines.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
      .collect()
      .foreach(println)

    sc.stop()

  }
}
