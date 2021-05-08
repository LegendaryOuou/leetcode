class Solution {
    /*
    移除有序数组中的重复项元素，返回互异的元素个数
    这里采用了双指针的方法
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int k=0;
        for(int i=k+1;i<nums.length;i++)
            if(nums[k]!=nums[i]){
                nums[++k]=nums[i];
            }
        return k+1;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}