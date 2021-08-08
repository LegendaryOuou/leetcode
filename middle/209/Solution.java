class Solution {
	/*
	执行用时：111 ms, 在所有 Java 提交中击败了15.19%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了20.45%的用户
	*/
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int ans=100001;
        for(int i=len-1;i>=0;i--){
            int sum=nums[i];
            if(sum>=target) return 1;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
                if(sum>=target) {
                    ans=Math.min(ans,i-j+1);
                    break;
                }
            }
        }
        return ans==100001?0:ans;
    }
}