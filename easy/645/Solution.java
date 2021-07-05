class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：40.2 MB, 在所有 Java 提交中击败了28.92%的用户
	*/
    public int[] findErrorNums(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        for(int num:nums){
            arr[num-1]+=1;
        }
        int[] res = new int[2];
        for(int i=0;i<len;i++){
            if(arr[i]==0){
                res[1]=i+1;
            }else if(arr[i]==2){
                res[0]=i+1;
            }
        }
        return res;
    }
}