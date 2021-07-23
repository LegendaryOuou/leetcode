class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.8 MB, 在所有 Java 提交中击败了40.32%的用户
	*/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        for(int i=0;i<row;i++){
            boolean visitedObstacle=false;
            for(int j=0;j<col;j++){
                if(i==0){
                    if(visitedObstacle) obstacleGrid[0][j]=0;
                    else{
                        if(obstacleGrid[0][j]==1){
                            obstacleGrid[0][j]=0;
                            visitedObstacle=true;
                        }else{
                            obstacleGrid[0][j]=1;
                        }
                    }
                }else{
                    if(obstacleGrid[i][j]==1) {
                        obstacleGrid[i][j]=0;
                    }else{
                        int left=Math.max(j-1,0);
                        obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][left];
                    }
                }
            }
        }
        return obstacleGrid[row-1][col-1];
    }
}