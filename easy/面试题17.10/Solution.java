class Solution {
	/*
	执行用时：15 ms, 在所有 Java 提交中击败了21.98%的用户
	内存消耗：43.4 MB, 在所有 Java 提交中击败了43.07%的用户
	*/
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>=(len+1)/2) return k;
        }
        return -1;
    }
}