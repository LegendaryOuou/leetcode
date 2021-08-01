class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了99.77%的用户
	内存消耗：39.1 MB, 在所有 Java 提交中击败了94.70%的用户
	*/
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            int sum=0;
            for(int num:mat[i]){
                if(num!=1) break;
                sum++;
            }
            mat[i][0]=sum;
            // mat[i][1]=i;
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            int minIndex=0;
            for(int j=0;j<row;j++){
                if(mat[j][0]<mat[minIndex][0]){
                    minIndex=j;
                }
            }
            ans[i]=minIndex;
            mat[minIndex][0]=col+1;
        }
        return ans;
    }
}