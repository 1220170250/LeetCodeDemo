//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 3255 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 有效的括号
 * @author qinkai
 * @date 2022-05-18 17:35:47
 */
public class P20_ValidParentheses{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P20_ValidParentheses().new Solution();
         System.out.println(solution.isValid("(([{))]}"));

	 }

//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
    	if("".equals(s) || s.length()%2 !=0){
    		return false;
		}
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    list.add(1);
                    break;
                case ')':
                    list.add(-1);
                    break;
                case '[':
                    list.add(2);
                    break;
                case ']':
                    list.add(-2);
                    break;
                case '{':
                    list.add(3);
                    break;
                case '}':
                    list.add(-3);
                    break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j >i ; j--) {
               if(list.get(j).equals(-list.get(i))){

               }
            }
            list.get(i);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
