package tutorial.Scala6_Collecter

import scala.io.Source

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:23
 * @note 案例，文字统计前n个
 *       wordcounttopN
 */
object j_CaseWordCountTopN {
  def main(args: Array[String]): Unit = {

    val list: List[String] = Source.fromFile("input/word.txt").getLines().toList

    val wordList: List[String] = list.flatMap(_.split(" "))

    val word2OneList: List[(String, Int)] = wordList.map((_,1))

    val word2ListMap: Map[String, List[(String, Int)]] = word2OneList.groupBy(_._1)

    val word2CountMap: Map[String, Int] = word2ListMap.map(
      kv => {
        (kv._1, kv._2.size)
      }
    )
    println(word2CountMap)

  }

/*
  // 小练习1 - 不同结构的wordcount
  val dataList = List(
    ("Hello Scala", 4), ("Hello Spark", 2)
  )
  // 小练习2 - 不同省份商品点击排行
  //数据在资料中：data.txt
*/

}
