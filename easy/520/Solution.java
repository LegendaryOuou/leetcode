class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.8 MB, 在所有 Java 提交中击败了56.31%的用户
	*/
    public boolean detectCapitalUse(String word) {
        char ch1=word.charAt(0);
        if(word.length()>1){
            if(ch1<='Z'&&ch1>='A'){
                char ch2=word.charAt(1);
                if(ch2>='A'&&ch2<='Z'){
                    for(int i=1;i<word.length();i++){
                        char ch = word.charAt(i);
                        if(!(ch<='Z'&&ch>='A')) return false;
                    }
                }else{
                    for(int i=1;i<word.length();i++){
                        char ch = word.charAt(i);
                        if(!(ch<='z'&&ch>='a')) return false;
                    }
                }
            }else{
                for(int i=1;i<word.length();i++){
                    char ch = word.charAt(i);
                    if(!(ch<='z'&&ch>='a')) return false;
                }
            }
        }
        return true;
    }
}