class Solution {
	/*
	执行用时：6 ms, 在所有 Java 提交中击败了31.30%的用户
	内存消耗：38.6 MB, 在所有 Java 提交中击败了35.55%的用户
	*/
    List<String> ans = new LinkedList<>();
    int len = 0;
    public List<String> restoreIpAddresses(String s) {
        len = s.length();
        if(len>12) return ans;
        visit(s,0,"",0);
        return ans;
    }
    private void visit(String s,int start,String choosed,int pointCount){
        if(start==len) {
            if(pointCount==4) {
                ans.add(choosed.substring(1,choosed.length()));
            }
            return ;
        }
        for(int i=1;i<4&&start+i<=len;i++){
            String str = s.substring(start, start + i);
            int num = Integer.parseInt(str);
            if(i==1){
                if(!(num>=0&&num<=9)) continue;
            }else if(i==2){
                if(!(num>=10&&num<=99)) continue;
            }else{
                if(!(num>=100&&num<=255)) continue;
            }
            visit(s,start+i,choosed+"."+str,pointCount+1);
        }
    }
}