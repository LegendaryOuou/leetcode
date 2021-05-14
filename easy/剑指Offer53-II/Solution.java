class Solution {
	/*
	逐个遍历搜索
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了87.54%的用户
    public int missingNumber(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=i) return i;
        }
        return nums[len-1]+1;
    }
	*/
	/*
	二分
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了99.86%的用户
	*/
	public int missingNumber(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==mid) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}