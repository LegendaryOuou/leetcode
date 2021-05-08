package com.leetcode;

import java.util.ArrayList;
import java.util.List;

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
    思路一：hashmap，太慢了

    执行用时：31 ms, 在所有 Java 提交中击败了5.65%的用户
    内存消耗：55.6 MB, 在所有 Java 提交中击败了5.00%的用户
    public boolean isPalindrome(ListNode head) {
        Map<Integer,Integer> map = new HashMap<>();
        int len=0;
        ListNode p = head;
        while(p!=null){
            map.put(len,p.val);
            len++;
            p=p.next;
        }
        for (int i = 0; i < len/2; i++) {
            if(map.get(i)!=map.get(len-1-i)) return false;
        }
        return true;
    }
     */
    /*
    官方思路一：不够快，占用内存大

    执行用时：12 ms, 在所有 Java 提交中击败了20.03%的用户
    内存消耗：57.1 MB, 在所有 Java 提交中击败了4.98%的用户
    public boolean isPalindrome(ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int size=list.size();
        int p=size-1;
        Integer[] arr = list.toArray(new Integer[size]);
        for (int i = 0; i < size/2; i++) {
            if(arr[i]!=arr[p-i]) return false;
        }
        return true;
    }
     */
    /*
    递归

    执行用时：20 ms, 在所有 Java 提交中击败了8.58%的用户
    内存消耗：55.5 MB, 在所有 Java 提交中击败了7.07%的用户
    ListNode p;
    public boolean isPalindrome(ListNode head){
        p=head;
        return check(head);
    }
    public boolean check(ListNode head){
        if (head != null) {
            if(check(head.next)==false) return false;
            else if(p.val!=head.val) return false;
            else{
                p=p.next;
            }
        }
        return true;
    }
     */
    /*
    改变输入，反转链表后半部分，记得要给后半部分第一个节点的next设置为null

    执行用时：4 ms, 在所有 Java 提交中击败了77.62%的用户
    内存消耗：48.4 MB, 在所有 Java 提交中击败了48.03%的用户
     */
    public boolean isPalindrome(ListNode head){
        ListNode p1=head;
        ListNode p2=head;
        ListNode p3;
        while(p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        p2=p1.next;
        p1.next=null;
        while(p2!=null){
            p3=p2.next;
            p2.next=p1;
            p1=p2;
            p2=p3;
        }
        while(p1!=null){
            if(p1.val!=head.val) return false;
            p1=p1.next;
            head=head.next;
        }
        return true;
    }

}