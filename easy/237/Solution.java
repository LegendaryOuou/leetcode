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
	既然不能干掉自己，就把自己变成别人，然后干掉他
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了27.90%的用户
	*/
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}