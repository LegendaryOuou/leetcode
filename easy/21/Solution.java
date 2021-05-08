package com.leetcode;

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
    直接换

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：37.5 MB, 在所有 Java 提交中击败了97.02%的用户
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode root,p;
        ListNode list1=l1,list2=l2;
        if(list1.val<list2.val) {
            p=list1;
            list1=list1.next;
        }
        else {
            p=list2;
            list2=list2.next;
        }
        root=p;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
                p=p.next;
            }
            else{
                p.next=list2;
                list2=list2.next;
                p=p.next;
            }
        }
        if(list1==null){
            p.next=list2;
        }
        else{
            p.next=list1;
        }
        return root;
    }
}