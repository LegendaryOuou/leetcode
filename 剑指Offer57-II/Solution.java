package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    执行用时：5 ms, 在所有 Java 提交中击败了31.51%的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了96.83%的用户
     */
    public static int[][] findContinuousSequence(int target) {
        List<int[]> list = new ArrayList<int[]>();
        for (int i = 1; i <= target/2; i++) {
            int sum=0;
            int low=-1,high=-1;
            for (int j = i; ; j++) {
                sum+=j;
                if(sum==target){
                    low=i;
                    high=j;
                    int[] res=new int[high-low+1];
                    for (int k = low; k <= high; k++) {
                        res[k-low]=k;
                    }
                    list.add(res);
                    break;
                }
                if(sum>target) break;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] res = findContinuousSequence(9);
        for(int[] arr : res){
            for(int item:arr){
                System.out.print(item+",");
            }
            System.out.println();
        }
    }
}