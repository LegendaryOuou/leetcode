class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.5 MB, 在所有 Java 提交中击败了72.49%的用户
	*/
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n1=toNumber(firstWord);
        int n2=toNumber(secondWord);
        int n3=toNumber(targetWord);
        return n1+n2==n3;
    }
    private int toNumber(String str){
        int res=0;
        for(char ch:str.toCharArray()){
            res=res*10+ch-'a';
        }
        return res;
    }
}