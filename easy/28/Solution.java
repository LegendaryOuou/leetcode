class Solution {
	/*
	KMP 有点东西的
	效果不太行
	
	执行用时：7 ms, 在所有 Java 提交中击败了13.27%的用户
	内存消耗：37.8 MB, 在所有 Java 提交中击败了50.97%的用户
	*/
    public int strStr(String haystack, String needle) {
        int len1=haystack.length(),len2=needle.length();
        if(len2==0) return 0;
        int[] pi = getPi(needle);
        int k=0,forward=0;
        while(forward<len1){
            if(k==len2) break;
            if(haystack.charAt(forward)==needle.charAt(k)){
                forward++;
                k++;
            }else{
                if(forward==0||k==0) forward++;
                else k=pi[k-1];
            }
        }
        if(k==len2) return forward-k;
        else return -1;
    }
    private int[] getPi(String needle){
        int len = needle.length();
        int[] pi = new int[len];
        int k=0,forward=1;
        while(forward<len){
            while(k>0&&needle.charAt(k)!=needle.charAt(forward)) k=pi[k-1];
            if(needle.charAt(k)==needle.charAt(forward)) k++;
            pi[forward++]=k;
        }
        return pi;
    }
	/*
	官方KMP解法
	
	执行用时：8 ms, 在所有 Java 提交中击败了10.82%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了36.56%的用户
	*/
	public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
}