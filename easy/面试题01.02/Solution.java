class Solution {
	/*
	用map
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.3 MB, 在所有 Java 提交中击败了26.16%的用户
	*/
    public boolean CheckPermutation(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        int len1=s1.length(),len2 = s2.length();
        for(int i=0;i<len1;i++){
            char ch = s1.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        for(int i=0;i<len2;i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)-1);
            else return false;
        }
        for(char ch:map.keySet()){
            if(map.get(ch)!=0) return false;
        }
        return true;
    }
	/*
	用数组代替map,同时可以发现测试数据中只有小写字母
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36 MB, 在所有 Java 提交中击败了90.75%的用户
	*/
	public boolean CheckPermutation(String s1, String s2) {
        int[] res = new int[26];
        int len1=s1.length(),len2=s2.length();
        for(int i=0;i<len1;i++){
            char ch = s1.charAt(i);
            res[(int)(ch)-97]+=1;
        }
        for(int i=0;i<len2;i++){
            char ch = s2.charAt(i);
            res[(int)(ch)-97]-=1;
        }
        for(int i=0;i<26;i++){
            if(res[i]!=0) return false;
        }
        return true;
    }
}