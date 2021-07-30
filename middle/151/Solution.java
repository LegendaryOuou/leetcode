class Solution {
	/*
	执行用时：4 ms, 在所有 Java 提交中击败了90.39%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了95.70%的用户
	*/
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int lastBlank=len;
        while(s.charAt(--lastBlank)==' ');
        for(int i=lastBlank;i>=0;i--){
            if(s.charAt(i)!=' '&&lastBlank==-1){
                lastBlank=i;
            }else if(s.charAt(i)==' '&&lastBlank!=-1){
                sb.append(s.substring(i+1,lastBlank+1)).append(' ');
                lastBlank=-1;
            }
        }
        if(s.charAt(0)!=' ') {
            for (char ch : s.toCharArray()) {
                if (ch == ' ') break;
                sb.append(ch);
            }
            return sb.toString();
        }
        else {
            String ans = sb.toString();
            return ans.substring(0,ans.length()-1);
        }
    }
}