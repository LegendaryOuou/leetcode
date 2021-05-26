package com.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
     暴力

     执行用时：48 ms, 在所有 Java 提交中击败了9.13%的用户
     内存消耗：39 MB, 在所有 Java 提交中击败了44.04%的用户
    public int firstUniqChar(String s) {
        int len = s.length();
        for(int i=0;i<len;i++){
            int j;
            for(j=0;j<len;j++){
                if(j==i) continue;
                if(s.charAt(i)==s.charAt(j)) break;
            }
            if(j==len) return i;
        }
        return -1;
    }
     */
    /*
    哈希map

    执行用时：37 ms, 在所有 Java 提交中击败了27.94%的用户
    内存消耗：39.1 MB, 在所有 Java 提交中击败了39.00%的用户
    public int firstUniqChar(String s) {
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        for(int i=0;i<len;i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
     */
    /*
    用数组替换map

    执行用时：5 ms, 在所有 Java 提交中击败了94.04%的用户
    内存消耗：39 MB, 在所有 Java 提交中击败了45.44%的用户
     */
    public int firstUniqChar(String s) {
        int len=s.length();
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[(int)(ch)-97]+=1;
        }
        for(int i=0;i<len;i++){
            if(arr[(int)(s.charAt(i))-97]==1) return i;
        }
        return -1;
    }
}