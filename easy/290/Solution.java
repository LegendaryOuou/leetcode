class Solution {
	/*
	险些超时
	
	执行用时：4 ms, 在所有 Java 提交中击败了7.24%的用户
	内存消耗：38.8 MB, 在所有 Java 提交中击败了5.04%的用户
	*/
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        int len1 = pattern.length(),len2 = s.length();
        if(len1!=s.split(" ").length) return false;
        for(int i=0;i<len1;i++){
            String subS = s.split(" ")[i];
            char ch = pattern.toCharArray()[i];
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(subS)) return false;
            }else{
                map1.put(ch,subS);
            }
            if(map2.containsKey(subS)){
                if(map2.get(subS)!=ch) return false;
            }else{
                map2.put(subS,ch);
            }
        }
        return true;
    }
}