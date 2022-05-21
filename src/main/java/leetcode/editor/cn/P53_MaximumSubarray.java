//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 子数组 是数组中的一个连续部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,4,-1,7,8]
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// -104 <= nums[i] <= 104 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 
// 👍 4902 👎 0


package leetcode.editor.cn;

/**
 * 最大子数组和
 * @author qinkai
 * @date 2022-05-21 15:54:23
 */
public class P53_MaximumSubarray{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P53_MaximumSubarray().new Solution();
		 int[] ints = {-2,1,-3,4,-1,2,1,-5,4};
		 System.out.println(solution.maxSubArray(ints));
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
    	int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			int temp =0;
			while ( j < nums.length) {
				temp = temp + nums[j];
				if (temp > max) {
					max = temp;
				}
				j++;
			}
		}
		return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
