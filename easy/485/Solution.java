class Solution {
	/*
	一次遍历
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39.7 MB, 在所有 Java 提交中击败了92.38%的用户
	*/
    public int findMaxConsecutiveOnes(int[] nums) {
        int point=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int res = i-point;
                max=res>max?res:max;
                point=i+1;
            }
        }
        return max>nums.length-point?max:nums.length-point;
    }
}