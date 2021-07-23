package tutorial.Scala1_VariablesAndDataType

import java.text.SimpleDateFormat
import java.util.Calendar
import scala.collection.mutable.ArrayBuffer

/**
 * @author Shiwen Li CN116237626
 * @create 2021-06-23 14:52
 * @note
 */
object h_date {
  def main(args: Array[String]): Unit = {

    val startTime = "2017-12-01"
    val endTime = "2018-01-10"

    val dateFormat = new SimpleDateFormat("yyyy-MM-dd")
    val dateFiled = Calendar.DAY_OF_MONTH

    var beginDate = dateFormat.parse(startTime)
    val endDate = dateFormat.parse(endTime)
    val calendar = Calendar.getInstance()

    calendar.setTime(beginDate)

    val dateArray: ArrayBuffer[String] = ArrayBuffer()

    while (beginDate.compareTo(endDate) <= 0) {
      dateArray += dateFormat.format(beginDate)
      calendar.add(dateFiled, 1)
      beginDate = calendar.getTime
    }

    for (date <- dateArray){
      println(date)
    }
  }
}
