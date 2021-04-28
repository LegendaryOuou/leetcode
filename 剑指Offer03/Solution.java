package com.leetcode;

import java.util.*;

class Solution {
    /*
    思路一：用集合保存访问过的数字，如果集合中已经有这个数字了，说明它是重复的，直接返回

    执行用时：8 ms, 在所有 Java 提交中击败了28.03%的用户
    内存消耗：47.4 MB, 在所有 Java 提交中击败了33.66%的用户
     */
    /*
    public static int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> m=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])){
                return nums[i];
            }else{
                m.put(nums[i],0);
            }
        }
        return -1;
    }*/

    /*
    思路2：由于题目中说数组长度2-n，数组中的元素范围是0-n-1,那么就可以用这种方法
    新建一个与输入数组等容量的数组，假设名为nums1，遍历数组nums，如果数组nums1中nums[i]位置的元素值是1，说明nums[i]就是一个重复元素，直接返回；
    否则将nums1的nums[i]位置的值+1，表示这个元素已经出现过了。

    执行用时：2 ms, 在所有 Java 提交中击败了65.50%的用户
    内存消耗：46.1 MB, 在所有 Java 提交中击败了88.47%的用户
    public static int findRepeatNumber(int[] nums) {
        int[] arr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(arr[nums[i]]==1) return nums[i];
            else arr[nums[i]]+=1;
        }
        return -1;
    }
     */

    /*
    思路3：评论区一个大佬的思路，这个方法真滴巧啊
    原地置换，第i个位置的元素应该是i，如果不是应该通过交换能将这个位置的元素变成i，如果这个元素是重复元素，那么在交换的过程中就能发现，直接返回就行

    执行用时：1 ms, 在所有 Java 提交中击败了84.07%的用户
    内存消耗：46.2 MB, 在所有 Java 提交中击败了62.46%的用户
     */
    public static int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]) return nums[i];
                temp=nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }
}