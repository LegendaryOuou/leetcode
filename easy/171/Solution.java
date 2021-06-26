class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了91.19%的用户
	*/
    public int titleToNumber(String columnTitle) {
        int res=0;
        int len=columnTitle.length();
        for(int i=len-1;i>=0;i--){
            res+=(columnTitle.charAt(i)-'A'+1)*Math.pow(26,len-1-i);
        }
        return res;
    }
}