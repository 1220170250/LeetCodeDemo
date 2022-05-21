//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "hello", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= haystack.length, needle.length <= 104 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 字符串匹配 
// 👍 1428 👎 0


package leetcode.editor.cn;

/**
 * 实现 strStr()
 * @author qinkai
 * @date 2022-05-19 17:50:59
 */
public class P28_ImplementStrstr{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P28_ImplementStrstr().new Solution();
		 System.out.println(solution.strStr("a","aaa"));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
    	if (needle.length() == 0){
			return 0;
		}
		char[] s = haystack.toCharArray();
		char[] n = needle.toCharArray();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == n[0]) {
				for (int j = i+1; j < i + n.length; j++) {
					if( j>=s.length || s[j] != n[j-i]){
						return -1;
					}
				}
				return i;
			}
		}

        return -1;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
