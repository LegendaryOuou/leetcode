class Solution {
	/*
	直接思路
	
	执行用时：8 ms, 在所有 Java 提交中击败了57.04%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了95.50%的用户
	*/
    public String reverseWords(String s) {
        int len = s.length();
        int head=-1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=len;i++){
            if(i==len||s.charAt(i)==' '){
                int tail = i;
                while(head+1<tail){
                    sb.append(s.charAt(--tail));
                }
                if(i<len){
                    sb.append(' ');
                    head = i;
                }
            }
        }
        return sb.toString();
    }
}