class Solution {
	/*
	不是原地转换的
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了81.57%的用户
	*/
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int[][] ans = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                ans[i][j]=matrix[len-1-j][i];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}