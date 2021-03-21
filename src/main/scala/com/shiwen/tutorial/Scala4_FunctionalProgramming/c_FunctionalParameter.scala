package com.shiwen.tutorial.Scala4_FunctionalProgramming

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 11:46
 * @note 函数参数
 */
object c_FunctionalParameter {
  def main(args: Array[String]): Unit = {

    //todo 可变参数
    def fun7(names:String*): Unit = {
      println(names)
    }
    fun7()
    fun7( "zhangsan" )
    fun7( "zhangsan", "lisi" )

    //可变参数不能放置在参数列表的前面，一般放置在参数列表的最后

    // Error
    //def fun77(names:String*, name:String): Unit = {

    //}
    def fun777( name:String, names:String* ): Unit = {
      println( name )
      println( names )
    }

    //todo 参数默认值
    def fun8( name:String, password:String = "000000" ): Unit = {
      println( name + "," + password )
    }
    fun8("zhangsan", "123123")
    fun8("zhangsan")

    //todo 带名参数
    def fun9( password:String = "000000", name:String ): Unit = {
      println( name + "," + password )
    }
    fun9("123123", "zhangsan" )
    fun9(name="zhangsan")

  }
}
