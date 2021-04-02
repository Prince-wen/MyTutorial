package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:17
 * @note 并行
 */
object h_Parallel {
  def main(args: Array[String]): Unit = {
    /**
     * Scala为了充分使用多核CPU，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算。
     */
    val result1 = (0 to 100).map{x => Thread.currentThread.getName}
//    val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

    println(result1)
//    println(result2)

    /**
     * 思考两个问题:
     * 	并发&并行？
     * 并发与并行是两个既相似而又不相同的概念：
     * 并发性，又称共行性，是指能处理多个同时性活动的能力；
     * 并行是指同时发生的两个并发事件，具有并发的含义，
     * 而并发则不一定并行，也亦是说并发事件之间不一定要同一时刻发生。
     *
     * 	什么是线程安全问题？如何解决？
     * 不同线程对共享变量的访问，互相影响，造成程序不正常运行。
     *
     * 	ThreadLocal能解决线程安全问题吗？
     */

  }
}
