package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    内存勉勉强强，速度太慢

    执行用时：7 ms, 在所有 Java 提交中击败了6.24%的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了65.87%的用户
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(0,head.val);
            head=head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
     */
    /*
    这种方法还行

    果然还是要看第一思路

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了58.19%的用户
     */
    public int[] reversePrint(ListNode head) {
        ListNode p=head;
        int len=0;
        while(p!=null){
            len++;
            p=p.next;
        }
        int[] arr = new int[len];
        p=head;
        for (int i = len-1; i >= 0; i--) {
            arr[i]=p.val;
            p=p.next;
        }
        return arr;
    }
}