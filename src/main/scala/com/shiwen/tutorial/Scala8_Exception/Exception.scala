package com.shiwen.tutorial.Scala8_Exception

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 12:05
 * @note 异常
 */
object Exception {
  def main(args: Array[String]): Unit = {

/*

    9.1 简介
      语法处理上和Java类似，但是又不尽相同。
    Java异常：
    try {
      int a = 10;
      int b = 0;
      int c = a / b;
    } catch (ArithmeticException e){
      // catch时，需要将范围小的写到前面
      e.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      System.out.println("finally");
    }
    9.2 基本语法
    object ScalaException {
      def main(args: Array[String]): Unit = {
        try {
          var n= 10 / 0
        }catch {
          case ex: ArithmeticException=>{
            // 发生算术异常
            println("发生算术异常")
          }
          case ex: Exception=>{
            // 对异常处理
            println("发生了异常1")
          }
        }finally {
          println("finally")
        }
      }
    }
    Scala中的异常不区分所谓的编译时异常和运行时异常，也无需显示抛出方法异常，所以Scala中没有throws关键字。
    思考三个问题:
    	什么是编译时异常和运行时异常 ？
    	分别举几个例子？
    	如果Java程序调用scala代码，如何明确异常？
*/



  }
}
