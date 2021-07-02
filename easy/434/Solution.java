class Solution {
	/*
	为什么通过率这么低？
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36 MB, 在所有 Java 提交中击败了90.80%的用户
	*/
    public int countSegments(String s) {
        int len=s.length();
        int sum=0;
        s+=" ";
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' ') sum++;
        }
        return sum;
    }
}