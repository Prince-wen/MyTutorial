package com.shiwen.tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-22 9:48
 * @note 集合简介
 */
object a_Overview {
  /**
   * Scala的集合有三大类：序列Seq、集Set、映射Map，所有的集合都扩展自Iterable特质。
   *
   * 对于几乎所有的集合类，Scala都同时提供了可变和不可变的版本。
   *
   * 1.可变集合可以在适当的地方被更新或扩展。这意味着你可以修改，添加，移除一个集合的元素。
   *
   * 2.而不可变集合类，相比之下，永远不会改变。不过，你仍然可以模拟添加，移除或更新操作。
   * 但是这些操作将在每一种情况下都返回一个新的集合，同时使原来的集合不发生改变，
   * 所以这里的不可变并不是变量本身的值不可变，而是变量指向的那个内存地址不可变
   *
   * 可变集合和不可变集合，在scala中该如何进行区分呢？我们一般可以根据集合所在包名进行区分:
   */

  //	scala.collection.immutable
  //见图immutable

  //	scala.collection.mutable
  //见图mutable

}
