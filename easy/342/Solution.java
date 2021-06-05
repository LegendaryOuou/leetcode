class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了98.00%的用户
	*/
    public boolean isPowerOfFour(int n) {
        int count1=0,count2=0;
        for(int i=0;i<16;i++){
            if((n&1)==1) count1++;
            if((n&2)==2) count2++;
            n=n>>2;
        }
        return count1==1&&count2==0;
    }
}