package com.shiwen.tutorial.Scala10_GenericParadigm

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 12:11
 * @note
 */
object GenericParadigm {
/*

  11.1 简介
    Scala的泛型和Java中的泛型表达的含义都是一样的，对处理的数据类型进行约束，但是Scala提供了更加强大的功能
  class Test[A] {
    private var elements: List[A] = Nil
  }
  11.2 泛型转换
    Scala的泛型可以根据功能进行改变
  11.2.1 泛型不可变
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {

      val test1 : Test[User] = new Test[User] // OK
      val test2 : Test[User] = new Test[Parent] // Error
      val test3 : Test[User] = new Test[SubUser]  // Error

    }
    class Test[T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.2.2 泛型协变
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {

      val test1 : Test[User] = new Test[User] // OK
      val test2 : Test[User] = new Test[Parent] // Error
      val test3 : Test[User] = new Test[SubUser]  // OK

    }
    class Test[+T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.2.3 泛型逆变
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {

      val test1 : Test[User] = new Test[User] // OK
      val test2 : Test[User] = new Test[Parent] // OK
      val test3 : Test[User] = new Test[SubUser]  // Error

    }
    class Test[-T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.3 泛型边界
    Scala的泛型可以根据功能设定类树的边界
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {
      val parent : Parent = new Parent()
      val user : User = new User()
      val subuser : SubUser = new SubUser()
      test[User](parent) // Error
      test[User](user)   // OK
      test[User](subuser) // OK
    }
    def  test[A]( a : A ): Unit = {
      println(a)
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.3.1 泛型上限
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {
      val parent : Parent = new Parent()
      val user : User = new User()
      val subuser : SubUser = new SubUser()
      test[Parent](parent) // Error
      test[User](user)   // OK
      test[SubUser](subuser) // OK
    }
    def  test[A<:User]( a : A ): Unit = {
      println(a)
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.3.2 泛型下限
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {
      val parent : Parent = new Parent()
      val user : User = new User()
      val subuser : SubUser = new SubUser()
      test[Parent](parent) // OK
      test[User](user)   // OK
      test[SubUser](subuser) // Error
    }
    def  test[A>:User]( a : A ): Unit = {
      println(a)
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
  11.4 上下文限定
    上下文限定是将泛型和隐式转换的结合产物，以下两者功能相同，使用上下文限定[A : Ordering]之后，方法内无法使用隐式参数名调用隐式参数，需要通过implicitly[Ordering[A]]获取隐式变量，如果此时无法查找到对应类型的隐式变量，会发生出错误。
  object ScalaGeneric {
    def main(args: Array[String]): Unit = {
      def f[A : Test](a: A) = println(a)
      implicit val test : Test[User] = new Test[User]
      f( new User() )
    }
    class Test[T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
  }
*/


}
