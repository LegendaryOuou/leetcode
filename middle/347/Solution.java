class Solution {
	/*
	执行用时：16 ms, 在所有 Java 提交中击败了47.02%的用户
	内存消耗：41.1 MB, 在所有 Java 提交中击败了31.30%的用户
	*/
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                int n1 = (int) o1.getValue();
                int n2 = (int) o2.getValue();
                return n2-n1;
            }
        });
        List<Integer> ans = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            Map.Entry entry = list.get(i);
            ans.add((Integer) entry.getKey());
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}