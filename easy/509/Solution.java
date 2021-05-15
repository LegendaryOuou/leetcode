class Solution {
	/*
	dp
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：34.9 MB, 在所有 Java 提交中击败了96.45%的用户
	*/
    public int fib(int n) {
        if(n<2) return n;
        int n1=0,n2=1,n3=0;
        for(int i=0;i<n-1;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
}