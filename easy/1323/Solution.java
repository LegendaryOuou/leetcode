class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35 MB, 在所有 Java 提交中击败了90.45%的用户
	*/
    public static int maximum69Number (int num) {
        int max=num;
        int m=1;
        for(int i=0;i<4;i++){
            int suffix = num%m;
            int pre = num/m;
            if(pre%10==6){
                max=Math.max(max,(10*(pre/10)+9)*m+suffix);
            }
            m*=10;
        }
        return max;
    }
}