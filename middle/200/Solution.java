class Solution {
	/*
	莽就完了
	
	执行用时：5 ms, 在所有 Java 提交中击败了18.30%的用户
	内存消耗：41.1 MB, 在所有 Java 提交中击败了11.08%的用户
	*/
    public int numIslands(char[][] grid) {
        int len1=grid.length,len2=grid[0].length;
        int res=0;
        int[][] visited = new int[len1][len2];
        List<int[]> list = new LinkedList<>();
//        int[] s = new int[]{0,0};
        while(true){
            if(list.isEmpty()){
                for(int row=0;row<len1;row++){
                    for(int col=0;col<len2;col++){
                        if(grid[row][col]=='1'&&visited[row][col]==0){
                            int[] p = new int[]{row,col};
                            list.add(p);
                            break;
                        }
                    }
                    if(!list.isEmpty()){
                        res++;
                        break;
                    }
                }
            }
            if(list.isEmpty()) return res;
            int[] points = list.remove(0);
            int x = points[0];
            int y = points[1];
            visited[x][y]=1;
            grid[x][y]='0';
            int left=Math.max(y-1,0);
            int right=Math.min(y+1,len2-1);
            int up=Math.max(x-1,0);
            int bottom=Math.min(x+1,len1-1);
            if(visited[x][left]==0&&grid[x][left]=='1'){
                int[] p = new int[]{x,left};
                visited[x][left]=1;
                list.add(p);
            }
            if(visited[x][right]==0&&grid[x][right]=='1'){
                visited[x][right]=1;
                int[] p = new int[]{x,right};
                list.add(p);
            }
            if(visited[up][y]==0&&grid[up][y]=='1'){
                visited[up][y]=1;
                int[] p = new int[]{up,y};
                list.add(p);
            }
            if(visited[bottom][y]==0&&grid[bottom][y]=='1'){
                visited[bottom][y]=1;
                int[] p = new int[]{bottom,y};
                list.add(p);
            }

        }
    }
}