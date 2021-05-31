class Solution {
	/*
	暴力解法
	
	执行用时：1762 ms, 在所有 Java 提交中击败了5.10%的用户
	内存消耗：41.6 MB, 在所有 Java 提交中击败了73.45%的用户
	*/
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int point;
        for(int i=0;i<(len+1)/2;i++){
            point=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]<nums[point]) point=j;
            }
            int t = nums[i];
            nums[i]=nums[point];
            nums[point]=t;
        }
        return nums[(len-1)/2];
    }
	/*
	用了Map之后
	
	执行用时：16 ms, 在所有 Java 提交中击败了20.02%的用户
	内存消耗：43.6 MB, 在所有 Java 提交中击败了31.00%的用户
	*/
	public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        int len = nums.length;
        for(int item:map.keySet()){
            if(map.get(item)>len/2) return item;
        }
        return 0;
    }
}