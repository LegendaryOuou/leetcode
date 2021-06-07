class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了96.69%的用户
	*/
    public boolean isUgly(int n) {
        if(n==0)return false;
        while(n!=1){
            if(n%2==0) n=n/2;
            else if(n%3==0) n=n/3;
            else if(n%5==0) n=n/5;
            else return false;
        }
        return true;
    }
}