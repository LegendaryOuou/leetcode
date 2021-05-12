/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	/*
	快慢指针，快指针每次向前移动两个位置，慢指针每次移动一个
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.7 MB, 在所有 Java 提交中击败了56.74%的用户
	*/
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}