class Solution {
	/*
	执行用时：6 ms, 在所有 Java 提交中击败了44.29%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了39.69%的用户
	*/
    public int arrangeCoins(int n) {
        int ans=1;
        while(n>0){
            ans++;
            n-=ans;
        }
        return ans-1;
    }
}