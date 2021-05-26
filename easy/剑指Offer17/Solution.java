class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了99.98%的用户
	内存消耗：46.6 MB, 在所有 Java 提交中击败了63.57%的用户
	*/
    public int[] printNumbers(int n) {
        int len = (int)(Math.pow(10,n))-1;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            res[i]=i+1;
        }
        return res;
    }
}