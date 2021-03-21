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

}
