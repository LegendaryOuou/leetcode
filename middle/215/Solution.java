class Solution {
	/*
	执行用时：30 ms, 在所有 Java 提交中击败了12.51%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了86.10%的用户
	*/
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int point=-1;
        for(int i=0;i<k;i++){
            point=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]>nums[point]) point=j;
            }
            if(i<k-1) nums[point]=nums[i];
        }
        return nums[point];
    }
}