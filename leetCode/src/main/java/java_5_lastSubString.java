import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Shiwen Li CN116237626
 * @since 4/25/2023 17:24
 */
public class java_5_lastSubString {

	public static void main(String[] args) {
		java_5_lastSubString o = new java_5_lastSubString();

		String s = "abab";
		System.out.println(o.lastSubstring(s));
		String ss = "leetcode";
		System.out.println(o.lastSubstring(ss));
		String s1 = "cacacb";
		System.out.println(o.lastSubstring(s1));

	}

	/**
	 * 1.实现，但报错，因为超出内存限制
	 * @param s 输入字符串
	 * @return 最后的子串
	 */
	public String lastSubstring1(String s) {
		//分解s,获取所有子串
		int sLength = s.length();
		int head = 0;
		int len = 0;

		HashSet<String> set = new HashSet<>();

		while (head < sLength) {
			len++;
			System.out.print("head: " + head + ", len: " + len+"\t\t");
			System.out.print(s.substring(head, head + len));
			set.add(s.substring(head, head + len));
			System.out.println("\t\tadd");
			if ((head + len) == sLength){
				head++;
				len=0;
			}
		}
		//将所有字串存入set，去重
		System.out.println(set);

		List<String> list = Arrays.stream(set.toArray()).map(o -> (String) o).collect(Collectors.toList());
		System.out.println(list);

		//将set中的字符串转存入list中，然后做排序
		Collections.sort(list);
		System.out.println(list);

		return list.get(list.size()-1);
	}

	/**
	 * 2.优化逻辑,但是依然不能通过测试，还是会报错
	 * @param s 输出字符串
	 * @return 最后的子串
	 */
	public String lastSubstring2(String s) {
		//进行字母判断
		HashSet<Character> charSet = new HashSet<>();
		for (char c : s.toCharArray()) {
			charSet.add(c);
		}
		List<Character> characterList = Arrays.stream(charSet.toArray()).map(o -> (Character) o).sorted().collect(Collectors.toList());
		Character lastChar = characterList.get(characterList.size() - 1);

		// 所有有效子串获取
		HashSet<String> set = new HashSet<>();
		String remainString = s.substring(s.indexOf(lastChar));
		while (!remainString.isEmpty()) {
			set.add(remainString);

			int i = remainString.substring(1).indexOf(lastChar);
			remainString = remainString.substring(i +1);
			if (remainString.length() <=1 || i == -1) break;
		}

		// 有效子串获取并转为list做排序
		List<String> list = Arrays.stream(set.toArray()).map(o -> (String) o).sorted().collect(Collectors.toList());
		System.out.println(list);

		// 返回最后一个子串
		return list.get(0);
	}

	/**
	 * 3.双指针法，找到字典序最大的最大字串即可（改用官方答案）
	 * @param s 输出字符串
	 * @return 最后的子串
	 */
	public String lastSubstring(String s) {
		int length = s.length();
		System.out.println(length);
		int index = 0;
		int i=1,k=0;
		while (i + k < length) {
			System.out.println("index: "+index+", ("+s.charAt(index)+"), i: "+i+", ("+s.charAt(i)+"), k: "+k);
			int check = s.charAt(index + k) - s.charAt(i + k);

			//1.相同，什么也不做，k+1，继续向后对比
			//2.大于0，最大字串不用换，当前位置太小，下一个，i+1,k=0
			//3.小于0，最大字串切换到当前位置，index=i,i+1,k=0
			if (check == 0) {
				k++;
			} else if (check > 0) {
				i+=k+1;
				k=0;
			} else  {//if (check < 0)
				index += k+1;
				k=0;
				if (index >= i){
					i = index+1;
				}
			}
		}
		return s.substring(index);
	}

}
