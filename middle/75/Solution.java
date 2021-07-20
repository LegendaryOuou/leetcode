class Solution {
	/*
	不是原地排序。原地排序也好弄，选择排序就行，只需要3次遍历，时间复杂度O(n)，急着打游戏，这里就不写了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：37.1 MB, 在所有 Java 提交中击败了19.41%的用户
	*/
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int num:nums){
            arr[num]++;
        }
        int index=0;
        int color=0;
        for(int num:arr){
            while(num-->0){
                nums[index++]=color;
            }
            color++;
        }
    }
}