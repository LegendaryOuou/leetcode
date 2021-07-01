class Solution {
	/*
	我说怎么怎么改都到不了0ms，原来好多人直接return s.toLowerCase();。
	
	执行用时：1 ms, 在所有 Java 提交中击败了15.73%的用户
	内存消耗：36.7 MB, 在所有 Java 提交中击败了14.08%的用户
	*/
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='A'&&ch<='Z') sb.append(Character.toLowerCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }
}