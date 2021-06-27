class Solution {
	/*
	为什么内存开销这么大呢？
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39.4 MB, 在所有 Java 提交中击败了21.36%的用户
	*/
    public int[] sortArrayByParity(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            if((nums[left]&1)==0)left++;
            else if((nums[right]&1)==1) right--;
            else{
                int t=nums[left];
                nums[left]=nums[right];
                nums[right]=t;
                left++;
                right--;
            }
        }
        return nums;
    }
}