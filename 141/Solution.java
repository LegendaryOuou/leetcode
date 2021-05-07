package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /*
    一种思路，太慢了

    执行用时：195 ms, 在所有 Java 提交中击败了10.42%的用户
    内存消耗：39.2 MB, 在所有 Java 提交中击败了78.21%的用户
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head!=null){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)==head) return true;
            }
            list.add(head);
            head=head.next;
        }
        return false;
    }
     */
    /*
    第一种思路的一丝丝改进，比第一种方法快了不少，但排名还是不太行啊

    执行用时：5 ms, 在所有 Java 提交中击败了18.74%的用户
    内存消耗：38.9 MB, 在所有 Java 提交中击败了92.62%的用户
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head!=null){
            if(!set.add(head)) return true;
            head=head.next;
        }
        return false;
    }
     */
    /*
    双指针，这个牛了

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：39.3 MB, 在所有 Java 提交中击败了72.61%的用户
     */
    public boolean hasCycle(ListNode head){
        if(head==null||head.next==null) return false;
        ListNode slow=head,fast=head.next;
        while(fast!=slow){
            if(fast==null||fast.next==null) return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}