class Solution {
    /*
    思路一：很直接，如下，但是效果不太好

    执行用时：7 ms, 在所有 Java 提交中击败了14.73%的用户
    内存消耗：35.4 MB, 在所有 Java 提交中击败了19.71%的用户
    public static boolean judgeSquareSum(int c) {
        if(c==0) return true;
        double result;
        for (int i = 0; i < Math.sqrt(c); i++) {
            result = Math.sqrt(c-i*i);
            if((int)result==result) return true;
        }
        return false;
    }
     */
    /*
    思路二：不知道为什么这样内存会少一点

    执行用时：7 ms, 在所有 Java 提交中击败了14.73%的用户
    内存消耗：35.1 MB, 在所有 Java 提交中击败了74.69%的用户
    public static boolean judgeSquareSum(int c) {
        if(c==0) return true;
        int result;
        for (int i = 0; i < Math.sqrt(c); i++) {
            result = (int)Math.sqrt(c-i*i);
            if(result*result==(c-i*i)) return true;
        }
        return false;
    }
     */
    /*
    思路三：这样效果也不好
    public static boolean judgeSquareSum(int c) {
        int result = (int) Math.sqrt(c);
        if (c == 0 || (result * result == c)) return true;
        for (int i = 0; i < Math.sqrt(c); i++) {
            result = (int) Math.sqrt(c - i * i);
            if (result * result == (c - i * i)) return true;
        }
        return false;
    }
     */
    /*
    思路四：考虑另一种思路
    思路可行，但是超时了，太菜了
    public static boolean judgeSquareSum(int c) {
        if (c == 0) return true;
        double result = Math.sqrt(c);
        for (int i = 0; i <= result; i++) {
            for (int j = i; j <= result; j++) {
                int sum=i*i+j*j;
                if(sum==c) return true;
                if(sum>c) break;
            }
        }
        return false;
    }
     */

    /*
    思路五：对思路2的改进
    有进步。哪里还可以优化呢？

    执行用时：4 ms, 在所有 Java 提交中击败了31.93%的用户
    内存消耗：35 MB, 在所有 Java 提交中击败了92.28%的用户
    public static boolean judgeSquareSum(int c) {
        if(c==0) return true;
        int result= (int) Math.sqrt(c);
        int sum;
        for (int i = result/2; i <= result; i++) {
            sum = (int)Math.sqrt(c-i*i);
            if(sum*sum==(c-i*i)) return true;
        }
        return false;
    }
     */
    /*
    官方题解：费马大平方和定理

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：35.2 MB, 在所有 Java 提交中击败了69.48%的用户
     */
    public static boolean judgeSquareSum(int c) {
        for(int i=2;i*i<c;i++){
            //判断i是不是c的因数
            if(c%i!=0) continue;
            int exp=0;
            while(c%i==0){
                c/=i;
                exp++;
            }
            if(i%4==3&&exp%2!=0) return false;
        }
        return c%4!=3;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483646));
    }
}