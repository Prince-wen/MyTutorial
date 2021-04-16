package tutorial.SparkCore.Spark03_ProgrammingWithRDD

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-16 17:37
 * @note
 */
object e_RDD4_ProgramMakeRDD {
  def main(args: Array[String]): Unit = {
    //todo make a RDD
    //1.创建方式
    //  内存中创建：List(1,2,3,4)
    //  存储中创建：File
    //  从RDD创建
    //  直接new

    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkConf)

    //todo Spark环境对象从集合中创建RDD
    val list = List(1,2,3,4)

    //使用parallelize方法将集合转换为RDD,进行操作
//    val numRDD: RDD[Int] = sc.parallelize(list)
//    numRDD.collect().foreach(println)

    //makeRDD 生成RDD对象
    //makeRDD的底层代码就是调用parallelize方法
    val numRDD: RDD[Int] = sc.makeRDD(list)
    numRDD.collect().foreach(println)

    sc.stop()
  }
}
