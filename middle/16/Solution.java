class Solution {
	/*
	执行用时：4 ms, 在所有 Java 提交中击败了98.01%的用户
	内存消耗：38.1 MB, 在所有 Java 提交中击败了44.53%的用户
	*/
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < len-2; i++) {
            int num = nums[i];
            int left=i+1,right=len-1;
            int tt = target-num;
            while(left<right){
                int sum = nums[left]+nums[right];
                int dis = Math.abs(sum-tt);
                if(dis<min){
                    ans=sum+num;
                    min = dis;
                }
                if(sum<tt){
                    left++;
                }else if(sum>tt){
                    right--;
                }else{
                    return target;
                }
            }
        }
        return ans;
    }
}