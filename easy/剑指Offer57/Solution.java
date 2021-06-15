class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了95.45%的用户
	内存消耗：54.7 MB, 在所有 Java 提交中击败了97.52%的用户
	*/
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int left=0,right=nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                res[0]=nums[left];
                res[1]=nums[right];
                break;
            }else if(sum<target) left++;
            else right--;
        }
        return res;
    }
}