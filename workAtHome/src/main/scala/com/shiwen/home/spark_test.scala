package com.shiwen.home

import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

/**
 * @author Shiwen Li CN116237626
 * @create 2021-10-13 14:04
 * @note
 */
object spark_test {
  def main(args: Array[String]): Unit = {

    val conf: SparkConf = new SparkConf().setAppName("test").setMaster("local")
    val spark: SparkSession = new SparkSession.Builder().config(conf).getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val query: DataFrame = spark.sql("select unix_timestamp() ")

    query.show(false)

    spark.close()

  }
}
