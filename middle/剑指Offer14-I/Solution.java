class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了65.87%的用户
	*/
    public int cuttingRope(int n) {
        int ans=0;
        for(int i=1;i<=(n+1)/2;i++){
            int len1 = n/i;
            int len2 = n-(len1*i);
            if(len1==len2) ans = Math.max((int)(Math.pow(i,len1)*len2),ans);
            else if(len1>len2) {
                ans = Math.max((int)(Math.pow(i,len1-len2)*Math.pow(i+1,len2)),ans);
                ans = Math.max((int)(Math.pow(i,len1)*len2),ans);
            }
        }
        return ans;
    }
}