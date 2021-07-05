class Solution {
	/*
	暴力必然超时，这个比暴力稍稍好了一点点
	
	执行用时：644 ms, 在所有 Java 提交中击败了5.37%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了88.99%的用户
	*/
    public int largestPerimeter(int[] nums) {
        int len=nums.length;
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            int left=i+1,right=len-1;
            int num=nums[i];
            while(left<right){
                if(nums[left]+nums[right]<=num)left++;
                else if(nums[right]-nums[left]>=num)right--;
                else{
                    max=Math.max(max,nums[left]+nums[right]+num);
                    left++;
                    right--;
                }
            }
        }
        return max;
    }
}