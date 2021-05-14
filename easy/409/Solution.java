package com.leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    这个结果只和s中字符个数为奇数的字符数相关。只用统计每个字符出现的次数，找到出现次数为奇数次的字符个数n，
    将字符串s长度减去n，如果n为偶数且不为0的话，需要考虑一种情况就是出现奇数次的字符可以放在中间

    执行用时：11 ms, 在所有 Java 提交中击败了10.85%的用户
    内存消耗：36.5 MB, 在所有 Java 提交中击败了93.77%的用户
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                int num = map.get(ch);
                map.put(ch, num + 1);
            }else{
                map.put(ch,1);
            }
        }
        int count=0;
        for(Integer value : map.values()){
            if(value%2==1){
                count+=1;
            }
        }
        int res=s.length()-count;
        if(res<s.length()&&res%2==0) res+=1;
        return res;
    }
     */
    /*
    大佬写的，自叹不如

    执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了80.11%的用户
     */
    public static int longestPalindrome(String s) {
        int[] cnt = new int[58];
        for (char c : s.toCharArray()) {
            cnt[c - 'A'] += 1;
        }

        int ans = 0;
        for (int x: cnt) {
            // 字符出现的次数最多用偶数次。
            ans += x - (x & 1);
        }
        // 如果最终的长度小于原字符串的长度，说明里面某个字符出现了奇数次，那么那个字符可以放在回文串的中间，所以额外再加一。
        return ans < s.length() ? ans + 1 : ans;
    }

    public static void main(String[] args) {
        System.out.println(7&1);
    }
}