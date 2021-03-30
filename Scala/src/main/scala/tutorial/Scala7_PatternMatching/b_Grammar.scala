package tutorial.Scala7_PatternMatching

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-23 12:32
 * @note 语法 basic grammar
 */
object b_Grammar {
  def main(args: Array[String]): Unit = {
    /**
     * 模式匹配语法中，采用match关键字声明，每个分支采用case关键字进行声明，当需要匹配时，会从第一个case分支开始，
     * 如果匹配成功，那么执行对应的逻辑代码，如果匹配不成功，继续执行下一个分支进行判断。
     * 如果所有case都不匹配，那么会执行case _分支，类似于Java中default语句。如果不存在case _分支，那么会发生错误。
     */
    var a: Int = 10
    var b: Int = 20
    var operator: Char = 'd'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)

  }
}
