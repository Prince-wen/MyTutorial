import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * @author Shiwen Li CN116237626
 * @create 2022-01-26 10:08
 * @note
 */
public class java_4_findMedianSortedArrays {

	/**
	 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
	 *
	 * 算法的时间复杂度应该为 O(log (m+n)) 。
	 * 示例 1：
	 * 输入：nums1 = [1,3], nums2 = [2]
	 * 输出：2.00000
	 * 解释：合并数组 = [1,2,3] ，中位数 2
	 * 示例 2：
	 * 输入：nums1 = [1,2], nums2 = [3,4]
	 * 输出：2.50000
	 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
	 * 示例 3：
	 * 输入：nums1 = [0,0], nums2 = [0,0]
	 * 输出：0.00000
	 * 示例 4：
	 * 输入：nums1 = [], nums2 = [1]
	 * 输出：1.00000
	 * 示例 5：
	 * 输入：nums1 = [2], nums2 = []
	 * 输出：2.00000
	 * 提示：
	 * nums1.length == m
	 * nums2.length == n
	 * 0 <= m <= 1000
	 * 0 <= n <= 1000
	 * 1 <= m + n <= 2000
	 * -106 <= nums1[i], nums2[i] <= 106
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		//因为nums1 和nums2的大小是不相同的，所以需要比较
		//中位数是数量之和除以2之后位置的数字，如果没有，则应该是中间两个数的平均值
		//如9个数字，中位数应该是第五个数，如8个数，则应该是45两个数位上的平均值
		//中位数位置判定 ((m+n) % 2 == 0) ? m+n/2
		int len = nums1.length + nums2.length;
		System.out.println("len : "+len);

		//逐个对比两个数组的值直到找到中间位置
		int i = 0,j = 0;

		//方法1
		//合并数组并排序
//		int[] mergeArray = new int[len/2+1];
//		for (int k = 0; k < len/2+1; k++) {
//			//索引和理性判断
//			if (!(nums1.length>i)) {
//				mergeArray[k] = nums2[j++];
//				continue;
//			}
//			if (!(nums2.length>j)) {
//				mergeArray[k] = nums1[i++];
//				continue;
//			}
//			if (nums1[i]>nums2[j]) {
//				mergeArray[k] = nums2[j++];
//			} else {
//				mergeArray[k] = nums1[i++];
//			}
//			//比较索引位置数值的大小
//		}
//		return (len % 2 == 0) ? (mergeArray[len/2] + mergeArray[len/2 - 1]) / 2.0D : mergeArray[len/2];

		//方法1 动态初始化一个数组，保存前半段的数组值
		int[] temp = new int[2];
		while (i+j < len/2+1) {
			//索引和理性判断
			temp[0] = temp[1];
			if (!(nums1.length>i)) {
				temp[1] = nums2[j++];
				continue;
			}
			if (!(nums2.length>j)) {
				temp[1] = nums1[i++];
				continue;
			}
			if (nums1[i]>nums2[j]) {
				temp[1] = nums2[j++];
			} else {
				temp[1] = nums1[i++];
			}
			//比较索引位置数值的大小
		}
		return (len % 2 == 0) ? (temp[0] + temp[1]) / 2.0D : temp[1];


//		System.out.println("half array length : "+half.length);
//		while (i+j <= len/2) {
//			System.out.println("i : "+i+" ,j : "+j);
////			half[i+j] = nums1[i] > nums2[j] ? nums2[j++] : nums1[i++];
//			if (nums1[i] > nums2[j]) {
//				half[i+j] = nums2[j];
//				if (j<nums2.length-1){
//					j+=1;
//				} else {
//					i+=1;
//				}
//			} else {
//				half[i+j] = nums1[i];
//				if (i<nums1.length-1){
//					i+=1;
//				} else {
//					j+=1;
//				}
//			}
//		}
//
//		int arrlength = half.length;
//		return (len%2 == 0) ? (half[arrlength - 1] + half[arrlength - 2]) / 2.0D : half[arrlength - 1];


		//方法2 按照索引定位中位数的位置

//		int[] last = {0,0};
//		//值缓存位置
//		while (i+j < len/2) {
//			last[0] = last[1];
//			if (nums1[i] > nums2[j]) {
//				if (j < nums2.length-1) {
//					j++;
//					last[1] = 1;
//				} else {
//					i++;
//					last[1] = 0;
//				}
//			} else {
//				if (i < nums1.length-1) {
//					i++;
//					last[1] = 0;
//				} else {
//					j++;
//					last[1] = 1;
//				}
//			}
//		}
//		if (last[1] == 0) {
//			i-=1;
//		} else {
//			j-=1;
//		}
//		return (len % 2 == 0) ? (nums1[i] + nums2[j]) / 2.0 : Math.min(nums1[i], nums2[j]);
	}

	public static void main(String[] args) {
//		int[] nums1 = {1, 3}, nums2 = {2};//2.0
		int[] nums1 = {1, 2}, nums2 = {3, 4};


		double median = new java_4_findMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
		System.out.println(median);
	}
}




/*
java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
  at line 10, Solution.findMedianSortedArrays
  at line 54, __DriverSolution__.__helper__
  at line 87, __Driver__.main
 */