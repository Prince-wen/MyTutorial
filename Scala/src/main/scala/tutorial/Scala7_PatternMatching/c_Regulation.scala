package tutorial.Scala7_PatternMatching

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:35
 * @note 匹配规则
 */
object c_Regulation {

  //todo 匹配常量
  def describe1(x: Any) = x match {
    case 5 => "Int five"
    case "hello" => "String hello"
    case true => "Boolean true"
    case '+' => "Char +"
  }

  //todo 匹配类型
  //下划线的作用省略参数，因为逻辑中不适用餐宿，所以省略参数，
  //但是需要这个参数，那么可以起个名字
  //类型匹配不考虑泛型
  def describe2(x: Any) = x match {
    case i: Int => "Int"
    case s: String => "String hello"
    case m: List[_] => "List"
    case c: Array[Int] => "Array[Int]"
    case someThing => "something else " + someThing
  }

  //todo 匹配数组
  def main3(args: Array[String]): Unit = {
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) { // 对一个数组集合进行遍历
      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }
      println("result = " + result)
    }
  }

  //todo 匹配列表
  def main4(args: Array[String]): Unit = {
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
      val result = list match {
        case List(0) => "0" //匹配List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }
      println(result)
    }
    val list: List[Int] = List(1, 2, 5, 6, 7)
    list match {
      case first :: second :: rest => println(first + "-" + second + "-" + rest)
      case _ => println("something else")
    }
  }

  //todo 匹配元组
  def main5(args: Array[String]): Unit = {
    for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
      val result = tuple match {
        case (0, _) => "0 ..." //是第一个元素是0的元组
        case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
        case (a, b) => "" + a + " " + b
        case _ => "something else" //默认
      }
      println(result)
    }
  }

  //todo 匹配对象
  class User6(val name: String, val age: Int)
  object User6{
    def apply(name: String, age: Int): User6 = new User6(name, age)
    def unapply(user6: User6): Option[(String, Int)] = {
      if (user6 == null)
      None
      else
      Some(user6.name, user6.age)
    }
  }

  def main6(args: Array[String]): Unit = {
    val user: User6 = User6("zhangsan", 11)
    val result = user match {
      case User6("zhangsan", 11) => "yes"
      case _ => "no"
    }
  }

  //todo 样例类
  /**
   * 	样例类就是使用case关键字声明的类
   * 	样例类仍然是类，和普通类相比，只是其自动生成了伴生对象，并且伴生对象中自动提供了一些常用的方法，如apply、unapply、toString、equals、hashCode和copy。
   * 	样例类是为模式匹配而优化的类，因为其默认提供了unapply方法，因此，样例类可以直接使用模式匹配，而无需自己实现unapply方法。
   * 	构造器中的每一个参数都成为val，除非它被显式地声明为var（不建议这样做）
   */

  case class User(name: String, age: Int)

  object ScalaCaseClass {
    def main(args: Array[String]): Unit = {
      val user: User = User("zhangsan", 11)
      val result = user match {
        case User("zhangsan", 11) => "yes"
        case _ => "no"
      }

      println(result)
    }
  }

  //应用实例一：
  val map: Map[String, (String, Int)] = Map("a" -> ("aa", 1), "b" -> ("bb", 2))
  map.foreach{
    case (pri,(item,count)) => {
      println(count)
    }
  }

  //应用实例二：
  val list = List( ("a",1),("b",2),("c",3) )
  val newList: List[(String, Int)] = list.map {
    case (word, count) => {
      (word, count * 2)
    }
  }
  print(newList)

}
