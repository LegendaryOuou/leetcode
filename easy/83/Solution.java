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
	正常思路，遍历去重即可
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.6 MB, 在所有 Java 提交中击败了92.87%的用户
	
	时间复杂度：需要遍历一次链表，O(n)
	空间复杂度：需要几个ListNode变量存贮节点信息，O(1)
	*/
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode front=head;
        ListNode behind=head.next;
        while(behind!=null){
            if(behind.val!=front.val) {
                front.next=behind;
                front=behind;
            }
            else behind=behind.next;
        }
        front.next=null;
        return head;
    }
}