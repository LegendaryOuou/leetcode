class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了83.16%的用户
	*/
    public int findLengthOfLCIS(int[] nums) {
        int len=nums.length;
        //标记最大递增序列长度
        int max=1;
        //标记递增序列的最小值索引
        int count=1;
        for(int i=0;i<len-1;i++){
            if(nums[i]<nums[i+1]) count++;
            else{
                max=Math.max(max,count);
                count=1;
            }
        }
        return Math.max(max,count);
    }
}