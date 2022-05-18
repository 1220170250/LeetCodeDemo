//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 2245 👎 0


package leetcode.editor.cn;

/**
 * 最长公共前缀
 * @author qinkai
 * @date 2022-05-18 15:34:55
 */
public class P14_LongestCommonPrefix{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P14_LongestCommonPrefix().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0)
			return "";
		//公共字符串，默认第一个
		String ans = strs[0];

		//依次对比后面字符和第一个字符公共的
		for(int i =1;i<strs.length;i++) {
			int j=0;
			for(;j<ans.length() && j < strs[i].length();j++) {
				if(ans.charAt(j) != strs[i].charAt(j)) {
					//不公共跳出，记录下标
					break;
				}
			}
			//截取获得公共字符串
			ans = ans.substring(0, j);
			if(ans.equals("")){
				//如果没有公共子串，直接返回
				return ans;
			}

		}
		return ans;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}
