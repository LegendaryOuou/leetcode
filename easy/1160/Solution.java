class Solution {
	/*
	直接找就行了
	
	执行用时：6 ms, 在所有 Java 提交中击败了94.90%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了98.30%的用户
	*/
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        int len = 0;
        for(char ch:chars.toCharArray()){
            arr[(int)(ch)-97]++;
        }
        for(String str:words){
            int[] strArr = new int[26];
            for(char ch:str.toCharArray()){
                strArr[(int)(ch)-97]++;
            }
            int i;
            for(i=0;i<26;i++){
                int res = arr[i]-strArr[i];
                if(res<0) break;
            }
            if(i==26) len+=str.length();
        }
        return len;
    }
}