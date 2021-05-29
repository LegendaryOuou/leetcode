class Solution {
	/*
	思路应该没啥问题，但是最后超时了
	*/
    public String removeDuplicates(String s) {
        List<Character> list = new LinkedList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }
        for(int i=0;i< list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(i);
                list.remove(i);
                i-=2;
                i=Math.max(-1,i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
	/*
	第一个可以运行的版本
	
	执行用时：45 ms, 在所有 Java 提交中击败了21.78%的用户
	内存消耗：39 MB, 在所有 Java 提交中击败了66.93%的用户
	*/
    public String removeDuplicates(String s) {
        int len = s.length();
        int l=len,i=0;
        while(i<l-1){
            if(s.charAt(i)==s.charAt(i+1)){
                s=s.substring(0,i)+s.substring(i+2,l);
                i-=1;
                l-=2;
                i=Math.max(0,i);
            }else{
                i++;
            }
        }
        return s;
    }
}