class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100%的用户
	内存消耗：39.3 MB, 在所有 Java 提交中击败了72.93%的用户
	*/
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length,col=mat[0].length;
        if(r*c!=row*col) return mat;
        int[][] res = new int[r][c];
        int m=0,n=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=mat[m][n];
                n+=1;
                if(n==col){
                    m+=1;
                    n=0;
                }
            }
        }
        return res;
    }
}