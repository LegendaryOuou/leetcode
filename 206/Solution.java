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
	一个一个换就完了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了90.66%的用户
	*/
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre,current,tail;
        pre=head;
        current=pre.next;
        pre.next=null;
        while(current!=null){
            tail=current.next;
            current.next=pre;
            pre=current;
            current=tail;
        }
        return pre;
    }
}