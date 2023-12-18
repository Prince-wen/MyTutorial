/**
 * @author Shiwen Li CN116237626
 * @create 2022-01-21 14:24
 * @note
 */
public class java_3_lengthOfLongestSubstring {


	/**
	 * 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
	 *
	 * 示例1:
	 * 输入: s = "abcabcbb"
	 * 输出: 3
	 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
	 * 示例 2:
	 * 输入: s = "bbbbb"
	 * 输出: 1
	 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
	 * 示例 3:
	 * 输入: s = "pwwkew"
	 * 输出: 3
	 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
	 *     请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
	 * 示例 4:
	 * 输入: s = ""
	 * 输出: 0
	 * 提示：
	 * 0 <= s.length <= 5 * 104
	 * s由英文字母、数字、符号和空格组成
	 *
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {

/*
		//1.如果字符串长度不等于0，那么最小字串长度至少是1
		int length = s.length();
		if (length == 0) {
			return 0;
		}
		int lengthOfLongestSubstring = 0;//非空字符串的最小字串长度至少为1，因为不存在自己和自己重复的情况

		//2.通过滑动窗口寻找字串
		//窗口长度只增不减
		//滑动距离只能是1
		char[] chars = s.toCharArray();
		//window
		int window_point = 0,window_break = 1;

		while (window_break < length) {//通过滑动窗口寻找更大的窗口是否符合要求
			int step = 1;
			int window_width = lengthOfLongestSubstring + 1;
			boolean isduplicate = false;
			char nChar = chars[window_break];

			//check duplicate isduplicate = true/false
			for (int i = 0; i < window_width; i++) {//traverse in the window except nChar
				if (chars[window_point+i] == nChar) {
					//当出现重复
					isduplicate = true;
					step = window_break - window_point + i - window_width + 1;
					break;
				}
			}
			//窗口行为 滑动/加长
			if (isduplicate) {//finished the duplicate check and $isduplicate = false
				//当前的window中发现了重复值，窗口滑动
				window_point += step;
			} else {
				//当前window未发现重复值，当前窗口内的字符串可以视为有效的最大值字串，窗口变长
				lengthOfLongestSubstring += 1;
			}
			window_break += step;
		}

		//3.返回结果，字串的长度不应大于字符串长度
		return lengthOfLongestSubstring + 1;
*/


		int[] m = new int[128];
		int len = 0;
		for(int i = 0, j = 0; j < s.length(); j++){
			i = Math.max(m[s.charAt(j)], i);//判断窗口左边的索引位置：不变，或者在重复时获取该字符索引的下一个位置。
			len = Math.max(len, j - i + 1);//对比当前窗口宽度和默认窗口宽度，保存最大值
			m[s.charAt(j)] = j + 1;//保存当前字符的索引值
		}
		return len;
	}

	public static void main(String[] args) {
//		String str = "abcabcbb";
//		String str = "pwwkew";
//		String str = "aau";//2
		String str = "ggububgvfk";

		java_3_lengthOfLongestSubstring ob = new java_3_lengthOfLongestSubstring();
		int result = ob.lengthOfLongestSubstring(str);
		System.out.println(result);
	}
}