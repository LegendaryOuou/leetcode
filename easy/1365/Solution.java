class Solution {
	/*
	暴力！！
	
	执行用时：17 ms, 在所有 Java 提交中击败了23.31%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了45.53%的用户
	*/
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j) continue;
                if(nums[j]<nums[i]) res[i]++;
            }
        }
        return res;
    }
	/*
	计数排序
	
	执行用时：3 ms, 在所有 Java 提交中击败了74.38%的用户
	内存消耗：38.4 MB, 在所有 Java 提交中击败了86.78%的用户
	*/
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int len = nums.length;
        for(int i=0;i<len;i++){
            count[nums[i]]++;
        }
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            for(int j=0;j<nums[i];j++){
                res[i]+=count[j];
            }
        }
        return res;
    }
}