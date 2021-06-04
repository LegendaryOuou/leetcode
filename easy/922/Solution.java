class Solution {
	/*
	暴力
	
	执行用时：4 ms, 在所有 Java 提交中击败了32.19%的用户
	内存消耗：39.4 MB, 在所有 Java 提交中击败了91.05%的用户
	*/
    public int[] sortArrayByParityII(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            if((nums[i]&1)!=(i&1)){
                for(int j=i+1;j<len;j++){
                    if((nums[j]&1)==(i&1)){
                        int t = nums[j];
                        nums[j]=nums[i];
                        nums[i]=t;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}