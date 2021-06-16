class Solution {
	/*
	执行用时：9 ms, 在所有 Java 提交中击败了10.32%的用户
	内存消耗：39.2 MB, 在所有 Java 提交中击败了5.16%的用户
	*/
    public String gcdOfStrings(String str1, String str2) {
        int len1=str1.length(),len2=str2.length();
        if(len1==len2) return str1.equals(str2)?str1:"";
        for(int i=len2;i>0;i--){
            String regex = str2.substring(0,i);
            if(len1%i==0&&len2%i==0){
                if(str1.replaceAll(regex, "").equals("")&&str2.replaceAll(regex,"").equals("")){
                    return regex;
                }
            }
        }
        return "";
    }
}