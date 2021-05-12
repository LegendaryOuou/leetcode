class Solution {
	/*
	暴力
	
	执行用时：5 ms, 在所有 Java 提交中击败了25.85%的用户
	内存消耗：38.7 MB, 在所有 Java 提交中击败了38.00%的用户
	*/
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length,len2=nums2.length;
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    if(list.contains(nums1[i])==false){
                        list.add(nums1[i]);
                    }
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}