class Solution {
	/*
	为什么双指针比别人慢这么多？？
	
	执行用时：1 ms, 在所有 Java 提交中击败了14.17%的用户
	内存消耗：41.7 MB, 在所有 Java 提交中击败了54.09%的用户
	*/
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[]{-1,-1};
        int low = 0, high = nums.length-1;
        while(low<=high){
            if(nums[low]!=target){
                low++;
            }else if(nums[high]!=target){
                high--;
            }else{
                arr[0]=low;
                arr[1]=high;
                break;
            }
        }
        return arr;
    }
}