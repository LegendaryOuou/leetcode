class Solution {
	/*
	开销也太大了
	
	执行用时：404 ms, 在所有 Java 提交中击败了5.04%的用户
	内存消耗：39.4 MB, 在所有 Java 提交中击败了9.33%的用户
	*/
    public String reverseVowels(String s) {
        int len=s.length();
        int low=0,high=len-1;
        while(low<high){
            char chLow=s.charAt(low);
            char chHigh=s.charAt(high);
            if(!isVowel(chLow)) low++;
            else if(!isVowel(chHigh)) high--;
            else{
                s=s.substring(0,low)+String.valueOf(chHigh)+s.substring(low+1,high)+String.valueOf(chLow)+s.substring(high+1,len);
                low++;
                high--;
            }
        }
        return s;
    }
    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}