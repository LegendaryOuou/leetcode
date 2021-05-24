class Solution {
	/*
	先排序再一个一个找
	
	执行用时：8 ms, 在所有 Java 提交中击败了88.82%的用户
	内存消耗：38.8 MB, 在所有 Java 提交中击败了96.01%的用户
	*/
    public int findContentChildren(int[] g, int[] s) {
        int glen=g.length,slen=s.length;
        int max=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0,j=0;i<glen&&j<slen;){
            if(g[i]<=s[j]){
                max++;
                i++;
            }
            j++;
        }
        return max;
    }
}