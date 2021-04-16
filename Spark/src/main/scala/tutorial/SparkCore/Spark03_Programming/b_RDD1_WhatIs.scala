package tutorial.SparkCore.Spark03_Programming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-16 17:07
 * @note 什么是RDD
 */
object b_RDD1_WhatIs {
  /**
   * RDD（Resilient Distributed Dataset）叫做弹性分布式数据集，是Spark中最基本的数据处理模型。代码中是一个抽象类，它代表一个弹性的、不可变、可分区、里面的元素可并行计算的集合。
   * 	弹性
   * 	存储的弹性：内存与磁盘的自动切换；
   * 	容错的弹性：数据丢失可以自动恢复；
   * 	计算的弹性：计算出错重试机制；
   * 	分片的弹性：可根据需要重新分片。
   * 	分布式：数据存储在大数据集群不同节点上
   * 	数据集：RDD封装了计算逻辑，并不保存数据
   * 	数据抽象：RDD是一个抽象类，需要子类具体实现
   * 	不可变：RDD封装了计算逻辑，是不可以改变的，想要改变，只能产生新的RDD，在新的RDD里面封装计算逻辑
   * 	可分区、并行计算
   */
}
