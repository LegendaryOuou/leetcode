class Solution {
	/*
	执行用时：3 ms, 在所有 Java 提交中击败了16.79%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了83.81%的用户
	*/
    public String reverseStr(String s, int k) {
        int len=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<len-2*k;i+=2*k){
            for (int j = k-1; j >= 0; j--) {
                sb.append(s.charAt(i+j));
            }
            if(i+k<len)
                sb.append(s.substring(i+k,Math.min(len,i+2*k)));
        }
        int currentLen = sb.length();
        for (int i = Math.min(k,len-currentLen)-1; i >= 0; i--) {
            sb.append(s.charAt(currentLen+i));
        }
        currentLen = sb.length();
        if(currentLen<len) sb.append(s.substring(currentLen,len));
        return sb.toString();
    }
}