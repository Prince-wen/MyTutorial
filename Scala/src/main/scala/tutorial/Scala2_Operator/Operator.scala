package tutorial.Scala2_Operator

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-17 15:58
 * @note 运算符
 */
object Operator {

  /**
   * scala运算符的使用和Java运算符的使用基本相同，只有个别细节上不同。
   */

  //todo 算数运算符
  /**
   * 假定变量 A 为 10，B 为 20
   * 运算符    描述    实例
   *   +      加号    A+B 运算结果为 30
   *   -      减号    A-B 运算结果为 -10
   *   *      乘号    A*B 运算结果为 200
   *   /      除号    B/A 运算结果为 2
   *   %      取余    B%A 运算结果为 0
   */

  //todo 关系运算符
  /**
   * 假定变量A为10，B为20
   * 运算符    描述        实例
   *  ==      等于        (A==B)运算结果为 false
   *  !=      不等于      (A!=B)运算结果为 true
   *  >       大于        (A> B)运算结果为 false
   *  <       小于        (A< B)运算结果为 true
   *  >=      大于等于     (A>=B)运算结果为 false
   *  <=      小于等于     (A<=B)运算结果为 true
   */
  def main1(args: Array[String]): Unit = {
    //思考一个问题：如下代码执行结果如何？
    val a = new String("abc")
    val b = new String("abc")
    println(a == b)//false 在Java中==符号表示内存地址的比较
    println(a.equals(b))
    //true 在Java中equals的方法在object中就是==，但是String重写了equals方法，
    // 所以结果是重写的equals方法的结果，其实就是true

    //但是在Scala中两个结果都是true，因为在Scala中==默认就是比较内容的equals。
    //反而在Scala中，eq用于比较字符串的内存。
  }

  //todo 赋值运算符
  /**
   * 运算符    描述                                                实例
   * =        简单的赋值运算，指定右边操作数赋值给左边的操作数            C=A+B将A+B的运算结果赋值给C
   * +=       相加后再赋值，将左右两边的操作数相加后再赋值给左边的操作数    C+=A相当于C=C+A
   * -=       相减后再赋值，将左右两边的操作数相减后再赋值给左边的操作数    C-=A相当于C=C-A
   * *=       相乘后再赋值，将左右两边的操作数相乘后再赋值给左边的操作数    C*=A相当于C=C*A
   * /=       相除后再赋值，将左右两边的操作数相除后再赋值给左边的操作数    C/=A相当于C=C/A
   * %=       求余后再赋值，将左右两边的操作数求余后再赋值给左边的操作数    C%=A相当于C=C%A
   * <<=      按位左移后再赋值                                      C<<=A相当于C=C<<A
   * >>=      按位右移后再赋值                                      C>>=A相当于C=C>>A
   * &=       按位与运算后再赋值                                     C&=A相当于C=C&A
   * ^=       按位异或运算后再赋值                                   C^=A相当于C=C^A
   * |=       按位或运算后再赋值                                     C|=A相当于C=C|A
   */

  //思考一个问题：为什么在上面的运算符中没有看到 ++， --？
  //因为在运算和使用中，这样的符号有歧义，容易用错，可能造成错误。

  //todo 逻辑运算符
  /**
   * 假定变量 A 为 1，B 为 0
   * 运算符    描述      实例
   * &&       逻辑与     (A&&B)运算结果为false
   * ||       逻辑或     (A||B)运算结果为true
   * !        逻辑非     !(A&&B)运算结果为true
   */

  //todo 位运算符
  /**
   * 如果指定 A = 60; 及 B = 13; 两个变量对应的二进制为
   * A = 0011 1100
   * B = 0000 1101
   * 运算符  描述          实例
   * &      按位与运算符    (a&b)输出结果12，二进制解释: 0000 1100
   * |      按位或运算符    (a|b)输出结果61，二进制解释: 0011 1101
   * ^      按位异或运算符   (a^b)输出结果49，二进制解释: 0011 0001
   * ~      按位取反运算符   (~a)输出结果-61，二进制解释: 1100 0011,在一个有符号二进制数的补码形式。
   * <<     左移动运算符    a<<2输出结果240，二进制解释: 1111 0000
   * >>     右移动运算符    a>>2输出结果15，二进制解释: 0000 1111
   * >>>    无符号右移      a>>>2输出结果15，二进制解释: 0000 1111
   *
   * 思考一个问题：有啥用？你用过吗或你接触过吗？
   *
   * jdk1.8后，HashMap极限情况下，放多少数据会转换成红黑二叉树
   * 答案：
   * 极限情况下，HashMap放置11个数据，会变成红黑二叉树
   * 1.当HashMap的链表数据超过8个（第9个）的时候，会尝试转换为二叉树
   * 2.判断容量是否足够，如果容量不够，会扩容16*2 => 32(第9个)
   * 3.判断容量是否足够，如果容量不够，会扩容32*2 => 64(第10个)
   * 4.容量64已经足够大，不在扩容，而转变数据结构=> 二叉树
   *
   * 这个过程是与位运算相关。
   * 底层源码使用如下代码实现位置的判断：
   * hash( key.hashCode ) & ( length - 1 )
   * redis的数据存储位置的判断：
   * crc16(key,keylen) & 0x3FFF (这个值就是16384-1)  16384 <=> 16K
   *
   *
   * 为什么HashMap扩容必须是2倍
   * 为了保证2^n，可以使得所有的插槽全都可以被利用到，否则将会损失内存空间
   *
   * 那如果不是2^n的值怎么快速计算位置，那就只能用%的方式对值进行计算，这样相对来说就会比hash的方式会慢一些
   *
   *
   * 为什么重写类的时候要求同时重写equals和hashcode，
   * 两个方法本质上没有联系，但是由于在HashMap结构中保存的时候，会根据HashMap判断数据保存的位置。
   * 如果hashcode的值不相同，也就不会把数据放在同一个位置上，只有放在同一个位置上，且equals判断相等，才能判断是相同的对象。
   * 这个问题在其他的结构中基本不存在。
   */

  //todo 运算符本质
  /**
   * 在Scala中其实是没有运算符的，所有运算符都是方法。
   * 	scala是完全面向对象的语言，所以数字其实也是对象
   * 	当调用对象的方法时，点.可以省略
   * 	如果函数参数只有一个，或者没有参数，()可以省略
   */
  def main2(args: Array[String]): Unit = {
    val i : Int = 10
    val j : Int = i.+(10)
    val k : Int = j +(20)
    val m : Int = k + 30
    println(m)
  }
}
