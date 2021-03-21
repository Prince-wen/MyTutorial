package com.shiwen.tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 15:34
 * @note 数据类型
 */
object f_DataType {
  /**
   * Scala与Java有着相同的数据类型，但是又有不一样的地方
   * todo Java数据类型
   * Java的数据类型包含基本类型和引用类型
   * 	基本类型：byte,short,char,int,long,float,double,boolean
   * 	引用类型：Object，数组，字符串，包装类，集合，POJO对象等
   * todo Scala数据类型
   * Scala是完全面向对象的语言，所以不存在基本数据类型的概念，有的只是任意值对象类型（AnyVal）和任意引用对象类型(AnyRef)

   Byte   : 8位有符号补码整数，数值区间为 -128 到 127
   Short  : 16位有符号补码整数，数值区间为 -32768 到 32767
   Int    : 32位有符号补码整数，数值区间为 -2147483648 到 2147483647
   Long   : 64位有符号补码整数，数值区间为 -9223372036854775808 到 9223372036854775807
   Float  : 32位。IEEE 754 标准的单精度浮点数。
   Double : 64位。IEEE 754 标准的双精度浮点数。
   Char   : 16位无符号Unicode字符，区间值为 U+0000 到 U+FFFF
   String : 字符序列
   Boolean: true 或 false
   Unit   : 表示无值，和其他语言中的void等同，用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成().
   Null   : null 或空引用
   Nothing: Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
   Any    : Any是所有其他类的超类
   AnyRef : AnyRef类是Scala里所有引用类(reference class)的基类

   */
   //todo 数据类型 - AnyVal
   val b : Byte = 10
   val s : Short = 10
   val i : Int = 10
   val l : Long = 10L
   val f : Float = 1.0f
   val d : Double = 1.0

   val c : Char = 'A'
   val flg : Boolean = true

   //Unit 是一个类，对象只有一个：()
   val u : Unit = ()

   val U : Unit = test()
   println(U)
   def test(): Unit = {

   }

   //todo 数据类型 - AnyRef
   val a = new Array[String](5)
   //val b = new util.ArrayList()
   //val u = new User()

   //todo 类型省略
   val ii = 10
   //如果省略类型，整数默认为Int类型
   val dd = 10.0
   //如果省略类型，浮点类型默认为Double

   //todo Null
   //scala 将null作为一个特殊的对象进行处理，类型就是null
   val s1 = null
   val ss : String = null
   //AnyVal 类型是不能使用null赋值的
   //val iii : Int = null
   //todo nothing，没有值
   val nil: Nil.type = Nil

   //todo any
   //任意类型
   val aa : Any = "123"

   //Unit(没有返回值)(void) => Nothing(无值)(exception)
}