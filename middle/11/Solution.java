class Solution {
	/*
	暴力会超时
	*/
    public int maxArea(int[] height) {
        int max=0;
        int len = height.length;
        for(int i=len-1;i>0;i--){
            for(int j=0;j<len-i;j++){
                int res = i*Math.min(height[j],height[j+i]);
                if(res>max)max=res;
            }
        }
        return max;
    }
	/*
	双指针，想到了，但没完全想到
	
	执行用时：5 ms, 在所有 Java 提交中击败了59.45%的用户
	内存消耗：51.8 MB, 在所有 Java 提交中击败了70.50%的用户
	*/
    public int maxArea(int[] height) {
        int max=0;
        int left=0,right=height.length-1;
        while(left<right){
            int res=Math.min(height[left],height[right])*(right-left);
            max=Math.max(res,max);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max;
    }
}
}