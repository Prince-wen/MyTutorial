package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:14
 * @note 队列
 */
object g_Queue {
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
   *
   * BlockingQueue（阻塞式队列）
   * 如果在生产者端的队列数据放满了，消费速度较慢，则阻塞生产者，
   * 同理，如果消费者端的队列数据取完了，生产速度较慢，则阻塞消费者。
   * Deque（双端队列）
   * 当生产者的数据发送失败的时候，重新发送的数据如果加入到队列尾部，就无法保证原有顺序，而双端队列就可以解决这种问题。
   */

}
