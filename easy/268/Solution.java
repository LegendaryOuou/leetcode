class Solution {
	/*
	求和，减一下就好了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.8 MB, 在所有 Java 提交中击败了80.48%的用户
	*/
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int numssum=0;
        for(int num:nums){
            numssum+=num;
        }
        int sum = (len+1)*len/2;
        return sum-numssum;
    }
}