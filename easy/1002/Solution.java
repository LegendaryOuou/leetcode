class Solution {
	/*
	执行用时：15 ms, 在所有 Java 提交中击败了13.87%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了81.88%的用户
	*/
    public List<String> commonChars(String[] words) {
        int len=words.length;
        Map<Character,int[]> map = new HashMap<>();
        for(int i=0;i<len;i++){
            for(char ch:words[i].toCharArray()){
                int[] res;
                if(!map.containsKey(ch)){
                    res=new int[len];
                    res[i]=1;
                }
                else {
                    res = map.get(ch);
                    res[i]+=1;
                }
                map.put(ch,res);
            }
        }
        List<String> list = new LinkedList<>();
        for(char ch:map.keySet()){
            int[] res = map.get(ch);
            int min = 10000;
            for(int num:res){
                min=Math.min(min,num);
            }
            while(min-->0){
                list.add(String.valueOf(ch));
            }
        }
        return list;
    }
	/*
	字符串之类得题目，要善于用最基本的数组代替高级数据结构
	
	执行用时：3 ms, 在所有 Java 提交中击败了98.10%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了86.24%的用户
	*/
	public List<String> commonChars(String[] words) {
        int len=words.length;
        int[] res = new int[26];
        for(int i=0;i<26;i++) res[i]=10000;
        for(String word:words){
            int[] midRes = new int[26];
            for(char ch:word.toCharArray()){
                midRes[ch-'a']++;
            }
            for(int i=0;i<26;i++)res[i]=Math.min(midRes[i],res[i]);
        }
        List<String> list = new LinkedList<>();
        for(int i=0;i<26;i++){
            int num=res[i];
            while(num-->0) list.add(String.valueOf(Character.toChars(i+97)[0]));
        }
        return list;
    }
}