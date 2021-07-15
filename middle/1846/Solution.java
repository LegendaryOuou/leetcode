class Solution {
	/*
	执行用时：4 ms, 在所有 Java 提交中击败了98.58%的用户
	内存消耗：55.1 MB, 在所有 Java 提交中击败了86.15%的用户
	*/
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        arr[0]=1;
        for (int i = 1; i < len; i++) {
            if(arr[i]>i+1||arr[i]-arr[i-1]>1){
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[len-1];
    }
}