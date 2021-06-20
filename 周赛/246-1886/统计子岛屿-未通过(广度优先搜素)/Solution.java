package com.leetcode;

class Solution {
    public static int countSubIslands(int[][] grid1, int[][] grid2) {
        int island=1;
        boolean findIsland=false;
        int row=grid2.length,col=grid2[0].length;
        while(true){
            findIsland=false;
            island++;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid2[i][j]==1){
                        if(!findIsland) {
                            grid2[i][j]=island;
                            findIsland=true;
                        }
                        else{
                            int top=Math.max(0,i-1);
                            int bottom=Math.min(row-1,i+1);
                            int left=Math.max(0,j-1);
                            int right=Math.min(col-1,j+1);
                            if(grid2[top][j]==island||grid2[bottom][j]==island||grid2[i][left]==island||grid2[i][right]==island) grid2[i][j]=island;
                        }
                    }
                }
            }
            if(findIsland==false) break;
        }

        System.out.println(island);
        print(grid2);
        int[] islandMarker = new int[island-1];
        for(int marker=2;marker<island+1;marker++){
            for(int i=0;i<row&&islandMarker[marker-2]==0;i++){
                for(int j=0;j<col&&islandMarker[marker-2]==0;j++){
                    if(grid2[i][j]==marker){
                        if(grid1[i][j]==0)islandMarker[marker-2]=-1;
                    }
                }
            }
        }
        int sum=0;
        for(int num:islandMarker){
            if(num==0) sum++;
        }
        return sum;
    }

    private static void print(int[][] grid){
        for(int i=0;i< grid.length;i++){
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid1=new int[][]{{1,1,1,1,0,0},{1,1,0,1,0,0},{1,0,0,1,1,1},{1,1,1,0,0,1},{1,1,1,1,1,0},{1,0,1,0,1,0},{0,1,1,1,0,1},{1,0,0,0,1,1},{1,0,0,0,1,0},{1,1,1,1,1,0}};
        int[][] grid2=new int[][]{{1,1,1,1,0,1},{0,0,1,0,1,0},{1,1,1,1,1,1},{0,1,1,1,1,1},{1,1,1,0,1,0},{0,1,1,1,1,1},{1,1,0,1,1,1},{1,0,0,1,0,1},{1,1,1,1,1,1},{1,0,0,1,0,0}};
        print(grid2);
        System.out.println(countSubIslands(grid1,grid2));
    }
}