package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:17
 * @note 并行
 */
object i_Parallel {
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
     * 	什么是线程安全问题？如何解决？
     * 	ThreadLocal能解决线程安全问题吗？
     */

  }
}
