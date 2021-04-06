package tutorial.Scala8_Exception

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 12:05
 * @note 异常
 */
object Exception {
  def main(args: Array[String]): Unit = {
/*
    //todo 简介
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

    //todo 基本语法
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
    catch关键字只使用一次
    多个异常采用case语法进行区分
    异常处理的语法类似于模式匹配，所以匹配方式从前到后，一般会将范围大的异常放置在范围小的异常后面进行处理
    Scala中的异常不分编译期异常和运行期异常，所以无需显示的处理和抛出；Scala中没有throws关键字

    //todo 思考三个问题:
    	什么是编译时异常和运行时异常 ？
    所有的异常都是在运行的时候产生的

    Exception是可以被解决的
    Error是无法被解决的

    	分别举几个例子？
    编译时异常：IOException;
              SocketException;
              FileNotFoundException;
              ClassNotFoundException;
    运行时异常：NollPointerException;
              ArrayIndexOutOfBoundsException;
              NumberFormatException;

    空指针异常：调用一个为空(null)对象的成员方法或成员属性就会发生空指针异常。
    jvm执行程序时发生的错误不是源码中的错误，是字节码运行时的错误。
    拆箱操作可能会导致空指针异常。
    拆箱：Integer.intValue()*member* -> 空对象的成员方法
    装箱：Integer.valueOf()*static*
    且Integer有一个-127~128的cache区域，这个区域的值直接拿来用，如果超出，将会new Integer

    同时，所有可迭代的对象都可以使用增强for循环

    	如果Java程序调用scala代码，如何明确异常？
    如果想要在处理时，明确异常的处理，那么需要在Scala对象的方法前增加注解
    @throws[Exception type]
*/
  }
}
