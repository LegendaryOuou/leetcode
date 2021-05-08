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
    直接算
    执行用时：21 ms, 在所有 Java 提交中击败了7.24%的用户
    内存消耗：35.6 MB, 在所有 Java 提交中击败了44.51%的用户
    public static int mySqrt(int x) {
        for(int i=0;i<46341;i++){
            if(i*i>x) return i-1;
        }
        return 46340;
    }
     */
    /*
    这种算术题大概旅游纯数学方法，还真被我发现了，牛顿法

    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了83.23%的用户
     */
    public static int mySqrt(int x) {
        double k=1.0;
        while (Math.abs(k * k - x) > 0.5) {
            k = (k + x / k) / 2;
        }
        return (int)k;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));//46340
//        System.out.println(mySqrt(4));
        System.out.println(Integer.MAX_VALUE);
    }
}