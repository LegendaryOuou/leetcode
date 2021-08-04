class Solution {
	/*
	执行用时：980 ms, 在所有 Java 提交中击败了17.17%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了25.17%的用户
	*/
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                int min = Math.abs(nums[i]-nums[j]);
                int max = nums[i]+nums[j];
                for(int k=j+1;k<len;k++){
                    if(nums[k]>=max) break;
                    else{
                        if(nums[k]>min) ans++;
                    }
                }
            }
        }
        return ans;
    }
}