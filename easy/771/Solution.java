package com.leetcode;

class Solution {
    /*
    8太行

    执行用时：9 ms, 在所有 Java 提交中击败了5.21%的用户
    内存消耗：38.4 MB, 在所有 Java 提交中击败了6.46%的用户
    public static int numJewelsInStones(String jewels, String stones) {
        int len = stones.length();
        for(int i=0;i<jewels.length();i++){
            stones = stones.replaceAll(jewels.substring(i,i+1),"");
        }
        return len-stones.length();
    }
     */

    /*
    没想到暴力更快

    执行用时：1 ms, 在所有 Java 提交中击败了97.69%的用户
    内存消耗：36.7 MB, 在所有 Java 提交中击败了80.31%的用户
     */
    public static int numJewelsInStones(String jewels, String stones) {
        int len = 0;
        for(char jewel:jewels.toCharArray()){
            for(char stone:stones.toCharArray()){
                if(jewel==stone) len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}