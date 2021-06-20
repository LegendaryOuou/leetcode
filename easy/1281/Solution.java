class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.3 MB, 在所有 Java 提交中击败了45.67%的用户
	*/
    public int subtractProductAndSum(int n) {
        int multi=1,sum=0;
        while(n!=0){
            multi*=n%10;
            sum+=n%10;
            n/=10;
        }
        return multi-sum;
    }
}