class Solution {
	/*
	直接找
	
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39.7 MB, 在所有 Java 提交中击败了73.06%的用户
	*/
    public boolean checkPossibility(int[] nums) {
        int len=nums.length;
        int count=0;
        int point=-1;
        for(int i=0;i<len-1;i++){
            if(nums[i]>nums[i+1]) {
                count++;
                point=i;
            }
        }
        if(count==0) return true;
        else if(count>1) return false;
        else{
            if(point==0||point==len-2){
                return true;
            }else{
                /*
                int mid1 = (nums[point-1]+nums[point+1])/2;
                int mid2 = (nums[point]+nums[point+2])/2;
                if((mid1>=nums[point-1]&&mid1<=nums[point+1])||(mid2>=nums[point]&&mid2<=nums[point+2])){
                    return true;
                }else return false;
                */
                if(nums[point-1]<=nums[point+1]||nums[point]<=nums[point+2]) return true;
                else return false;
            }
        }
    }
}