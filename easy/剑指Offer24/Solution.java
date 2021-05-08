package com.leetcode;

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
    直接换

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了56.27%的用户
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode p,q,r;
        p=head;
        q=head.next;
        p.next=null;
        while(q!=null){
            r=q.next;
            q.next=p;
            p=q;
            q=r;
        }
        return p;
    }
     */
    /*
    递归
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了20.52%的用户
     */
    ListNode p,root;
    public ListNode reverseList(ListNode head) {
        reverse(head);
        return root;
    }
    public void reverse(ListNode head){
        if(head!=null){
            reverse(head.next);
            if(head.next==null) {
                p=head;
                root=head;
            }
            else{
                p.next=head;
                p=p.next;
                p.next=null;
            }
        }
    }
}