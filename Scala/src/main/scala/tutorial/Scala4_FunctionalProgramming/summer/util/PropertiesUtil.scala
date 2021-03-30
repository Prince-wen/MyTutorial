package tutorial.Scala4_FunctionalProgramming.summer.util

import java.util.ResourceBundle

/**
 * @author Shiwen Li
 * @account CN116237626
 * @create 2021-03-25 9:39
 * @note
 */
object PropertiesUtil {

  //绑定配置文件
  //ResoruceBundle专门用于读取配置文件，所以读取时，不需要增加扩展名
  //国际化 = I18N => Properties

  private val summer: ResourceBundle = ResourceBundle.getBundle("summer")

  def getValue(key : String): String={
    summer.getString(key)
  }
}
