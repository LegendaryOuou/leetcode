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
	/*
	摩尔投票
	知道要用摩尔投票，但是钻牛角尖的一直认为O(n)只需要一次遍历，没考虑到最后还要统计一下结果是不是正确的
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：44.3 MB, 在所有 Java 提交中击败了18.79%的用户
	*/
	public int majorityElement(int[] nums) {
        int sum=0;
        int res=0;
        for(int num:nums){
            if(sum==0) res=num;
            sum+=(res==num?1:-1);
        }
        sum=0;
        for(int num:nums){
            if(num==res) sum++;
        }
        return sum*2>nums.length?res:-1;
    }
}