class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.8 MB, 在所有 Java 提交中击败了60.11%的用户
	*/
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        int len=nums.length;
        return len*(len+1)/2-sum;
    }
}