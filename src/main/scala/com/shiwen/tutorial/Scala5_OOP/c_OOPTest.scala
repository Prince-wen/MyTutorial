package com.shiwen.tutorial.Scala5_OOP

import scala.util.chaining.scalaUtilChainingOps

/**
 * @author li478
 * @create 2021-03-28 22:36
 * @note 测试
 */
object c_OOPTest {
  def main(args: Array[String]): Unit = {

    /**
     * 构造对象的几种方式：
     *    1.new
     *    2.apply
     *    3.反射    clazz = classOf[类名]   clazz.newInstance()
     *    4.clone
     *    5.反序列化
     *
     * 将多个子类共通的方法抽出来到父类中：
     *    方法写在父类中，加protected权限
     *
     * 用Scala创建单例对象：
     *    1.构造方法私有化
     *    2.使用静态方式获取指定类型对象
     * 如下方式可以实现，并且是多线程安全的
     */
    val ins1 = OOPTest11()
    val ins2 = OOPTest11()
    println(ins1 eq ins2)
  }
}
class OOPTest11 private{}
object OOPTest11{
  val OneInstance = new OOPTest11()
  def apply():OOPTest11 = {
    OneInstance
  }
}