class Solution {
	/*
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.3 MB, 在所有 Java 提交中击败了63.39%的用户
	*/
    public int trailingZeroes(int n) {
        int res=n;
        int count=0;
        while(res>0){
            count+=res/5;
            res/=5;
        }
        return count;
    }
}