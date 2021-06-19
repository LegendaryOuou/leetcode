class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了70.82%的用户
	*/
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
            if((num&1)==1) num-=1;
            else num/=2;
            steps++;
        }
        return steps;
    }
}