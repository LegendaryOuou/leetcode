class Solution {
	/*
	执行用时：15 ms, 在所有 Java 提交中击败了52.33%的用户
	内存消耗：46.2 MB, 在所有 Java 提交中击败了60.39%的用户
	*/
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        int index=0;
        while(index<length){
            char ch = S.charAt(index);
            if(ch==' ') {
                sb.append("%20");
            }else{
                sb.append(ch);
            }
            index++;
        }
        return sb.toString();
    }
}