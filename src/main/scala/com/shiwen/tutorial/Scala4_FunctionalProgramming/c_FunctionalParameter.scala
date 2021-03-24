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
    //且只能有一个可变参数

    // Error
    //def fun77(names:String*, name:String): Unit = {

    //}
    def fun777( name:String, names:String* ): Unit = {
      println( name )
      println( names )
    }

    //todo 参数默认值
    /**
     * Scala中函数的参数使用val声明，无法进行修改
     * 参数默认值，在参数声明的时候进行初始化
     * 如果函数存在着默认值的参数，调用时可以不用传递，不传参数，会使用默认值
     * 如果调用函数时，提供了参数值，那么参数默认值不起作用，被覆盖了。
     *
     */
    def fun8( name:String, password:String = "000000" ): Unit = {
      println( name + "," + password )
    }
    fun8("zhangsan", "123123")
    fun8("zhangsan")

    //todo 带名参数
    /**
     * 函数在传递参数的时候是按照从左到右的方式进行匹配的。
     * 带名参数，传递参数时添加参数名，明确指定参数。name=“zhangsan”
     */
    def fun9( password:String = "000000", name:String ): Unit = {
      println( name + "," + password )
    }
    fun9("123123", "zhangsan" )
    fun9(name="zhangsan")

  }
}
