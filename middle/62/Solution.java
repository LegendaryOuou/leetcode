class Solution {
	/*
	标准dp，但是超时了
	*/
    public int uniquePaths(int m, int n) {
        if(m==1&&n==1) return 1;
        else if(m==1) return uniquePaths(m,n-1);
        else if(n==1) return uniquePaths(m-1,n);
        else return uniquePaths(m-1,n)+uniquePaths(m,n-1);
    }
	/*
	数组形式
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.4 MB, 在所有 Java 提交中击败了21.14%的用户
	*/
	public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        arr[0][0]=1;
        for(int col=0;col<n;col++){
            for(int row=0;row<m;row++){
                if(row>0){
                    arr[row][col]+=arr[row-1][col];
                }
                if(col>0){
                    arr[row][col]+=arr[row][col-1];
                }
            }
        }
        return arr[m-1][n-1];
    }
}