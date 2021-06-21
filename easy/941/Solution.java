class Solution {
	/*
	执行用时：2 ms, 在所有 Java 提交中击败了43.37%的用户
	内存消耗：39.3 MB, 在所有 Java 提交中击败了78.43%的用户
	*/
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len<3) return false;
        int point;
        for(point=0;point<len-1;point++){
            if(arr[point]==arr[point+1]) return false;
            else if(arr[point]>arr[point+1]) {
                break;
            }
        }
        if(point==len-1||point==0) return false;
        for(;point<len-1;point++){
            if(arr[point]<=arr[point+1]) return false;
        }
        return true;
    }
	/*
	双指针，性能上差不多
	*/
	public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len<3) return false;
        int low=0;
        int high=len-1;
        while(high!=low){
            if(arr[high]<arr[high-1]) high--;
            else if(arr[low]<arr[low+1]) low++;
            else return false;
        }
        return low!=0&&high!=len-1;
    }
}