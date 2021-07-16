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
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.8 MB, 在所有 Java 提交中击败了84.53%的用户
	*/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode newHead = new ListNode(-501,head);
        ListNode preTargetList = newHead;//1
        ListNode afterTargetList = head;//2
        ListNode front = newHead, tail = head;//2 4
        ListNode visit=newHead;
        int count=0;
        while(true){
            if(count==left-1){
                preTargetList=visit;
            }
            if(count==left){
                front=visit;
            }
            if(count==right){
                tail=visit;
            }
            if(count>right){
                afterTargetList=visit;
                ListNode p1=front, p2=tail;
                ListNode p=null;
                while(p1!=tail){
                    p=p1.next;
                    p1.next=tail.next;
                    tail.next=p1;
                    p1=p;
                }
                preTargetList.next=tail;
                return newHead.next;
            }
            visit=visit.next;
            count++;
        }
    }
}