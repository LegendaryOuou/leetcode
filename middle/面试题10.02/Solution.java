class Solution {
	/*
	还行吧
	
	执行用时：8 ms, 在所有 Java 提交中击败了88.78%的用户
	内存消耗：41.2 MB, 在所有 Java 提交中击败了85.17%的用户
	*/
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            int[] res = new int[26];
            for(char ch:strs[i].toCharArray()){
                res[ch-'a']++;
            }
            for (int j = 0; j < 26; j++) {
                while(res[j]>0){
                    sb.append((char)('a'+j));
                    res[j]--;
                }
            }
            if(map.containsKey(sb.toString())){
                map.get(sb.toString()).add(strs[i]);
            }else{
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(sb.toString(),list);
            }
        }
        List<List<String>> list=new LinkedList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}