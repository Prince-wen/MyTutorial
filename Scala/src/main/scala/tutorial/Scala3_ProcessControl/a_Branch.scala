package tutorial.Scala3_ProcessControl

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 16:53
 * @note 分支控制
 */
object a_Branch {
  /**
   * 让程序有选择的的执行，分支控制有三种：单分支、双分支、多分支
   */

  //todo 单分支
  /**
   * IF...ELSE 语句是通过一条或多条语句的执行结果（true或者false）来决定执行的代码块
   * if(布尔表达式) {
   *   // 如果布尔表达式为 true 则执行该语句块
   * }
   * 如果布尔表达式为 true 则执行大括号内的语句块，否则跳过大括号内的语句块，执行大括号之后的语句块。
   */
  def mainScalaSingleBranch(args: Array[String]): Unit = {
    val b = true
    if ( b ) {
      println("true")
    }
  }

  //todo 双分支
  /**
   * if(布尔表达式) {
   *   // 如果布尔表达式为 true 则执行该语句块
   * } else {
   *   // 如果布尔表达式为 false 则执行该语句块
   * }
   * 如果布尔表达式为 true 则执行接着的大括号内的语句块，否则执行else后的大括号内的语句块。
   */
  def mainScalaDoubleBranch(args: Array[String]): Unit = {
    val b = true
    if ( b ) {
      println("true")
    } else {
      println("false")
    }
  }

  //todo 多分支
  /**
   * if(布尔表达式1) {
   *   // 如果布尔表达式1为 true，则执行该语句块
   * } else if ( 布尔表达式2 ) {
   *   // 如果布尔表达式2为 true，则执行该语句块
   * }...
   * } else {
   *   // 上面条件都不满足的场合，则执行该语句块
   * }
   */

  /**
   * 实现一个小功能：输入年龄，
   * 如果年龄小于18岁，则输出“童年”。
   * 如果年龄大于等于18且小于等于30，则输出“青年”，
   * 如果年龄大于30小于等于50，则输出”中年”，
   * 否则，输出“老年”。
   */
  def mainScalaMultiBranch1(args: Array[String]): Unit = {
    val age = 30
    if ( age < 18 ) {
      println("童年")
    } else if ( age <= 30 ) {
      println("青年")
    } else if ( age <= 50 ) {
      println("中年")
    } else {
      println("老年")
    }
  }

  //实际上，Scala中的表达式都是有返回值的，所以上面的小功能还有其他的实现方式
  def mainScalaMultiBranch2(args: Array[String]): Unit = {
    val age = 30
    val result = if ( age < 18 ) {
      "童年"
    } else if ( age <= 30 ) {
      "青年"
    } else if ( age <= 50 ) {
      "中年"
    } else {
      "老年"
    }
    println(result)
  }

  /**
   * 思考一个问题: 怎么没有讲三元运算符？
   * 首先，确实没有三元运算符
   * 使用if...else来代替
   *
   * val age = 20
   * val s : String = if (age < 20){
   *    "zhangsan"
   * } else {
   *    "lisi"
   * }
   *
   * 如果大括号中代码逻辑只有一行，那么可以省略
   * val s = if (age < 20) "zhangsan" else "lisi"
   *
   * 如果一行代码中只有一段逻辑，那么可以省略分号，如果有多段逻辑，分号不能省略
   * println("zhangsan");println("lisi")//可以使用分号，也可以分行
   */

}
