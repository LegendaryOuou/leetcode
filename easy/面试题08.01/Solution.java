class Solution {
	/*
	执行用时：12 ms, 在所有 Java 提交中击败了98.97%的用户
	内存消耗：35.3 MB, 在所有 Java 提交中击败了74.01%的用户
	*/
    public int waysToStep(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        int a=1,b=2,c=4;
        int ans=0;
        while(n-->3){
            ans=((a+b)%1000000007+c)%1000000007;
            a=b;
            b=c;
            c=ans;
        }
        return ans;
    }
}