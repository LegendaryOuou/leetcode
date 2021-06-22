class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.4 MB, 在所有 Java 提交中击败了73.83%的用户
	*/
    public int addDigits(int num) {
        int sum;
        while(num/10!=0){
            sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            if(sum/10==0) return sum;
            else num=sum;
        }
        return num;
    }
}