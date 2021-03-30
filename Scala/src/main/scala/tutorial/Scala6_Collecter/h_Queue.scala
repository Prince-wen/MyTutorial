package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:14
 * @note 队列
 */
object h_Queue {
  def main(args: Array[String]): Unit = {
    /**
     * Scala也提供了队列（Queue）的数据结构，队列的特点就是先进先出。进队和出队的方法分别为enqueue和dequeue。
     */
    import scala.collection.mutable

    val que = new mutable.Queue[String]()
    // 添加元素
    que.enqueue("a", "b", "c")
    val que1: mutable.Queue[String] = que += "d"
    println(que eq que1)
    // 获取元素
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())
  }

  /**
   * 思考一个问题:
   * 	kafka中如何保证消费数据的有序？
   */

}
