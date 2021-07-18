class Solution {
	/*
	激动！！！这个是最难的一道，做出来了，不过超时了，下面是超时的版本
	*/
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        int qLen = queries.length;
        int[] res = new int[qLen];
        for(int i=0;i<queries.length;i++){
            int index=queries[i][0];
            int target=queries[i][1];
            int max=0;
            while(index>=0){
                max=Math.max(max,target^index);
                index=parents[index];
            }
            res[i]=max;
        }
        return res;
    }
}