//暴力搜索
class Solution{
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
}
