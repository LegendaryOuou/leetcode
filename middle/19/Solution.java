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
	/*
	直接遍历
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.2 MB, 在所有 Java 提交中击败了88.31%的用户
	*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int len=0;
        while(p!=null){
            len++;
            p=p.next;
        }
        if(len==n) return head.next;
        p=head;
        for(int i=0;i<len-n-1;i++){
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}