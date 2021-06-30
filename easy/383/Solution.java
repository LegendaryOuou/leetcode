class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了95.96%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了59.22%的用户
	*/
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char ch:magazine.toCharArray()) arr[ch-'a']++;
        for(char ch:ransomNote.toCharArray()) arr[ch-'a']--;
        for(int num:arr){
            if(num<0) return false;
        }
        return true;
    }
}