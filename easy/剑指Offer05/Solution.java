package com.leetcode;

class Solution {
    /*
    直接StringBuilder

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36.3 MB, 在所有 Java 提交中击败了66.85%的用户
     */
    public String replaceSpace(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' ') str.append("%20");
            else str.append(ch);
        }
        return str.toString();
    }
}