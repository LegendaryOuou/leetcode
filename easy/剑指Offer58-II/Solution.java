class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了84.70%的用户
	*/
    public String reverseLeftWords(String s, int n) {
        int len=s.length();
        return s.substring(n,len)+s.substring(0,n);
    }
}