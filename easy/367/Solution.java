class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了75.45%的用户
	*/
    public boolean isPerfectSquare(int num) {
        double k=1;
        while(Math.abs(k*k-num)>1){
            k=(k+num/k)/2;
        }
        return (int)k*(int)k==num;
    }
	/*
	进阶版
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：34.9 MB, 在所有 Java 提交中击败了92.99%的用户
	*/
	public boolean isPerfectSquare(int num) {
        double k=1;
        while(true){
            k=(k+num/k)/2;
            double res = k*k-num;
            res=res<0?-res:res;
            if(res<1) break;
        }
        return (int)k*(int)k==num;
    }
}