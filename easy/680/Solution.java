class Solution {
	/*
	思路没问题，但是超时了
	*/
    int count=0;
    public boolean validPalindrome(String s) {
        int len = s.length();
        if(len>1){
            if(s.charAt(0)==s.charAt(s.length()-1)){
                return validPalindrome(s.substring(1,len-1));
            }else{
                if(count==0){
                    count+=1;
                    return validPalindrome(s.substring(0,len-1))||validPalindrome(s.substring(1,len));
                }else{
                    return false;
                }
            }
        }else{
            return true;
        }
    }
}