class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100%的用户
	内存消耗：38.6 MB, 在所有 Java 提交中击败了47.56%的用户
	*/
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len<=2) return 2;
        int index=0;
        int num=nums[0];
        int time=0;
        for (int i = 0; i < len; i++) {
            if(nums[i]==num&&time<2){
                nums[index]=nums[i];
                time++;
                index++;
            }else if(nums[i]!=num) {
                num = nums[i];
                time = 0;
                i--;
            }
        }
        return index;
    }
}