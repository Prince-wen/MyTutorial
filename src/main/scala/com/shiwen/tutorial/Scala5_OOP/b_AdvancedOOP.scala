package com.shiwen.tutorial.Scala5_OOP

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-18 12:50
 * @note 高级面向对象编程 Advanced object oriented programming
 */
object b_AdvancedOOP {
  def main(args: Array[String]): Unit = {

    //todo 继承
    /**
     * 和Java一样，Scala中的继承也是单继承，且使用extends关键字。
     */
    /*class PersonA {
    }
    class UserA extends PersonA {
    }*/
    //构造对象时需要考虑构造方法的执行顺序

    //todo 封装
    /**
     * 封装就是把抽象出的数据和对数据的操作封装在一起，数据被保护在内部，程序的其它部分只有通过被授权的操作（成员方法），才能对数据进行访问。
     * 1)	将属性进行私有化
     * 2)	提供一个公共的set方法，用于对属性赋值
     * 3)	提供一个公共的get方法，用于获取属性的值
     * 思考一个问题: 真的有这个必要吗？
     */

    //todo 抽象
/*
    	Scala将一个不完整的类称之为抽象类。
    abstract class Person {
    }
    	Scala中如果一个方法只有声明而没有实现，那么是抽象方法，因为它不完整。
    abstract class Person {
      def test():Unit
    }
    	Scala中如果一个属性只有声明没有初始化，那么是抽象属性，因为它不完整。
    abstract class Person {
      var name:String
    }
    	子类如果继承抽象类，必须实现抽象方法或补全抽象属性，否则也必须声明为抽象的，因为依然不完整。
    abstract class Person {
      var name:String
    }
    class User extends Person {
      var name : String = "zhangsan"
    }*/

    //todo 单例对象
/*
    	所谓的单例对象，就是在程序运行过程中，指定类的对象只能创建一个，而不能创建多个。这样的对象可以由特殊的设计方式获得，也可以由语言本身设计得到，比如object伴生对象
    	Scala语言是完全面向对象的语言，所以并没有静态的操作（即在Scala中没有静态的概念）。但是为了能够和Java语言交互（因为Java中有静态概念），就产生了一种特殊的对象来模拟类对象，该对象为单例对象。若单例对象名与类名一致，则称该单例对象这个类的伴生对象，这个类的所有“静态”内容都可以放置在它的伴生对象中声明，然后通过伴生对象名称直接调用
    	如果类名和伴生对象名称保持一致，那么这个类称之为伴生类。Scala编译器可以通过伴生对象的apply方法创建伴生类对象。apply方法可以重载，并传递参数，且可由Scala编译器自动识别。所以在使用时，其实是可以省略的。
    class User { // 伴生类
    }
    object User { // 伴生对象
      def apply() = new User() // 构造伴生类对象
    }
    ...
    val user1 = new User()// 通过构造方法创建对象
    Val user2 = User.apply() // 通过伴生对象的apply方法构造伴生类对象
    val user3 = User() // scala编译器省略apply方法，自动完成调用
    */
    /**
     * 思考一个问题: Thread线程中wait方法和sleep方法的区别？
     */

    //todo 特质
    /*
      Scala将多个类的相同特征从类中剥离出来，形成一个独立的语法结构，称之为“特质”（特征）。这种方式在Java中称之为接口，但是Scala中没有接口的概念。所以scala中没有interface关键字，而是采用特殊的关键字trait来声明特质, 如果一个类符合某一个特征（特质），那么就可以将这个特征（特质）“混入”到类中。这种混入的操作可以在声明类时使用，也可以在创建类对象时动态使用。
    1)	基本语法
    trait 特质名称
    class 类名 extends 父类（特质1） with 特质2 with特质3
    trait Operator {

    }
    trait DB{

    }
    class MySQL extends Operator with DB{

    }
    思考一个问题: 特质到底是什么？为什么又可以使用extends，又可以使用with？
    2)	动态混入
    object ScalaTrait{
      def main(args: Array[String]): Unit = {
        val mysql = new MySQL with Operator
        mysql.insert()
      }
    }
    trait Operator {
      def insert(): Unit = {
        println("insert data...")
      }
    }
    class MySQL {

    }
    3)	初始化叠加
    object ScalaTrait{
      def main(args: Array[String]): Unit = {
        val mysql = new MySQL
      }
    }
    trait Operator {
      println("operator...")
    }
    trait DB {
      println("db...")
    }
    class MySQL extends DB with Operator{
      println("mysql...")
    }
    4)	功能叠加
    object ScalaTrait {
      def main(args: Array[String]): Unit = {
        val mysql: MySQL = new MySQL
        mysql.operData()
      }
    }

    trait Operate{
      def operData():Unit={
        println("操作数据。。")
      }
    }
    trait DB extends Operate{
      override def operData(): Unit = {
        print("向数据库中。。")
        super.operData()
      }
    }
    trait Log extends Operate{

      override def operData(): Unit = {
        super.operData()
      }
    }
    class MySQL extends DB with Log {

    }
*/
    /**
     * 思考一个问题: scala中的super是什么？
     */

    //todo 扩展
/*
    	类型检查和转换
    class Person{
    }
    object Person {
      def main(args: Array[String]): Unit = {

        val person = new Person

        //（1）判断对象是否为某个类型的实例
        val bool: Boolean = person.isInstanceOf[Person]

        if ( bool ) {
          //（2）将对象转换为某个类型的实例
          val p1: Person = person.asInstanceOf[Person]
          println(p1)
        }

        //（3）获取类的信息
        val pClass: Class[Person] = classOf[Person]
        println(pClass)
      }
    }
    思考一个问题: 字符串真的不可变吗？
    	枚举类和应用类
    object Test {
      def main(args: Array[String]): Unit = {
        println(Color.RED)
      }
    }

    // 枚举类
    object Color extends Enumeration {
      val RED = Value(1, "red")
      val YELLOW = Value(2, "yellow")
      val BLUE = Value(3, "blue")
    }

    // 应用类
    object AppTest extends App {
      println("application");
    }
    	Type定义新类型
    使用type关键字可以定义新的数据数据类型名称，本质上就是类型的一个别名
    object Test {
      def main(args: Array[String]): Unit = {
        type S =String
        var v : S = "abc"
      }
    }
*/


  }
}
