class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了35.09%的用户
	内存消耗：48.5 MB, 在所有 Java 提交中击败了53.93%的用户
	*/
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        double sum=0;
        if(len==k){
            for(int num:nums) sum+=num;
            return sum/k;
        }
        for(int i=0;i<k;i++) sum+=nums[i];
        sum=sum-nums[k-1];
        double[] res = new double[len-k+1];
        for(int i=k-1;i<len;i++){
            int pre=0;
            if(i-k>=0) pre=nums[i-k];
            sum=sum-pre+nums[i];
            res[i-k+1]=sum;
        }
        int max=0;
        for(int i=0;i<len-k+1;i++){
            if(res[i]>res[max]) max=i;
        }
        return res[max]/k;
    }
}