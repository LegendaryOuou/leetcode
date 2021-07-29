class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了49.88%的用户
	内存消耗：38.9 MB, 在所有 Java 提交中击败了52.49%的用户
	*/
    public int jump(int[] nums) {
        int len = nums.length;
        // if(len==1) return 0;
        int ans=0;
        int start=0;
        int stepLength=0;
        while(true){
            if(stepLength>=len-1) return ans;
            int maxLength=0;
            int maxIndex=-1;
            for(int i=start;i<=Math.min(nums[start]+start,len-1);i++){
                if(nums[i]+i>maxLength){
                    maxLength=nums[i]+i;
                    maxIndex=i;
                }
            }
            stepLength=nums[start]+start;
            start=maxIndex;
            ans++;
        }
    }
}