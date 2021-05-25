class Solution {
	/*
	不知道为什么增强for会慢一点
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：41.3 MB, 在所有 Java 提交中击败了58.80%的用户
	*/
    public int search(int[] nums, int target) {
        int res=0;
        for(int item:nums){
            if(item<target) continue;
            if(item==target) res++;
            else break;
        }
        return res;
    }
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：41 MB, 在所有 Java 提交中击败了95.52%的用户
	*/
	public int search(int[] nums, int target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int item=nums[i];
            if(item<target) continue;
            if(item==target) res++;
            else break;
        }
        return res;
    }
}