class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了60.49%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了94.86%的用户
	*/
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int pointer=0;
        int left=0,right=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='('){
                left+=1;
            }else{
                right+=1;
            }
            if(left==right){
                sb.append(s.substring(pointer+1,i));
                pointer=i+1;
                left=0;
                right=0;
            }
        }
        return sb.toString();
    }
}