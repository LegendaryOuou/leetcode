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
	先把首尾串起来，然后找到需要返回的节点，把它的上一个节点的next设为空，返回这个节点就行
	再优化优化可以实现一次遍历就能实现，但是懒得改了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了92.43%的用户
	*/
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode v = head;
        int n=1;
        while(v.next!=null){
            v=v.next;
            n++;
        }
        v.next=head;
        int count=n-k%n;
        //System.out.println(n);
        while(--count>0){
            head=head.next;
        }
        v=head.next;
        head.next=null;
        return v;
    }
}