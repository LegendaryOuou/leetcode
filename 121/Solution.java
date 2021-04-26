class Solution {
    /*
    思路一：暴力搜索，思路是可行的，但是太慢了，提交之后提示运行超时
    public static int maxProfit(int[] prices){
        int max=0;
        for(int i=1;i<prices.length;i++){
            for (int j = 0; j < i; j++) {
                if(max<prices[i]-prices[j]) max=prices[i]-prices[j];
            }
        }
        return max;
    }
    */
    /*
    思路2：类似插入排序(自己想出来的)。
    程序维护一个已经遍历过的元素中的最小值，和当前已经遍历过的元素的maxProfit；
    依次遍历数组中的元素，遍历到数组第i+1个位置时(要确保max和max_low的值分别是prices中0~i位置的maxProfit和最小值)，程序做了两件事：
        更新0~i+1的maxProfit，也就是max值;更新0~i+1位置的最小值
	
    执行用时：2 ms, 在所有 Java 提交中击败了98.82%的用户
    内存消耗：51.3 MB, 在所有 Java 提交中击败了71.09%的用户
     */
    public static int maxProfit(int[] prices) {
        int max=0,max_low=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]-max_low>max){
                max=prices[i]-max_low;
            }
            else if(prices[i]<max_low){
                max_low=prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices={823,181,694,107,138,375,825,309,521,887,402,183,510,705,186,398,677,445,721,185,481,80,96,461,972};
        System.out.println(maxProfit(prices));
    }
}