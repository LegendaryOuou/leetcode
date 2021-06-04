class Solution {
	/*
	暴力，有点慢，占内存有点大
	
	执行用时：2 ms, 在所有 Java 提交中击败了48.22%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了5.01%的用户
	*/
    public boolean backspaceCompare(String s, String t) {
        int slen = s.length(),tlen = t.length();
        int low=0,high=0;
        while(high<slen){
            if(s.charAt(high)=='#'){
                high++;
            }else{
                if(high>low){
                    int len = high-low;
                    low=Math.max(0,low-len);
                    s = s.substring(0,low)+s.substring(high,slen);
                    slen-=(high-low);
                    high=low;
                }else{
                    low++;
                    high++;
                }
            }
        }
        if(high>low){
            int len = high-low;
            low=Math.max(0,low-len);
            s = s.substring(0,low)+s.substring(high,slen);
        }
        low=0;
        high=0;
        while(high<tlen){
            if(t.charAt(high)=='#'){
                high++;
            }else{
                if(high>low){
                    int len = high-low;
                    low=Math.max(0,low-len);
                    t = t.substring(0,low)+t.substring(high,tlen);
                    tlen-=(high-low);
                    high=low;
                }else{
                    low++;
                    high++;
                }
            }
        }
        if(high>low){
            int len = high-low;
            low=Math.max(0,low-len);
            t = t.substring(0,low)+t.substring(high,tlen);
        }
        return s.equals(t);
    }
	/*
	用了高级数据结构竟然内存还少了
	
	执行用时：2 ms, 在所有 Java 提交中击败了48.22%的用户
	内存消耗：36.9 MB, 在所有 Java 提交中击败了22.24%的用户
	*/
	public boolean backspaceCompare(String s, String t) {
        List<Character> slist = new LinkedList<>();
        List<Character> tlist = new LinkedList<>();
        for(char ch:s.toCharArray()){
            if(ch=='#') {
                if(slist.size()>0)
                    slist.remove(slist.size()-1);
            }
            else slist.add(ch);
        }
        for(char ch:t.toCharArray()){
            if(ch=='#') {
                if (tlist.size() > 0)
                    tlist.remove(tlist.size() - 1);
            }
            else tlist.add(ch);
        }
        if(slist.size()!=tlist.size()) return false;
        for(int i=0;i<slist.size();i++){
            if(slist.get(i)!=tlist.get(i)) return false;
        }
        return true;
    }
}