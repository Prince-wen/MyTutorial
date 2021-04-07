package tutorial.Scala12_Distributed

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-07 11:20
 * @note
 */
object Calc {
  def main(args: Array[String]): Unit = {

    val num = 5
    var sum = 0
    val start = System.currentTimeMillis()

    for ( i <- 1 to num ) {
      //串行计算
//      sum = sum + i * 2
//      Thread.sleep(i * 100)//计算结果为：30;耗时：1834 ms
      //并发计算（资源共享）
      //并行（分布式）
      new Thread(
        new Runnable {
          override def run(): Unit = {
            sum = sum + i * 2
            Thread.sleep(i * 100)//计算结果为：30;耗时：201 ms
          }
        }
      ).start()
    }

    val end = System.currentTimeMillis()
    println(
      s"""
         |计算结果为：$sum;耗时：${end - start} ms
         |""".stripMargin
    )

  }
}
