class Solution {
	/*
	执行用时：9 ms, 在所有 Java 提交中击败了92.60%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了97.39%的用户
	*/
    public int countBinarySubstrings(String s) {
        int len=s.length();
        int res=0;
        int last=0;
        int point=0;
        for (int i = 1; i < len; i++) {
            if(s.charAt(i)!=s.charAt(point)){
                res+=Math.min(last,i-point);
                last=i-point;
                point=i;
            }
        }
        return res+Math.min(last,len-point);
    }
}