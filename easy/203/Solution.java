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
	一次遍历
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.79%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了96.69%的用户
	*/
    public ListNode removeElements(ListNode head, int val) {
        ListNode p1=null,p2=head,root;
        while(p2!=null){
            if(p2.val==val) p2=p2.next;
            else break;
        }
        if(p2==null) return p2;
        p1=p2;
        root=p2;
        p2=p2.next;
        while(p2!=null){
            if(p2.val==val) p1.next=p2.next;
            else p1=p2;
            p2=p2.next;
        }
        return root;
    }
}