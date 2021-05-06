class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：44.8 MB, 在所有 Java 提交中击败了91.46%的用户
	*/
    public void reverseString(char[] s) {
        int len = s.length;
        char ch;
        for(int i=0;i<len/2;i++){
            ch=s[i];
            s[i]=s[len-1-i];
            s[len-i-1]=ch;
        }
    }
}