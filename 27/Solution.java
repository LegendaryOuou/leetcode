class Solution {
    /*
    将无序数组中值与val不相等的元素逐个提前
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：37 MB, 在所有 Java 提交中击败了54.12%的用户
     */
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(k!=i){
                    nums[k]=nums[i];
                }
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}