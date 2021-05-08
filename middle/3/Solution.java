package com.leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    /*
    快慢指针

    执行用时：3 ms, 在所有 Java 提交中击败了94.47%的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了97.92%的用户
    public static int lengthOfLongestSubstring(String s) {
        int left=0,right=1,len=s.length();
        if(len==1||len==0) return len==1?1:0;
        int maxLen = 0;
        while(right<len){
            int i;
            for (i = left; i < right; i++) {
                if(s.charAt(i)==s.charAt(right)){
                    if(maxLen<right-left) maxLen=right-left;
                    left=i+1;
                    break;
                }
            }
            right++;
        }
        return maxLen>right-left?maxLen:right-left;
    }
     */
    /*
    这个应该是可以递归的
    没啥问题，但是运行这个样例的时候会超时"apzivnhwqapyttsmaboaqhcqn"

     */
    public static int lengthOfLongestSubstring(String s) {
        return maxLengthOfSubstring(s,0,s.length());
    }
    private static int maxLengthOfSubstring(String s,int left,int right){
        if(left==right) return 0;
        Set<Character> set = new HashSet<>();
        for (int i = left; i < right; i++) {
            set.add(s.charAt(i));
        }
        if(set.size()==right-left) return right-left;
        else {
            int leftMax = maxLengthOfSubstring(s, left, right - 1);
            int rightMax = maxLengthOfSubstring(s, left + 1, right);
            return leftMax > rightMax ? leftMax : rightMax;
        }
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }
}