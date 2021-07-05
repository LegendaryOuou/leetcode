class Solution {
	/*
	先处理index数组，避免后续移动结果数组的元素
	
	执行用时：1 ms, 在所有 Java 提交中击败了85.03%的用户
	内存消耗：36.7 MB, 在所有 Java 提交中击败了95.14%的用户
	*/
    public int[] createTargetArray(int[] nums, int[] index) {
        int len=nums.length;
        int[] res = new int[len];
        for(int i=1;i<len;i++){
            for (int j = 0; j < i; j++) {
                if(index[j]>=index[i])index[j]++;
            }
        }
        for (int i = 0; i < len; i++) {
            res[index[i]]=nums[i];
        }
        return res;
    }
}