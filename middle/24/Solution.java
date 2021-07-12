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
	交换节点，自己想的，怪自豪的嘿嘿
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.8 MB, 在所有 Java 提交中击败了91.35%的用户
	*/
    public ListNode swapPairs(ListNode head) {
        ListNode pre = null;
        ListNode middle = head;
        ListNode tail=null;
        while(middle!=null&&middle.next!=null){
            if(pre==null) {
                head=middle.next;
                tail = middle.next;
                middle.next=tail.next;
                tail.next=middle;
                pre=middle;
                middle=middle.next;
            }else{
                tail=middle.next;
                if(tail!=null){
                    middle.next=tail.next;
                    tail.next=middle;
                    pre.next=tail;
                    pre=middle;
                    middle=middle.next;
                }
            }
        }
        return head;
    }
}