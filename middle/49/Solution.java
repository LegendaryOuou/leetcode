class Solution {
	/*
	执行用时：606 ms, 在所有 Java 提交中击败了5.00%的用户
	内存消耗：41.4 MB, 在所有 Java 提交中击败了44.28%的用户
	*/
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> ans = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            if(!strs[i].equals("-")) {
                List<String> res = new LinkedList<>();
                res.add(strs[i]);
                int strLen = strs[i].length();
                Map<Character, Integer> map = new HashMap<>();
                for (char ch : strs[i].toCharArray()) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
                for (int j = i + 1; j < len; j++) {
                    if (strLen != strs[j].length()||strs[j].equals("-")) continue;
                    if(strs[j].length()==0){
                        if(strLen==0){
                            res.add("");
                            strs[j]="-";
                        }
                    }else {
                        int[] arr = new int[26];
                        for (char ch : strs[j].toCharArray()) {

                            arr[ch - 'a']++;
                        }
                        boolean isSame = true;
                        for (char ch : map.keySet()) {
                            if (arr[ch - 'a'] != map.get(ch)) {
                                isSame = false;
                                break;
                            }
                        }
                        if (isSame) {
                            res.add(strs[j]);
                            strs[j] = "-";
                        }
                    }
                }
                ans.add(res);
            }
        }
        return ans;
    }
}