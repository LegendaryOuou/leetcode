class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了92.14%的用户
	*/
    public int orangesRotting(int[][] grid) {
        List<int[]> list = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        int count2 = 0;
        int count1=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j]==1) count1++;
                if(grid[i][j]==2){
                    count2++;
                    int[] res = new int[]{i,j};
                    list.add(res);
                }
            }
        }
        if(count2==0&&count1==0) return 0;
        int ans=0;
        while(!list.isEmpty()){
            ans++;
            int size = list.size();;
            for (int i = 0; i < size; i++) {
                int[] item = list.remove(0);
                int x = item[0];
                int y = item[1];
                int left = Math.max(0,y-1);
                int right = Math.min(col-1,y+1);
                int up = Math.max(0,x-1);
                int down = Math.min(row-1,x+1);
                if(grid[x][left]==1){
                    grid[x][left]=2;
                    count1--;
                    count2++;
                    int[] res = new int[]{x,left};
                    list.add(res);
                }
                if(grid[x][right]==1){
                    grid[x][right]=2;
                    count1--;
                    count2++;
                    int[] res = new int[]{x,right};
                    list.add(res);
                }
                if(grid[up][y]==1){
                    grid[up][y]=2;
                    count1--;
                    count2++;
                    int[] res = new int[]{up,y};
                    list.add(res);
                }
                if(grid[down][y]==1){
                    grid[down][y]=2;
                    count1--;
                    count2++;
                    int[] res = new int[]{down,y};
                    list.add(res);
                }

            }
        }
        return count1!=0?-1:ans-1;
    }
}