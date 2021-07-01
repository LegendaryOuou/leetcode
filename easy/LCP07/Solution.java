class Solution {
	/*
	执行用时：8 ms, 在所有 Java 提交中击败了16.42%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了7.17%的用户
	*/
    public int numWays(int n, int[][] relation, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < relation.length; i++) {
            if(!map.containsKey(relation[i][0])){
                map.put(relation[i][0],new LinkedList<Integer>());
            }
            map.get(relation[i][0]).add(relation[i][1]);
        }
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(-1);
        for (int i = 0; i < k; i++) {
            while(list.get(0)!=-1){
                int num = list.remove(0);
                if(map.containsKey(num)){
                    Iterator<Integer> it = map.get(num).iterator();
                    while(it.hasNext()){
                        list.add(it.next());
                    }
                }
            }
            list.remove(0);
            list.add(-1);
        }
        int res=0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()==n-1) res++;
        }
        return res;
    }
}