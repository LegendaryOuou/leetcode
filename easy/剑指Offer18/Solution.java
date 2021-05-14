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
	直接找
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.4 MB, 在所有 Java 提交中击败了99.14%的用户
	*/
    public ListNode deleteNode(ListNode head, int val) {
        if(head!=null&&head.val==val) return head.next;
        ListNode root=head,p=null;
        while(root!=null){
            if(root.val==val){
                p.next=root.next;
                break;
            }
            p=root;
            root=root.next;
        }
        return head;
    }
}