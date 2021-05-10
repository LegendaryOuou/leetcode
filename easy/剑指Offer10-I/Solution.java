class Solution {
	/*
	dp
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.3 MB, 在所有 Java 提交中击败了35.96%的用户
	*/
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        for (int i = 2; i < n+1; i++) {
            f[i]=f[i-1]+f[i-2];
            f[i]=f[i]>1000000007?f[i]-1000000007:f[i];
        }
        return f[n];
    }
}