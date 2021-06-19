class Solution {
	/*
	错位比较
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了74.37%的用户
	*/
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        for(int row=0;row<m-1;row++){
            for(int col=0;col<n-1;col++){
                if(matrix[row][col]!=matrix[row+1][col+1]) return false;
            }
        }
        return true;
    }
}