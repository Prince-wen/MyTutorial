package tutorial.Scala7_PatternMatching

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-06 9:49
 * @note 偏函数
 */
object d_PartialFunction {
  def main(args: Array[String]): Unit = {

    /**
     * 所谓的偏函数，其实就是对集合中符合条件的数据进行处理的函数
     * 偏函数也是函数的一种，通过偏函数我们可以方便的对输入参数做更精确的检查。
     * 例如该偏函数的输入类型为Int，但是我们只考虑数值为1的时候，数据该如何处理，其他不考虑。
     */

    //todo 基本语法
    //声明偏函数
    val pf: PartialFunction[Int, String] = { case 1 => "one" }

    //应用偏函数
    println( List(1, 2, 3, 4).collect(pf) )

    //todo 案例实操
    //将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串。
    //	不使用偏函数
    List(1,2,3,4,5,6,"test")
      .filter(_.isInstanceOf[Int])
      .map(_.asInstanceOf[Int] + 1)
      .foreach(println)
    //	使用偏函数
    List(1, 2, 3, 4, 5, 6, "test")
      .collect { case x: Int => x + 1 }
      .foreach(println)

  }
}
