class Solution {
	/*
	暴力直接找就行了
	
	执行用时：3 ms, 在所有 Java 提交中击败了98.34%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了77.85%的用户
	*/
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums2[j]==nums1[i]) {
                    int k;
                    for(k=j;k<len2;k++){
                        if(nums2[k]>nums1[i]){
                            arr[i]=nums2[k];
                            break;
                        }
                    }
                    if(k==len2) arr[i]=-1;
                    break;
                }

            }
        }
        return arr;
    }
}