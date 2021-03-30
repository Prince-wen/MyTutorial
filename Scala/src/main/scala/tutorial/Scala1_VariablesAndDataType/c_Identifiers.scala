package tutorial.Scala1_VariablesAndDataType

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 14:41
 * @note 标识符
 */
object c_Identifiers {
  def main(args: Array[String]): Unit = {
    /**
     * Scala 可以使用两种形式的标志符，字符数字和符号。
     * 	字符数字使用字母或是下划线开头，后面可以接字母或是数字，符号"$"在 Scala 中也看作为字母。
     *    然而以"$"开头的标识符为保留的 Scala 编译器产生的标志符使用，应用程序应该避免使用"$"开始的标识符，以免造成冲突。
     * 	Scala 的命名规则采用和 Java 类似的 camel 命名规范，首字符小写，比如 toString。
     *    类名的首字符还是使用大写。此外也应该避免使用以下划线结尾的标志符以避免冲突。
     * 	Scala 内部实现时会使用转义的标志符，比如:-> 使用 $colon$minus$greater 来表示这个符号。
     */
    //todo  和Java一样的标识符命名规则
    val name = "zhangsan" // OK
    val name1 = "zhangsan0"   // OK
    //val 1name = "zhangsan0" // Error
    val name$ = "zhangsan1" // OK
    val $name = "zhangsan2" // OK
    val name_ = "zhangsan3" // OK
    val _name = "zhangsan4" // OK
    val $ = "zhangsan5"     // OK
    val _ = "zhangsan6"     // OK
    //val 1 = "zhangsan6"     // Error
    //val true = "zhangsan6"  // Error

    //todo 和Java不一样的标识符命名规则
    val + = "lisi" // OK
    val - = "lisi" // OK
    val * = "lisi" // OK
    val / = "lisi" // OK
    val ! = "lisi" // OK
    //val @ = "lisi" // Error
    val @@ = "lisi" // OK
    //val # = "lisi" // Error
    val ## = "lisi" // OK
    val % = "lisi" // OK
    val ^ = "lisi" // OK
    val & = "lisi" // OK
    //val ( = "lisi" // Error
    //val ( = "lisi" // Error
    //val ) = "lisi" // Error
    //val = = "lisi" // Error
    val == = "lisi" // OK
    //val [ = "lisi" // Error
    //val ] = "lisi" // Error
    //val : = "lisi" // Error
    val :: = "lisi" // OK
    //val ; = "lisi" // Error
    //val ' = "lisi" // Error
    //val " = "lisi" // Error
    val "" = "lisi" // OK
    val < = "lisi" // OK
    val > = "lisi" // OK
    val ? = "lisi" // OK
    val | = "lisi" // OK
    val \ = "lisi" // OK
    //val ` = "lisi" // Error
    val ~ = "lisi" // OK
    val :-> = "wangwu" // OK
    val :-< = "wangwu" // OK
    // 切记，能声明和能使用是两回事
  }

  /**
   * 1.Scala 中的标识符也不能是关键字或保留字，那么Scala中有多少关键字或保留字呢？
   *
   * abstract    case    catch     class   def      do        else      extends
   * false       final   finally   for     forSome  if        implicit  import
   * lazy        match   new       null    object   override  package   private
   * protected   return  sealed    super   this     throw     trait     try
   * true        type    val       var     while    with      yield
   * -    :    =    =>    <-    <    <%    >    #    @
   *
   * 2.如何在Java语言中访问Scala对象？
   * Scala是基于Java开发的，所以可以直接访问
   * Java通过importScala类，通过类名可以访问Scala的方法
   * 3.如果变量就想使用特定含义的关键字怎么办？
   * 在使用关键字之前，在外边包上反引号``的方式可以通过编译器的编译过程。
   */
}
