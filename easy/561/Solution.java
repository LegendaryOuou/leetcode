class Solution {
	/*
	执行用时：13 ms, 在所有 Java 提交中击败了97.99%的用户
	内存消耗：40.6 MB, 在所有 Java 提交中击败了62.78%的用户
	*/
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}