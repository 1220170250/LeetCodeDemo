//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 2441 👎 0


package leetcode.editor.cn;

/**
 * 合并两个有序链表
 * @author qinkai
 * @date 2022-05-19 10:55:59
 */
public class P21_MergeTwoSortedLists{
	 public static void main(String[] args) {
		 P21_MergeTwoSortedLists p = new P21_MergeTwoSortedLists();
	 	 //测试代码
	 	 Solution solution = p.new Solution();
		 ListNode listNode5 = p.new ListNode(8);
		 ListNode listNode4 = p.new ListNode(5, listNode5);
		 ListNode listNode3 = p.new ListNode(4, listNode4);

		 ListNode listNode2 = p.new ListNode(2, listNode3);
		 ListNode listNode1 = p.new ListNode(1, listNode2);

		 ListNode listNode9 = p.new ListNode(8);
		 ListNode listNode8 = p.new ListNode(6, listNode9);
		 ListNode listNode7 = p.new ListNode(3, listNode8);

		 ListNode listNode6 = p.new ListNode(1, listNode7);


		 ListNode listNode = solution.mergeTwoLists(listNode1, listNode6);
		 while (listNode!=null){
			 System.out.print(listNode.val);
			 listNode=listNode.next;
		 }
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		//遍历链表，判断小的
		ListNode n_list = new ListNode(-1);

		ListNode index = n_list;
		while (list1 != null && list2 != null) {
			int temp = 0;
			if (list1.val > list2.val) {
				temp = list2.val;
				list2 = list2.next;
			} else {
				temp = list1.val;
				list1 = list1.next;
			}
			index.next = new ListNode(temp);
			index = index.next;
		}

		if (list1 != null) {
			index.next = list1;
		} else {
			index.next = list2;
		}
		return n_list.next;
	}

	//通过递归解决
	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists2(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists2(l1, l2.next);
			return l2;
		}
	}

}

	 class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
//leetcode submit region end(Prohibit modification and deletion)

}
