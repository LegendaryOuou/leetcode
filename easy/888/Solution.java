class Solution {
	/*
	执行用时：262 ms, 在所有 Java 提交中击败了25.04%的用户
	内存消耗：39.8 MB, 在所有 Java 提交中击败了68.18%的用户
	*/
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int len1=aliceSizes.length;
        int len2=bobSizes.length;
        int sum1=0,sum2=0;
        for(int num:aliceSizes) sum1+=num;
        for(int num:bobSizes) sum2+=num;
        int distance=Math.abs(sum1-sum2);

        if(sum1>sum2){
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if((aliceSizes[i]-bobSizes[j])*2==distance) return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }else{
            for(int i=0;i<len1;i++){
                for(int j=0;j<len2;j++){
                    if((bobSizes[j]-aliceSizes[i])*2==distance) return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return null;
    }
}