class Solution {
	/*
	执行用时：4 ms, 在所有 Java 提交中击败了5.23%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了86.50%的用户
	*/
    public int[] shuffle(int[] nums, int n) {
        int left=1;
        int step=n-1;
        while(step>0){
            for(int i=left;i<n;i++){
                int t=nums[i];
                nums[i]=nums[i+step];
                nums[i+step]=t;
            }
            left++;
            step--;
        }
        return nums;
    }
}