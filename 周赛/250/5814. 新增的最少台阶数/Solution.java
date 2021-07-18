class Solution {
    public int addRungs(int[] rungs, int dist) {
        int len = rungs.length;
        int start=0;
        int res=0;
        for (int i = 0; i < len; i++) {
            start=Math.min(rungs[i],start+dist);
            while(start<rungs[i]){
                start+=dist;
                res++;
            }
            start=Math.min(rungs[i],start);
        }
        return res;
    }
}