class Solution {
	/*递归会超时*/
    public int tribonacci(int n) {
        if(n==0) return 0;
        else if(n==1||n==2) return 1;
        else return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了63.12%的用户
	*/
	public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        int n1=0,n2=1,n3=1;
        int res=0;
        for(int i=0;i<n-2;i++){
            res=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=res;
        }
        return res;
    }
}