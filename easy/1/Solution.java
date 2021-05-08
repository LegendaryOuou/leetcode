class Solution{
	//暴力搜索
	public int[] twoSum(int[] nums, int target){
		int[] index = new int[2];
		for(int i=0;i<nums.length-1;i++){
			for(int j=i;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					index[0]=i;
					index[1]=j;
				}
			}
		}
		return index;
	}
	/*
	//用哈希表
	public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                index[0]=hash.get(nums[i]);
                index[1]=i;
                break;
            }
            hash.put(target-nums[i],i);
        }
        return index;
    }
	*/
}
