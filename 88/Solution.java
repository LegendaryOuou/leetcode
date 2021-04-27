class Solution {
    /*
    对nums1从后往前在nums1和nums2中选最大的放就行

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.5 MB, 在所有 Java 提交中击败了63.36%的用户
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int point=m+n-1;
        for(int i=m-1,j=n-1;;){
            if(i<0){
                while(point>=0) nums1[point--]=nums2[j--];
                return;
            }
            else if(j<0){
                return;
            }else if(nums1[i]<nums2[j]){
                nums1[point]=nums2[j];
                j--;
            }else{
                nums1[point]=nums1[i];
                i--;
            }
            point--;
        }


    }

    public static void main(String[] args) {
        int[] nums1={2,5,6,0,0,0};
        int[] nums2={1,2,3};
        merge(nums1,3,nums2,3);
    }
}