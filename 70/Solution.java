class Solution {
    /*
    直接dp
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：34.9 MB, 在所有 Java 提交中击败了95.97%的用户
     */
    public static int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int n1=1,n2=2,now=-1;
        n-=2;
        while(n--!=0){
            now=n1+n2;
            n1=n2;
            n2=now;
        }
        return now;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(11));
    }

}