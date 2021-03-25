package com.shiwen.tutorial.Scala5_OOP

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 12:46
 * @note 面向对象编程 Object-Oriented Programming
 */
object a_BaseOOP {

  /**
   * Scala是一门完全面向对象的语言，摒弃了Java中很多不是面向对象的语法。虽然如此，但其面向对象思想和Java的面向对象思想还是一致的
   */
  def main(args: Array[String]): Unit = {

    //todo 包
    /**
     * 1)	基本语法
     * Scala中基本的package包语法和Java完全一致
     * package com.atguigu.bigdata.scala
     * 2)	扩展语法
     * Java中package包的语法比较单一，Scala对此进行扩展
     * 	Scala中的包和类的物理路径没有关系
     * 	package关键字可以嵌套声明使用，使用大括号实现
     */
/*    package com
    package atguigu {
      package bigdata {
        package scala {
          object ScalaPackage {
            def test(): Unit = {
              println("test...")
            }
          }
        }
      }
    }*/
    /**
     * 	子包可以直接访问父包中的内容，而无需import
     */
/*    package com
    package atguigu {
      package bigdata {
        class Test {
        }
        package scala {
          object ScalaPackage {
            def test(): Unit = {
              new Test()
            }
          }
        }
      }
    }*/
    /**
     * 	Scala中package也可以看作对象，并声明属性和函数
     */
/*    package com
    package object atguigu {
      val name : String = "zhangsan"
      def test(): Unit = {
        println( name )
      }
    }
    package atguigu {
      package bigdata {
        package scala {
          object ScalaPackage {
            def test(): Unit = {
            }
          }
        }
      }
    }*/

    //todo 导入
    /**
     * 1)	基本语法
     * Scala中基本的import导入语法和Java完全一致
     * import java.util.List
     * import java.util._ // Scala中使用下划线代替Java中的星号
     * 2)	扩展语法
     * Java中import导入的语法比较单一，Scala对此进行扩展
     * 	Scala中的import语法可以在任意位置使用
     */
    /*def main(args: Array[String]): Unit = {
      import java.util.ArrayList
      new ArrayList()
    }*/
    /**
     * 	Scala中可以导包，而不是导类
     */
    /*def main(args: Array[String]): Unit = {
      import java.util
      new util.ArrayList()
    }*/
    /**
     * 	Scala中可以在同一行中导入多个类，简化代码
     */
    /*import java.util.{List, ArrayList}*/
    /**
     * 	Scala中可以屏蔽某个包中的类
     */
    /*import java.util._
    import java.sql.{ Date=>_, Array=>_, _ }*/

    /**
     * 	Scala中可以给类起别名，简化使用
     *    type也可以给类起别名，且颜色会变
     */
    /*import java.util.{ArrayList=>AList}

    object ScalaImport{
      def main(args: Array[String]): Unit = {
        new AList()
      }
    }*/

    /**
     * 	Scala中可以使用类的绝对路径而不是相对路径
     *    Scala默认import是按照包的相对路径进行导入的。
     *    双亲委派机制：
     */
    /*import _root_.java.util.ArrayList*/

    /**
     * 	默认情况下，Scala中会导入如下包和对象
     */
    /* import java.lang._
    import scala._
    import scala.Predef._*/

    /**
     * 思考一个问题: 导入对象？
     */

    //todo 类
    /**
     * 面向对象编程中类可以看成一个模板，而对象可以看成是根据模板所创建的具体事物
     * 1)	基本语法
     */
    // 声明类：访问权限 class 类名 { 类主体内容 }
    class Userx {
    }
    // 对象：new 类名(参数列表)
    new Userx()

    /**
     * 2)	扩展语法
     * Scala中一个源文件中可以声明多个类
     */

    //todo 属性
    /**
     * 1)	基本语法
     */
    class User0 {
      var name : String = _ // 类属性其实就是类变量
      var age : Int = _ // 下划线表示类的默认初始化
    }

    /**
     * 2)	扩展语法
     * Scala中的属性其实在编译后也会生成方法
     */

    class User00 {
      var name : String = _
      val age : Int = 30
//      private val email : String = _
//      @BeanPropetry var address : String = _
    }

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
     */
    def main(args: Array[String]): Unit = {
      val user = new User1
      user.login("zhangsan", "000000")
    }
    class User1 {
      def login( name:String, password:String ): Boolean = {
        false
      }
    }

    /**
     * 思考两个问题: 还记得方法的重写和重载吗？ 你真的明白吗？
     */

    //todo 对象
    /**
     * Scala中的对象和Java是类似的
     */
    //val | var 对象名 [：类型]  = new 类型()
//    var user : User = new User()

    //todo 构造方法
    /**
     * 和Java一样，Scala中构造对象也需要调用类的构造方法来创建。
     * 并且一个类中可以有任意多个不相同的构造方法。这些构造方法可以分为2大类：主构造函数和辅助构造函数。
     */

    class User() { // 主构造函数
      var username : String = _
      def this( name:String ) { // 辅助构造函数，使用this关键字声明
        this() // 辅助构造函数应该直接或间接调用主构造函数
        username = name
      }
      def this( name:String, password:String ) {
        this(name) // 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
      }
    }

  }
}
