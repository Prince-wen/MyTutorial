package tutorial.Scala5_OOP

import scala.beans.BeanProperty

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 13:06
 * @note 面向对象编程，类
 */
object b_Class {
  def main(args: Array[String]): Unit = {

    //todo 类
    /**
     * 面向对象编程中类可以看成一个模板，而对象可以看成是根据模板所创建的具体事物
     * 1)	基本语法
     * 声明类：访问权限 class 类名 { 类主体内容 }
     * class User { }
     * 对象：new 类名(参数列表)
     * new User()
     * 2)	扩展语法
     * Scala中一个源文件中可以声明多个类
     * 也可以在一个类中声明内部类
     */

    //todo 属性
    /**
     * 1)	基本语法
     * class User0 {
     *   var name : String = _ // 类属性其实就是类变量
     *   var age : Int = _ // 下划线表示类的默认初始化
     * }
     * 2)	扩展语法
     * Scala中的属性其实在编译后也会生成方法
     * class User00 {
     *   var name : String = _
     *   val age : Int = 30
     *   private var email : String = _
     *   @BeanProperty //使用这个注解以后，默认的不遵守Bean规范的Scala生成的方法就会变成遵守Bean规范的方法
     *   //也就是所有的get；set方法都是用get和set作为方法名开头
     *   //且现在很多框架已经不遵循Bean规范了，因为反射的方式可以直接获取属性值，比如Spring自动装配=>自动完成两个对象的组合
     *   var address : String = _
     * }
     */

    //todo 访问权限
    /**
     * Java中的访问权限
     * private  ：私有权限     同类
     * default  ：包权限       同类，同包
     * protected：受保护权限    同类，同包，子类
     * public   ：公共权限     公共访问权限
     * Scala中的访问权限和Java中的访问权限类似，但是又有区别：
     * private : 私有访问权限       如果属性声明为private，那么编译器生成get，set方法时，也会使用private进行修饰。
     *                              （且声明BeanProper使用时不能使用private权限）
     * private[包名]: 包访问权限     同类，指定包及其子包
     * protected : 受保护权限       同类，子类
     *        : 公共访问权限        公共访问权限，Scala源文件中可以声明多个公共类
     *
     *
     * 思考一个问题: 你会调用java中的clone方法吗？（探究子类权限的细节）
     * 访问权限：权力和限制
     * 方法的提供者：java.lang.Object
     * 方法的调用者：com.shiwen.tutorial.Scala5_OOP.User
     * 问题1： 方法的调用者不是b_Class
     * 问题2： 点的作用？ 从属关系
     * user.clone()
     * //给user对象的name属性赋了一个值为张三
     * user.name="zhangsan"
     *
     * 所以方法的调用者是：com.shiwen.tutorial.Scala5_OOP.b_Class
     * 问题3： 方法的调用者没有被调用方法的权限。
     */

    //todo 方法
    /**
     * Scala中的类的方法其实就是函数，所以声明方式完全一样，但是必须通过使用对象进行调用
     * def main(args: Array[String]): Unit = {
     *   val user = new User1
     *   user.login("zhangsan", "000000")
     * }
     * class User1 {
     *   def login( name:String, password:String ): Boolean = {
     *     false
     *   }
     * }
     * 默认方法：
     *    java.lang.Object
     *    Scala提供的
     *      asInstanceOf[]
     *      isInstanceOf[]
     *      getClass
     *      ClassOf[]
     *      apply()
     * apply方法一般用于object伴生对象中构建对象
     * 伴生对象可以访问伴生类的私有属性和方法
     * Scala可以自动识别apply方法，所以调用伴生对象的apply方法时，apply方法名可以省略
     * apply在声明的时候小括号不能省略
     * apply方法主要用于构建对象，但是这个构建的对象不一定是当前类的对象
     * apply可以重载
     *
     * 思考两个问题: 还记得方法的重写和重载吗？ 你真的明白吗？
     *
     * 方法的重载：参数的名字相同，参数的数量、参数的类型、参数的顺序不相同。
     *    数值类型，在重载的方法中会提升精度。
     *    引用类型，在重载的方法如果找不到对应的类型。会从类树网上查找。
     * 方法的重写：
     *    子类重写父类的方法。子类重写父类相同方法的逻辑
     *    方法名一致，参数列表保持一致，异常范围，访问权限。
     *    在调用时，无法确定到底执行哪一个方法，那么需要遵循：动态绑定机制
     *    动态绑定机制-程序执行过程，如果调用了对象的“成员”、“方法”时。会将方法和对象的实际内存进行绑定，然后调用。
     */

    //todo 对象
    /**
     * Scala中的对象和Java是类似的
     * val | var 对象名 [：类型]  = new 类型()
     * var user : User = new User()
     */

    //todo 构造方法
    /**
     * 和Java一样，Scala中构造对象也需要调用类的构造方法来创建。
     * 并且一个类中可以有任意多个不相同的构造方法。这些构造方法可以分为2大类：主构造函数和辅助构造函数。
     * class User() { // --主构造函数
     *   var username : String = _
     *   def this( name:String ) { // --辅助构造函数，使用this关键字声明
     *     this() // 辅助构造方法必须直接或间接调用主构造函数
     *     username = name
     *   }
     *   def this( name:String, password:String ) {
     *     this(name) // 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
     *   }
     * }
     *
     * 在Scala中一般构造方法的参数用于属性的初始化，所以为了减少数据的冗余
     * 可以使用关键字var，val将构造函数当成类的属性来用。
     * 如果在类名后面增加private关键字，表示主构造方法私有化，无法在外部使用。
     * 如果父类的构造函数中有参数，可以直接在extends后边的父类的括号中加参数进行传参。
     */

  }
}