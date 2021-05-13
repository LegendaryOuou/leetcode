class Solution {
	/*
	双指针
	
	执行用时：2 ms, 在所有 Java 提交中击败了98.09%的用户
	内存消耗：46.2 MB, 在所有 Java 提交中击败了86.66%的用户
	*/
    public int[] exchange(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low<high){
            if(nums[low]%2==1) {
                low++;
                continue;
            }
            if(nums[high]%2==0) {
                high--;
                continue;
            }
            int t = nums[low];
            nums[low]=nums[high];
            nums[high]=t;
        }
        return nums;
    }
}