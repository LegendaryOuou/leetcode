class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.9 MB, 在所有 Java 提交中击败了46.68%的用户
	*/
    public int findMagicIndex(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==i) return i;
        }
        return -1;
    }
}