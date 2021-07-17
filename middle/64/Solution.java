class Solution {
	/*
	执行用时：3 ms, 在所有 Java 提交中击败了83.78%的用户
	内存消耗：41.1 MB, 在所有 Java 提交中击败了62.17%的用户
	*/
    public int minPathSum(int[][] grid) {
        int len1=grid.length,len2=grid[0].length;
        int startRow=0;
        int startCol=0;
        while(true){
            int row=startRow;
            int col=startCol;
            while(row>=0&&row<len1&&col>=0&&col<len2){
                if(row==0){
                    if(col>0){
                        grid[row][col]+=grid[row][col-1];
                    }
                }else if(col==0){
                    if(row>0){
                        grid[row][col]+=grid[row-1][col];
                    }
                }else{
                    grid[row][col]+=Math.min(grid[row-1][col],grid[row][col-1]);
                }
                row++;
                col--;
            }
            if(startRow==len1-1&&startCol==len2-1){
                break;
            }else{
                if(startCol==len2-1){
                    startRow+=1;
                }else{
                    startCol+=1;
                }
            }
        }
        return grid[len1-1][len2-1];
    }
}