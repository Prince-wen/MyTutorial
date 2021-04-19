package tutorial.Scala6_Collecter

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-04-19 1:56 PM
 * @note Option结构
 */
object l_Option {
  def main(args: Array[String]): Unit = {

    /**
     * todo Option类型
     * 一般来说，对于每种语言都会有一个关键字来表示一个对象引用的“无”。在Java中使用的是null。
     * 而Scala则融合了函数式编程的风格，当预计到变量或者函数返回值可能不会引用任何值的时候，使用Option类型。
     * Option(选项)类型用来表示一个值(有值或者无值)。
     * Option[T]是一个类型为T的可选值的容器。
     * Option类包含一个子类Some，当存在可以被引用的值的时候，也就是有值，就可以使用Some来包含这个值。例如Some("Hadoop")
     * Option类还包含了一个子类None，没有值。Some和None都是它的子类，他们都是final类，所以不能再有派生子类了。
     * Option实例就是Some或者None对象实例。
     */

    //todo 首先我们看这个例子
    val book = Map("hadoop" -> 5,"spark" -> 10,"hbase" -> 7)//我们在scala shell中定义了一个Map
    println(book.get("hadoop"))//然后我们从Map中获取键为hadoop的映射
    //res0: Option[Int] = Some(5) //我们取到的值的类型为Option[Int]，值被包含在Some中返回，读取实际是对Some进行的操作
    println(book.get("hive"))//我们再从Map中获取键为hive的映射
    //res1: Option[Int] = None//这个值是不存在的，所以返回的值是None对象
    //当我们想要更改None值为更有意义的数据的时候可以调用getOrElse方法，getOrElse只能替换None值。
    println(book.get("hive").getOrElse("No such book"))
    //res2: Any = No such book

    //todo 我们如何定义使用Option类型呢？
    val a : Option[Int] = Some(5) //定义一个值为5的Option实例a
    println(a)//a: Option[Int] = Some(5)

    val b : Option[Int] = None //定义一个无值的Option实例b
    println(b)//b: Option[Int] = None

    println(a.getOrElse(0)) //对有值的Option实例调用getOrElse不能替换值
    //res5: Int = 5

    println(b.getOrElse(0)) //getOrElse只能替换None值
    //res6: Int = 0

    /**
     * todo Option实际上是一个容器
     * 我们可以把它看做成一个集合，这不过这个集合要么只包含一个包含在Some中的元素，要么不存在元素显示None
     * 其实它并不是一个真正的集合类，因为它并没有有继承Traversable或Iterable。
     * 但是它确实具有Iterable的所有操作，这意味着你完全可以把Option当成一个集合去使用。
     * Option类可以使用大部分的集合操作。例如 map、foreach、filter等
     */
    println("foreach遍历到None的时候，什么也不做，不执行println")
    book.get("hive").foreach(println) //foreach遍历到None的时候，什么也不做，不执行println
    book.get("hadoop").foreach(println)

    /*  一些常用的方法
1   def get: A
    获取可选值
2   def isEmpty: Boolean
    检测可选类型值是否为 None，是的话返回 true，否则返回 false
3   def productArity: Int
    返回元素个数， A(x_1, ..., x_k), 返回 k
4   def productElement(n: Int): Any
    获取指定的可选项，以 0 为起始。即 A(x_1, ..., x_k), 返回 x_(n+1) ， 0 < n < k.
5   def exists(p: (A) => Boolean): Boolean
    如果可选项中指定条件的元素存在且不为 None 返回 true，否则返回 false。
6   def filter(p: (A) => Boolean): Option[A]
    如果选项包含有值，而且传递给 filter 的条件函数返回 true， filter 会返回 Some 实例。 否则，返回值为 None 。
7   def filterNot(p: (A) => Boolean): Option[A]
    如果选项包含有值，而且传递给 filter 的条件函数返回 false， filter 会返回 Some 实例。 否则，返回值为 None 。
8   def flatMap[B](f: (A) => Option[B]): Option[B]
    如果选项包含有值，则传递给函数 f 处理后返回，否则返回 None
9   def foreach[U](f: (A) => U): Unit
    如果选项包含有值，则将每个值传递给函数 f， 否则不处理。
10  def getOrElse[B >: A](default: => B): B
    如果选项包含有值，返回选项值，否则返回设定的默认值。
11  def isDefined: Boolean
    如果可选值是 Some 的实例返回 true，否则返回 false。
12  def iterator: Iterator[A]
    如果选项包含有值，迭代出可选值。如果可选值为空则返回空迭代器。
13  def map[B](f: (A) => B): Option[B]
    如果选项包含有值， 返回由函数 f 处理后的 Some，否则返回 None
14  def orElse[B >: A](alternative: => Option[B]): Option[B]
    如果一个 Option 是 None ， orElse 方法会返回传名参数的值，否则，就直接返回这个 Option。
15  def orNull
    如果选项包含有值返回选项值，否则返回 null。
     */
  }
}
