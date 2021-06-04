class Solution {
	/*
	程序应该是没问题的，但是超时了
	*/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            int l = Math.max(0,i-k);
            int r = Math.min(len-1,i+k);
            for(int j=l;j<=r;j++){
                if(j!=i&&nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}