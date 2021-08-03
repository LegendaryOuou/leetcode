class Solution {
	/*
	执行用时：6 ms, 在所有 Java 提交中击败了60.08%的用户
	内存消耗：39.9 MB, 在所有 Java 提交中击败了29.91%的用户
	*/
    public int findUnsortedSubarray(int[] nums) {
        int len=nums.length;
        int[] copyOf = Arrays.copyOf(nums, len);
        Arrays.sort(copyOf);
        int start=0,end=len-1;
        while(start<end){
            if(nums[start]==copyOf[start]) start++;
            else if(nums[end]==copyOf[end]) end--;
            else break;
        }
        return start==end?0:end-start+1;

    }
}