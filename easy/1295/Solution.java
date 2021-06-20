class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了99.67%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了67.76%的用户
	*/
    public int findNumbers(int[] nums) {
        int count =0;
        int step;
        for(int num:nums){
            step=0;
            while(num!=0){
                num/=10;
                step++;
                if((step&1)==0&&num==0) count++;
            }
        }
        return count;
    }
}