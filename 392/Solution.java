package com.leetcode;

class Solution {
    /*
    直接做，有点像贪心算法那味，看到合适的就配对

    执行用时：1 ms, 在所有 Java 提交中击败了81.21%的用户
    内存消耗：36 MB, 在所有 Java 提交中击败了99.00%的用户
     */
    public boolean isSubsequence(String s, String t) {
        int slen = s.length(),tlen = t.length();
        if(slen==0) return true;
        int spoint=0,tpoint=0;
        while(spoint<slen&&tpoint<tlen){
            if(s.charAt(spoint)==t.charAt(tpoint)){
                spoint++;
                tpoint++;
            }else tpoint++;
            if(spoint==slen) return true;
        }
        return false;
    }
}