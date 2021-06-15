class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了86.60%的用户
	*/
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return i;
        }
        return 0;
    }
}