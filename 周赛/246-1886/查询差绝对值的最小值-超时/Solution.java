class Solution {
    public int[] minDifference(int[] nums, int[][] queries) {
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i]=get(nums,queries[i]);
        }
        return res;
    }
    private int get(int[] nums,int[] query){
        int min=100;
        for(int i=query[0];i<query[1];i++){
            for(int j=i+1;j<=query[1];j++){
                if(nums[i]!=nums[j]){
                    if(Math.abs(nums[i]-nums[j])<min) min=Math.abs(nums[i]-nums[j]);
                }
            }
        }
        return min==100?-1:min;
    }
}