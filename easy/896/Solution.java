class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：46 MB, 在所有 Java 提交中击败了95.50%的用户
	*/
    public boolean isMonotonic(int[] nums) {
        int len=nums.length;
        int isPositive=-1;
        for(int i=0;i<len-1;i++){
            if(nums[i]==nums[i+1]) continue;
            else if(nums[i]<nums[i+1]) {
                if(isPositive==-1) isPositive=0;
                else if(isPositive==1) return false;
            }
            else if(nums[i]>nums[i+1]) {
                if(isPositive==-1) isPositive=1;
                else if(isPositive==0) return false;
            }
        }
        return true;
    }
}