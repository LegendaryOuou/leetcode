class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35 MB, 在所有 Java 提交中击败了81.39%的用户
	*/
    public int xorOperation(int n, int start) {
        int res=0;
        for(int i=0;i<n;i++){
            res=res^(start+2*i);
        }
        return res;
    }
}