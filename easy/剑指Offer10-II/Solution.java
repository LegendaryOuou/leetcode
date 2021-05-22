class Solution {
	/*
	动态规划啊，老题了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：34.8 MB, 在所有 Java 提交中击败了99.38%的用户
	*/
    public int numWays(int n) {
        if(n==0) return 1;
        if(n<3) return n;
        int n1=1,n2=2;
        int n3;

        for(int i=2;i<n;i++){
            n3=(n1+n2)%1000000007;
			if(n>43) n3%=1000000007;
            n1=n2;
            n2=n3;
        }
        return n2;
    }
}