class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了75.19%的用户
	内存消耗：42.1 MB, 在所有 Java 提交中击败了71.79%的用户
	*/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}