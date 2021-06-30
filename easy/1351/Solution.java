class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了42.18%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了96.89%的用户
	*/
    public int countNegatives(int[][] grid) {
        int sum=0;
        int row=grid.length,col=grid[0].length;
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(grid[i][j]<0) sum++;
                else break;
            }
        }
        return sum;
    }
}