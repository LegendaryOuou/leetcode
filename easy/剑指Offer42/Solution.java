class Solution {
	/*
	这个牛逼大了！！
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：44.1 MB, 在所有 Java 提交中击败了99.87%的用户
	*/
    public int maxSubArray(int[] nums) {
        int pre = 0, max = nums[0];
        for(int item : nums){
            pre = Math.max(pre+item,item);
            if(pre>max) max=pre;
        }
        return max;
    }
}