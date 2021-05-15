class Solution {
    /*
    大体上不难，主要是细节

    执行用时：1 ms, 在所有 Java 提交中击败了99.90%的用户
    内存消耗：39.5 MB, 在所有 Java 提交中击败了95.00%的用户
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int low=-2,high=0;
        int res=0;
        int distance;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                high=i-1;
                distance=high-low;
                distance=distance>0?distance:0;
                res+=(distance%2==1)?distance/2:(distance/2-1);
                if(res>=n) return true;
                low=high+1;
            }else if(i==flowerbed.length-1){
                high=i+1;
                distance=high-low;
                distance=distance>0?distance:0;
                res+=(distance%2==1)?distance/2:(distance/2-1);
                if(res>=n) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0},2));
    }
}