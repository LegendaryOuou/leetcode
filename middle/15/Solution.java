class Solution {
	/*
	执行用时：27 ms, 在所有 Java 提交中击败了42.22%的用户
	内存消耗：42.1 MB, 在所有 Java 提交中击败了85.36%的用户
	*/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        int len=nums.length;
        Arrays.sort(nums);
        if(len<3) return list;
        for(int i=0;i<len-2;i++){
            int num=nums[i];
            if(num>0) break;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left=i+1,right=len-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    list.add(new ArrayList(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while(left<right&&nums[left]==nums[left-1]) left++;
                    while(left<right&&nums[right]==nums[right+1]) right--;
                }else if(nums[i]+nums[left]+nums[right]<0) left++;
                else right--;
                
            }
        }
        return list;
    }
}