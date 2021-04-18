package tutorial.SparkCore.Spark03_ProgrammingWithRDD

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-16 17:10
 * @note 核心属性
 */
object c_RDD2_Attribute {
  /**
   *  - A list of partitions
   *  - A function for computing each split
   *  - A list of dependencies on other RDDs
   *  - Optionally, a Partitioner for key-value RDDs (e.g. to say that the RDD is hash-partitioned)
   *  - Optionally, a list of preferred locations to compute each split on (e.g. block locations for
   *    an HDFS file)
   */
  def main(args: Array[String]): Unit = {
    /*
    	分区列表（数据数据哪个分区）
    RDD数据结构中存在分区列表，用于执行任务时并行计算，是实现分布式计算的重要属性。

    	分区计算函数（计算逻辑）
    Spark在计算时，是使用分区函数对每一个分区进行计算

    //RDD中只能保存单一的计算逻辑，如果有多个逻辑的话，需要创建多个逻辑并
    	RDD之间的依赖关系
    RDD是计算模型的封装，当需求中需要将多个计算模型进行组合时，就需要将多个RDD建立依赖关系

    	分区器（可选）
    当数据为KV类型数据时，可以通过设定分区器自定义数据的分区

    	首选位置（可选）
    计算数据时，可以根据计算节点的状态选择不同的节点位置进行计算
     */

  }
}
