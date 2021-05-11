package com.leetcode;

class Solution {
    /*
	暴力就挺快的

	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：36.3 MB, 在所有 Java 提交中击败了25.23%的用户
    public boolean isUnique(String astr) {
        int len = astr.length();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(astr.charAt(i)==astr.charAt(j)) return false;
            }
        }
        return true;
    }
	*/
    /*
    思路上应该没啥问题，最后超时了
    "twduzrpnqrvepsqjclyqealasvnpzurzhfxsdeimzhkbuqbcuhviqnosnympcmdlbyyacovusajklruvqpcjfngd"

    解决办法：在isUnique函数中加一个检查字符串长度的语句
    由此引出一种新的解决方法（在下面）
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：36.2 MB, 在所有 Java 提交中击败了40.93%的用户

    private static boolean value=true;
    public static boolean isUnique(String astr) {
        if(astr.length()>26) return false;
        check(astr,0,astr.length()-1);
        return value;
    }
    private static void check(String str, int low, int high){
        if(low<high){
            if(str.charAt(low)==str.charAt(high)) value=false;
            else{
                if ((low + 1 < high || low < high - 1)&&value) {
                    check(str,low+1,high);
                    check(str,low,high-1);
                }
            }
        }
    }
     */
    /*
    新的解决方法在这

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：35.9 MB, 在所有 Java 提交中击败了96.82%的用户
     */
    public static boolean isUnique(String astr) {
        if(astr.length()>26) return false;
        int[] arr = new int[26];
        for(int i=0;i<astr.length();i++){
            int n = (int)(astr.charAt(i))-97;
            if(arr[n]==1) return false;
            arr[n]=1;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println((int)('a'));
        System.out.println(isUnique("twduzrpnqrvepsqjclyqealasvnpzurzhfxsdeimzhkbuqbcuhviqnosnympcmdlbyyacovusajklruvqpcjfngd"));
    }
}