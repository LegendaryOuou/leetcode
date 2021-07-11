class Solution {
	/*
	要补补dp的知识了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.5 MB, 在所有 Java 提交中击败了95.71%的用户
	*/
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        int res1=nums[0],res2=Math.max(nums[0],nums[1]);
        int res3=Math.max(res1,res2);
        for(int i=2;i<len;i++){
            res3=Math.max(res1+nums[i],res2);
            res1=res2;
            res2=res3;
        }
        return res3;
    }
}