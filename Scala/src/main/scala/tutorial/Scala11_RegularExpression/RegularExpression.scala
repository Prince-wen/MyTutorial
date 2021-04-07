package tutorial.Scala11_RegularExpression

import scala.util.matching.Regex

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 12:12
 * @note 正则表达式
 */
object RegularExpression {
  /**
   * todo 简介
   * 正则表达式(regular expression)描述了一种字符串匹配的模式（pattern），
   * 可以用来检查一个串是否含有某种子串、将匹配的子串替换或者从某个串中取出符合某个条件的子串等。
   */

  //todo 基本语法
  def main1(args: Array[String]): Unit = {
    // 构建正则表达式
    val pattern = "Scala".r
    val str = "Scala is Scalable Language"
    // 匹配字符串 - 第一个
    println(pattern findFirstIn str)
    // 匹配字符串 - 所有
    val iterator: Regex.MatchIterator = pattern findAllIn str
    while ( iterator.hasNext ) {
      println(iterator.next())
    }

    println("***************************")
    // 匹配规则：大写，小写都可
    val pattern1 = new Regex("(S|s)cala")
    val str1 = "Scala is scalable Language"
    println((pattern1 findAllIn str1).mkString(","))
  }

  //todo 案例实操
  //	手机号正则表达式验证方法
  def main2(args: Array[String]): Unit = {
    // 构建正则表达式
    println(isMobileNumber("18801234567"))
    println(isMobileNumber("11111111111"))
  }
  def isMobileNumber(number: String): Boolean ={
    val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
    val length = number.length
    regex.findFirstMatchIn(number.slice(length-11,length)) != None
  }
  //	提取邮件地址的域名部分
  def main3(args: Array[String]): Unit = {
    // 构建正则表达式
    val r = """([_A-Za-z0-9-]+(?:\.[_A-Za-z0-9-\+]+)*)(@[A-Za-z0-9-]+(?:\.[A-Za-z0-9-]+)*(?:\.[A-Za-z]{2,})) ?""".r
    println(r.replaceAllIn("abc.edf+jianli@gmail.com   hello@gmail.com.cn", (m => "*****" + m.group(2))))
  }

}