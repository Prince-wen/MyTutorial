package com.shiwen.tutorial.Scala5_OOP

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 12:46
 * @note 面向对象编程 Object-Oriented Programming
 */
object a_Package {

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
     *    加载类时出现  双亲委派机制：
     *      启动类加载器 <- 扩展类加载器 <- 应用类加载器    这里出现的关系是上下级关系
     *      启动类加载器：加载jdk自带的类rt.jar      加载路径：jar包路径：%JAVA_HOME%/jre/lib/         类路径：%JAVA_HOME%/jre/classes
     *      扩展类加载器：加载扩展的类库              加载路径：jar包路径：%JAVA_HOME%/jre/lib/ext/    类路径：%JAVA_HOME%/jre/ext/classes/
     *      应用类加载器：环境变量classpath下的类     加载路径：jar包路径：当前目录                      类路径：当前目录
     *      从下往上查找，从上往下委派
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

  }
}
