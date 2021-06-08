class Solution {
	/*
	直接找
	
	执行用时：6 ms, 在所有 Java 提交中击败了92.30%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了86.62%的用户
	*/
    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char ch:s.toCharArray()){
            arr[(int)(ch)-97]++;
        }
        for(char ch:s.toCharArray()){
            if(arr[(int)(ch)-97]==1) return ch;
        }
        return ' ';
    }
}