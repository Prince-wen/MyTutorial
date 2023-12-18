import scala.collection.mutable
import scala.util.control.Breaks
import scala.util.control.Breaks.break

/**
 * @author Shiwen Li CN116237626
 * @create 2022-01-13 15:33
 * @note
 */
object _334_increasingTriplet {
  def main(args: Array[String]): Unit = {
    //nums = [1,2,3,4,5]
    //输出：true
    val nums: Array[Int] = Array(1, 2, 3, 4, 5)
    println(increasingTriplet(nums))
    //输入：nums = [5,4,3,2,1]
    //输出：false
    //输入：nums = [2,1,5,0,4,6]
    //true
    val nums2: Array[Int] = Array(5, 4, 3, 2, 1)
    println(increasingTriplet(nums2))
    val nums3: Array[Int] = Array(2, 1, 5, 0, 4, 6)
    val bool: Boolean = increasingTripletFast(nums2)
    bool
    println(bool)
    val nums4: Array[Int] = Array(1, 5, 0, 4, 1, 3)
    val bool1: Boolean = increasingTripletFast(nums4)
    println(bool1)

  }

  /**
   * 通过数组下标的顺寻一致，寻求数值的合理性
   * 但是，经测试不满足时间复杂度
   * @param nums
   * @return
   */
  def increasingTriplet(nums: Array[Int]): Boolean = {
    var bool: Boolean = false
    //循环每个可能的j
    Breaks.breakable(
      for (j <- 1 until nums.length - 1) {
        val mid: Int = nums(j)
        //traverse on the left: 0 <= i < j
        // => 0 ~ j-1
        for (i <- 0 until j) {
          //check
          if (nums(i) < mid) {
            //traverse on the right: j < k <= nums.length
            for (k <- j + 1 until nums.length) {
              if (nums(k) > mid) {
//                println(s"i,j,k --> $i,$j,$k")
                bool = true
                break
              }
            }
          }
        }
      }
    )

    bool
  }

  /**
   * 递增子序列
   * @param nums
   * @return
   */
  def increasingTripletFast(nums: Array[Int]): Boolean = {
    //寻找递增子序列 increase list
    var small,mid : Integer = Integer.MAX_VALUE
    for (elem <- nums) {
      if (elem <= small) {
        small = elem
      } else if (elem <= mid) {
        mid = elem
      } else {
        return true
      }
    }
    false
  }
}
