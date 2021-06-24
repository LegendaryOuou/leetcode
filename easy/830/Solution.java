class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了45.85%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了82.23%的用户
	*/
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new LinkedList<>();
        s="-"+s+"-";
        int point=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(point)!=s.charAt(i)){
                if(i-point>=3){
                    List<Integer> l = new LinkedList<>();
                    l.add(point-1);
                    l.add(i-2);
                    list.add(l);
                }
                point=i;
            }
        }
        return list;
    }
}