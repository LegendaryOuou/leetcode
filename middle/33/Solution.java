class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了94.00%的用户
	*/
    public int search(int[] nums, int target) {
        int len=nums.length;
        if(target<nums[0]){
            for(int i=len-1;i>=0;i--){
                if(nums[i]==target) return i;
                else if(nums[i]<target) return -1;
            }
        }else{
            for(int i=0;i<len;i++){
                if(nums[i]==target) return i;
                else if(nums[i]>target) return -1;
            }
        }
        return -1;
    }
}