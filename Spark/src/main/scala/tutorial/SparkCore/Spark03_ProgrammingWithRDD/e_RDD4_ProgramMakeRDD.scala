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
    //  从其他RDD创建
    //  直接new

    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc: SparkContext = new SparkContext(sparkConf)

    //todo Spark环境对象从集合中创建RDD
    val list = List(1,2,3,4)

    //>使用parallelize方法将集合转换为RDD,进行操作
    //parallelize:并行处理集合中的数据
//    val numRDD: RDD[Int] = sc.parallelize(list)
//    numRDD.collect().foreach(println)

    //>makeRDD 生成RDD对象
    //makeRDD的底层代码就是调用parallelize方法,所以逻辑上没有区别
//    val numRDD: RDD[Int] = sc.makeRDD(list)
//    numRDD.collect().foreach(println)

    //todo Spark环境对象从存储系统中创建RDD
    //所谓的存储系统，基本上就是文件系统，数据库，Hbase
    //path表示文件的相对路径
    //Spark环境通过textFile来读取文件，读取的方式一行一行来读取
    //路径可以使用星号进行通配操作
    //path路径可以是具体的文件，也可以是目录
//    val file: RDD[String] = sc.textFile("input/word.txt")
//    file.collect().foreach(println)

    //todo RDD并行度与分区
    //RDD的分区主要用于分布式计算，可以将数据发送到不同的Executor执行计算，和并行有关系
    //并行度表示在整个集群执行时，同时执行的任务的数量
    //分区的数量和并行度其实没有直接的关系，主要取决于CPU核的数量

    //RDD的分区数量是可以在创建时更改的，如果不更改，那么使用默认的分区。
    val number: RDD[Int] = sc.makeRDD(list)
    //将RDD保存成分区文件
    number.saveAsTextFile("output")//存的文件个数就是默认的并行度
    //默认的并行度参数
    sc.stop()
  }
}
