/*
package com.shiwen.tutorial.Scala7_PatternMatching

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:43
 * @note 模式匹配的应用
 */
object d_Apply {
  8.4.1 变量声明
  object ScalaMatch {
    def main(args: Array[String]): Unit = {
      val (x, y) = (1, 2)
      println(s"x=$x,y=$y")

      val Array(first, second, _*) = Array(1, 7, 2, 9)
      println(s"first=$first,second=$second")

      val Person(name, age) = Person("zhangsan", 16)
      println(s"name=$name,age=$age")
    }
    case class Person(name: String, age: Int)
  }
  8.4.2 循环匹配
  object ScalaMatch {
    def main(args: Array[String]): Unit = {
      val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
      for ((k, v) <- map) { //直接将map中的k-v遍历出来
        println(k + " -> " + v) //3个
      }
      println("----------------------")
      //遍历value=0的 k-v ,如果v不是0,过滤
      for ((k, 0) <- map) {
        println(k + " --> " + 0) // B->0
      }
      println("----------------------")
      //if v == 0 是一个过滤的条件
      for ((k, v) <- map if v >= 1) {
        println(k + " ---> " + v) // A->1 和 c->33
      }
    }
  }
  8.4.3 函数参数
  object ScalaMatch {
    def main(args: Array[String]): Unit = {
      val list = List(
        ("a", 1), ("b", 2), ("c", 3)
      )
      val list1 = list.map {
        case ( k, v ) => {
          (k, v*2)
        }
      }
      println(list1)
    }
  }

}
*/
