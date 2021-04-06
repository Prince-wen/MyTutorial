package tutorial.Scala9_ImplicitTransformation

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 12:08
 * @note 隐式转换
 */
object ImplicitTransformation {
  //todo 简介
  /**
   * 在之前的类型学习中，我们已经学习了自动类型转换，精度小的类型可以自动转换为精度大的类型，
   * 这个转换过程无需开发人员参与，由编译器自动完成，这个转换操作我们称之为隐式转换。
   *
   * 在其他的场合，隐式转换也起到了非常重要的作用。
   * 如Scala在程序编译错误时，可以通过隐式转换中类型转换机制尝试进行二次编译，将本身错误无法编译通过的代码通过类型转换后编译通过。
   * 慢慢地，这也形成了一种扩展功能的转换机制。这个听着很抽象，不好理解，不急，咱慢慢体会。
   */

  //todo 隐式函数
  def main1(args: Array[String]): Unit = {
    implicit def transform( d : Double ): Int = {
      d.toInt
    }
    var d : Double = 2.0
    val i : Int = d
    println(i)
  }

  /**
   * 思考一个问题:如果有多个相同转换规则怎么办？
   */

  //todo 隐式参数 & 隐式变量
  def main2(args: Array[String]): Unit = {
    def transform( implicit  d : Double ) = {
      d.toInt
    }
    implicit val dd : Double = 2.0
    println(transform)
  }

  //todo 隐式类
  /**
   * 在Scala2.10后提供了隐式类，可以使用implicit声明类，隐式类非常强大，同样可以扩展类的功能，在集合的数据处理中，隐式类发挥了重要的作用。
   * 	其所带的构造参数有且只能有一个
   * 	隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的。
   */
  def main3(args: Array[String]): Unit = {
    val emp = new Emp()
    emp.insertUser()
  }
  class Emp { }
  implicit class User( emp : Emp) {
    def insertUser(): Unit = {
      println("insert user...")
    }
  }

  //todo 隐式机制
  /**
   * 所谓的隐式机制，就是一旦出现编译错误时，编译器会从哪些地方查找对应的隐式转换规则
   * 	当前代码作用域
   * 	当前代码上级作用域
   * 	当前类所在的包对象
   * 	当前类（对象）的父类（父类）或特质（父特质）
   * 其实最直接的方式就是直接导入。
   */
}