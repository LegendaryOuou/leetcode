class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了99.28%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了86.44%的用户
	*/
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        char lastChar = s.charAt(len-1);
        for(int i=0;i<len-1;i++){
            if(s.charAt(i)==lastChar){
                if(len%(i+1)==0){
                    int j;
                    for(j=0;j<len-i;j+=i+1){
                        if(!s.substring(j,j+i+1).equals(s.substring(0,i+1))) break;
                    }
                    if(j==len) return true;
                }
            }
        }
        return false;
    }
}