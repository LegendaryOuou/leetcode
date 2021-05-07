class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了93.63%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了83.81%的用户
	*/
    public int[] twoSum(int[] numbers, int target) {
        int low=0,high=numbers.length-1;
        int[] res = new int[2];
        while(low<high){
            int sum = numbers[low]+numbers[high];
            if(sum==target){
                res[0]=low+1;
                res[1]=high+1;
                return res;
            }
            else if(sum<target) low++;
            else high--;
        }
        return res;
    }
}