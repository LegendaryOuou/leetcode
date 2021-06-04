class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了58.43%的用户
	内存消耗：40 MB, 在所有 Java 提交中击败了88.06%的用户
	*/
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}