class Solution {
	/*
	用Map,统计大于等于2个的数字，然后C(2,n)的和就好了
	
	执行用时：1 ms, 在所有 Java 提交中击败了82.52%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了87.41%的用户
	*/
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        int res = 0;
        for(int num:map.keySet()){
            int v = map.get(num);
            if(v>1){
                res+=v*(v-1)/2;
            }
        }
        return res;
    }
}