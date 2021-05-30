class Solution {
	/*
	tips:
		需要用到高级数据结构的时候，想想能不能用数组代替！
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.8 MB, 在所有 Java 提交中击败了77.28%的用户
	*/
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for(char ch:t.toCharArray()){
            arr[(int)(ch)-97]++;
        }
        for(char ch:s.toCharArray()){
            arr[(int)(ch)-97]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0) return Character.toChars(i+97)[0];
        }
        return '1';
    }
}