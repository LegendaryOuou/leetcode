class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.5 MB, 在所有 Java 提交中击败了71.60%的用户
	*/
    public int sumNums(int n) {
        boolean flag = n>0&&(n+=sumNums(n-1))>0;
        return n;
    }
}