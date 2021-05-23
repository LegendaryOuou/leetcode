class Solution {
	/*
	这个没啥说的，直接加就好了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了98.51%的用户
	*/
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}