class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100%的用户
	内存消耗：46 MB, 在所有 Java 提交中击败了83.81%的用户
	*/
    public int[] divingBoard(int shorter, int longer, int k) {
        int[] res;
        if(k==0)res = new int[0];
        else if(shorter==longer) {
            res=new int[1];
            res[0]=k;
            //return res;
        }else{
            res = new int[k+1];
            int diff = longer-shorter;
            for(int i=0;i<k+1;i++){
                res[i]=shorter*k+i*diff;
            }
        }
        return res;
    }
}