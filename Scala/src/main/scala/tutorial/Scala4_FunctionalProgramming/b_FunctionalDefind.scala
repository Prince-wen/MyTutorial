package tutorial.Scala4_FunctionalProgramming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 11:41
 * @note 函数定义
 */
object b_FunctionalDefind {
  def main(args: Array[String]): Unit = {

    //todo 无参，无返回值
    def fun1(): Unit = {
      println("函数体")
    }
    fun1()

    //todo 无参，有返回值
    def fun2(): String = {
      "zhangsan"
    }
    println( fun2() )

    //todo 有参，无返回值
    def fun3( name:String ): Unit = {
      println( name )
    }
    fun3("zhangsan")

    //todo 有参，有返回值
    def fun4(name:String): String = {
      "Hello " + name
    }
    println( fun4("zhangsan") )

    //todo 多参，无返回值
    def fun5(hello:String, name:String): Unit = {
      println( hello + " " + name )
    }
    fun5("Hello", "zhangsan")

    //todo 多参，有返回值
    def fun6(hello:String, name:String): String = {
      hello + " " + name
    }
    println( fun6("Hello", "zhangsan"))

  }
}
