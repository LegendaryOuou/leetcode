class Solution {
	/*
	这个超时了，但是思路应该是没问题的
	*/
    public int findMaxLength(int[] nums) {
        int max=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=i;j<len;j++){
                sum+=nums[j];
                if(sum==0&&j!=i){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
	/*
	换了个思路还是超时
	*/
	public int findMaxLength(int[] nums) {
        int max=0;
        int len = nums.length;
        int zeroNum,oneNum;
        for(int i=0;i<len;i++){
            zeroNum=0;
            oneNum=0;
            for(int j=i;j<len;j++){
                if(nums[j]==0) zeroNum++;
                else oneNum++;
                if(zeroNum==oneNum){
                    max=Math.max(max,zeroNum*2);
                }
            }
        }
        return max;
    }
	/*
	还是超时...
	*/
	int max=0;
    public int findMaxLength(int[] nums) {
        int zeroNums=0;
        int oneNums=0;
        for(int num:nums){
            if(num==0) zeroNums++;
            else oneNums++;
        }
        getMax(nums,0,nums.length-1,zeroNums,oneNums);
        return max;
    }
    private void getMax(int[] nums,int left,int right,int zeroNums,int oneNums){
        if(left<right){
            if(zeroNums==oneNums) {
                max = Math.max(max,2*zeroNums);
                return;
            }
            if(zeroNums<oneNums){
                if(nums[left]==1||nums[right]==1){
                    if(nums[left]==1){
                        getMax(nums,left+1,right,zeroNums,oneNums-1);
                    }
                    if(nums[right]==1){
                        getMax(nums,left,right-1,zeroNums,oneNums-1);
                    }
                }else{
                    getMax(nums,left+1,right,zeroNums-1,oneNums);
                    getMax(nums,left,right-1,zeroNums-1,oneNums);
                }
            }else{
                if(nums[left]==0||nums[right]==0){
                    if(nums[left]==0){
                        getMax(nums,left+1,right,zeroNums-1,oneNums);
                    }
                    if(nums[right]==0){
                        getMax(nums,left,right-1,zeroNums-1,oneNums);
                    }
                }else{
                    getMax(nums,left+1,right,zeroNums,oneNums-1);
                    getMax(nums,left,right-1,zeroNums,oneNums-1);
                }
            }
        }
    }
}