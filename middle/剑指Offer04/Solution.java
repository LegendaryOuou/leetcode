class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：43.7 MB, 在所有 Java 提交中击败了96.61%的用户
	*/
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n= matrix.length;
        if(n==0) return false;
        int m= matrix[0].length;
        if(m==0) return false;
        for (int i = 0; i<m; i++) {
            if(target>=matrix[0][i]&&target<=matrix[n-1][i]){
                for (int j = 0; j < n; j++) {
                    if(matrix[j][i]==target) return true;
                }
            }
        }

        return false;
    }
}