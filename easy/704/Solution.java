class Solution {
	/*
	二分查找，题目要求的
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39.4 MB, 在所有 Java 提交中击败了57.17%的用户
	*/
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}