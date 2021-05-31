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
	用递归最好
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36 MB, 在所有 Java 提交中击败了66.08%的用户
	*/
    int res;
    int k_;
    public int kthToLast(ListNode head, int k) {
        k_=k;
        fun(head);
        return res;
    }
    private void fun(ListNode head){
        if(head==null) return;
        fun(head.next);
        if(--k_==0) res=head.val;
    }
}