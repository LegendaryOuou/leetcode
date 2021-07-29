class Solution {
	/*
	暴力
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.7 MB, 在所有 Java 提交中击败了72.95%的用户
	*/
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num:nums) min=Math.min(min,num);
        return min;
    }
	/*
	二分法
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.7 MB, 在所有 Java 提交中击败了77.94%的用户
	*/
	public int findMin(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        while(left<right){
            int mid=(right-left)/2+left;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return nums[right];
    }
}