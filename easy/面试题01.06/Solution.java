class Solution {
	/*
	执行用时：6 ms, 在所有 Java 提交中击败了43.57%的用户
	内存消耗：37.7 MB, 在所有 Java 提交中击败了99.47%的用户
	*/
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        String subS='-'+S+'-';
        int low=1;
        for(int i=1;i<subS.length();i++){
            if(subS.charAt(i)!=subS.charAt(low)){
                sb.append(subS.charAt(low)).append(i-low);
                low=i;
            }
        }
        return sb.length()<S.length()?sb.toString():S;
    }
}