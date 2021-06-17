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
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了95.55%的用户
	*/
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}