package com.leetcode;

class Solution {
    /*
    判断就行了

    执行用时：2 ms, 在所有 Java 提交中击败了99.84%的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了82.05%的用户
     */
    public static boolean isPalindrome(String s) {
        int len=s.length();
        int low=0;
        int high=len-1;
        while(low<high){
            byte chLow = (byte)s.charAt(low);
            byte chHigh = (byte)s.charAt(high);

            if(((chLow>=65&&chLow<=90)||(chLow>=97&&chLow<=122)||(chLow>=48&&chLow<=57))==false){
                low++;
                continue;
            }
            if(((chHigh>=65&&chHigh<=90)||(chHigh>=97&&chHigh<=122)||(chHigh>=48&&chHigh<=57))==false){
                high--;
                continue;
            }
            if(chHigh==chLow) {
                low++;
                high--;
            }else if(((chHigh>=65&&chHigh<=90)||(chHigh>=97&&chHigh<=122))&&((chLow>=65&&chLow<=90)||(chLow>=97&&chLow<=122))&&((chHigh==chLow-32)||(chLow==chHigh-32))) {
                low++;
                high--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}