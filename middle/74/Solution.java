class Solution {
	/*
	这个直接暴力效果就很好啊
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.7 MB, 在所有 Java 提交中击败了83.32%的用户
	*/
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
}