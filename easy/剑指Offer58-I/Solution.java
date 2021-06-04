class Solution {
	/*
	
	
	执行用时：3 ms, 在所有 Java 提交中击败了69.13%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了95.41%的用户
	*/
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s=' '+s+' ';
        int len = s.length();
        int charCount=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)!=' ') charCount++;
            else if(s.charAt(i)==' '&&charCount>0){
                sb.append(s.substring(i+1,i+1+charCount));
                sb.append(' ');
                charCount=0;
            }
        }
        if(sb.length()>0)
            sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}