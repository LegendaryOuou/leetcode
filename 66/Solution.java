class Solution {
    /*
    很直接的思路，逐个从后往前加即可
    细节：
        只要程序在for循环中不能返回，就说明digits数组中的值全是9，
        那么新建一个整型数组，新的整型数组默认初始值全是0，只要将第一个位置处的值设为1即可

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了98.87%的用户
     */
    public static int[] plusOne(int[] digits) {
        int m=1;
        for (int i = digits.length-1; i >= 0; i--) {
            m+=digits[i];
            if(m<10){
                digits[i]=m;
                return digits;
            }else{
                digits[i]=m%10;
                m=1;
            }
        }
        int[] newdigits=new int[digits.length+1];
        newdigits[0]=1;
        return newdigits;
    }

    public static void main(String[] args) {
        int[] nums={9,9,9,9,9};
        System.out.println(plusOne(nums)[1]);
    }
}