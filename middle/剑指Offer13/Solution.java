class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了41.01%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了84.64%的用户
	*/
    public int movingCount(int m, int n, int k) {
        int ans=0;
        int[][] visited = new int[m][n];
        visited[0][0]=1;
        for (int i = 0; i < m; i++) {
            int n1=0;
            int x=i;
            while(x>0){
                n1+=x%10;
                x/=10;
            }
            if(n1<=k){
                for (int j = 0; j < n; j++) {
                    int y=j;
                    int n2=0;
                    while (y > 0) {
                        n2 += y % 10;
                        y /= 10;
                    }
                    int left=Math.max(j-1,0);
                    int down=Math.max(i-1,0);
                    if(n1+n2<=k&&(visited[i][left]==1||visited[down][j]==1)) {
                        ans+=1;
                        visited[i][j]=1;
                    }
                }
            }
        }
        return ans;
    }
}