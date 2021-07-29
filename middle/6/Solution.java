class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.6 MB, 在所有 Java 提交中击败了82.29%的用户
	*/
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if(i==0||i==numRows-1){
                int step=2*numRows-3;
                for (int j = i; j < len; j+=step+1) {
                    ans.append(s.charAt(j));
                }
            }else{
                int step1=2*i-1;
                int step2=2*(numRows-1-i)-1;
                boolean addFirst=false;
                for (int j = i; j < len;) {
                    ans.append(s.charAt(j));
                    if(addFirst){
                        j+=step1+1;
                        addFirst=false;
                    }else{
                        j+=step2+1;
                        addFirst=true;
                    }
                }
            }
        }
        return ans.toString();
    }
}