package com.shiwen.tutorial.Scala5_OOP

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 13:06
 * @note 面向对象编程，类
 */
object b_Class {
  def main(args: Array[String]): Unit = {
    /**
     * 静态
     */

    //todo 类
    /**
     * 面向对象编程中类可以看成一个模板，而对象可以看成是根据模板所创建的具体事物
     * 1)	基本语法
     * 声明类：访问权限 class 类名 { 类主体内容 }
     * class User { }
     * 对象：new 类名(参数列表)
     * new User()
     * 2)	扩展语法
     * Scala中一个源文件中可以声明多个类
     */

    //todo 属性
    /**
     * 1)	基本语法
     * class User0 {
     *   var name : String = _ // 类属性其实就是类变量
     *   var age : Int = _ // 下划线表示类的默认初始化
     * }
     * 2)	扩展语法
     * Scala中的属性其实在编译后也会生成方法
     * class User00 {
     *   var name : String = _
     *   val age : Int = 30
     *   private val email : String = _
     *   //@BeanPropetry var address : String = _
     * }
     */

    //todo 访问权限
    /**
     * Scala中的访问权限和Java中的访问权限类似，但是又有区别：
     * private : 私有访问权限
     * private[包名]: 包访问权限
     * protected : 受保护权限
     *        : 公共访问权限
     *
     * 思考一个问题: 你会调用java中的clone方法吗？
     */

    //todo 方法
    /**
     * Scala中的类的方法其实就是函数，所以声明方式完全一样，但是必须通过使用对象进行调用
     * def main(args: Array[String]): Unit = {
     *   val user = new User1
     *   user.login("zhangsan", "000000")
     * }
     * class User1 {
     *   def login( name:String, password:String ): Boolean = {
     *     false
     *   }
     * }
     *
     * 思考两个问题: 还记得方法的重写和重载吗？ 你真的明白吗？
     */

    //todo 对象
    /**
     * Scala中的对象和Java是类似的
     * val | var 对象名 [：类型]  = new 类型()
     * var user : User = new User()
     */

    //todo 构造方法
    /**
     * 和Java一样，Scala中构造对象也需要调用类的构造方法来创建。
     * 并且一个类中可以有任意多个不相同的构造方法。这些构造方法可以分为2大类：主构造函数和辅助构造函数。
     * class User() { // 主构造函数
     *   var username : String = _
     *   def this( name:String ) { // 辅助构造函数，使用this关键字声明
     *     this() // 辅助构造函数应该直接或间接调用主构造函数
     *     username = name
     *   }
     *   def this( name:String, password:String ) {
     *     this(name) // 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
     *   }
     * }
     */

  }
}
