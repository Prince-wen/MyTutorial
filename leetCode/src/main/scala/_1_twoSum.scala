/**
 * @author Shiwen Li CN116237626
 * @create 2022-01-17 17:01
 * @note
 */
object _1_twoSum {

  def main(args: Array[String]): Unit = {

    val nums: Array[Int] = Array(2, 7, 11, 15)
    val target: Int = 9

    val array: Array[Int] = twoSum(nums, target)

    println(array.mkString("Array(", ", ", ")"))
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var arr: Array[Int] = Array()

    for (j <- nums.indices) {
      val elem: Int = nums(j)
      for (i <- nums.indices) {
        if (i != j) {
          if (elem + nums(i) == target) arr = Array(i,j)
        }
      }
    }
    arr
  }
}
