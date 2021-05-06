package com.leetcode;

class Solution {
    /*
    暴力，效果不太好

    执行用时：606 ms, 在所有 Java 提交中击败了5.03%的用户
    内存消耗：39.8 MB, 在所有 Java 提交中击败了56.67%的用户
    public int[] getLeastNumbers(int[] arr, int k) {
        for(int i=0;i<k;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
    }
     */
    /*
    小小的改进，好了一点

    执行用时：60 ms, 在所有 Java 提交中击败了8.83%的用户
    内存消耗：39.4 MB, 在所有 Java 提交中击败了96.49%的用户
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0) return new int[0];
        int[] res = new int[k];
        int maxPoint=0;
        for(int i=0;i<k;i++){
            res[i]=arr[i];
            if(arr[i]>arr[maxPoint]) maxPoint=i;
        }
        for(int i=0;i<arr.length-k;i++){
            if(arr[i+k]<res[maxPoint]){
                res[maxPoint]=arr[i+k];
                for(int j=0;j<k;j++){
                    if(res[j]>res[maxPoint]) maxPoint=j;
                }
            }
        }
        return res;
    }
}