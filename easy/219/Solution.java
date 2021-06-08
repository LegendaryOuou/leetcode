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
	/*
	直接暴力就可以了
	
	执行用时：1503 ms, 在所有 Java 提交中击败了18.39%的用户
	内存消耗：40.3 MB, 在所有 Java 提交中击败了99.95%的用户
	*/
	class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]&&j-i<=k){
                    return true;
                }
            }
        }
        return false;
    }
	/*
	官方：哈希表滑动窗口
	*/
}