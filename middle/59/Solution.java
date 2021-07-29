class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.2 MB, 在所有 Java 提交中击败了95.18%的用户
	*/
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int row=0,col=0;
        int num=1;
        int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1;
        int side = 1;
        while(num<=n*n){
            ans[row][col]=num++;
            switch (side){
                case 1:
                    col++;
                    if(col>colEnd){
                        col=colEnd;
                        rowStart++;
                        row=rowStart;
                        side++;
                    }
                    break;
                case 2:
                    row++;
                    if(row>rowEnd){
                        row=rowEnd;
                        colEnd--;
                        col=colEnd;
                        side++;
                    }
                    break;
                case 3:
                    col--;
                    if(col<colStart){
                        col=colStart;
                        rowEnd--;
                        row=rowEnd;
                        side++;
                    }
                    break;
                case 4:
                    row--;
                    if(row<rowStart){
                        row=rowStart;
                        colStart++;
                        col=colStart;
                        side=1;
                    }
                    break;
            }
        }
        return ans;
    }
}