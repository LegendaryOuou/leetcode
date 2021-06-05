class Solution {
	/*
	执行用时：7 ms, 在所有 Java 提交中击败了10.70%的用户
	内存消耗：42 MB, 在所有 Java 提交中击败了99.40%的用户
	*/
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        int count;
        for(int i=0;i<=n;i++){
            int m=i;
            count=0;
            for(int j=0;j<32;j++){
                if((m&1)==1) count++;
                m=m>>1;
            }
            res[i]=count;
        }
        return res;
    }
}