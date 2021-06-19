class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.1 MB, 在所有 Java 提交中击败了78.09%的用户
	*/
    public int balancedStringSplit(String s) {
        int left=0,right=0;
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='L') left++;
            else right++;
            if(left==right){
                res++;
                left=0;
                right=0;
            }
        }
        return res;
    }
}