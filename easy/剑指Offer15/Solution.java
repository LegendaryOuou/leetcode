public class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了96.60%的用户
	内存消耗：35.3 MB, 在所有 Java 提交中击败了58.75%的用户
	
	怎么它成了每日一题，同样的代码，资源消耗变小了？
	执行用时：1 ms, 在所有 Java 提交中击败了96.63%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了82.98%的用户
	*/
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            if((n&1)==1) count++;
            n=n>>1;
        }
        return count;
    }
}