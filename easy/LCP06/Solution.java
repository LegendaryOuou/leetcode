class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了74.84%的用户
	*/
    public int minCount(int[] coins) {
        int sum=0;
        for(int num:coins){
            sum+=num/2+num%2;
        }
        return sum;
    }
}