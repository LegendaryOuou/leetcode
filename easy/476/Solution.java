class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了78.03%的用户
	*/
    public int findComplement(int num) {
        int index = 0;
        int point=0;
        int target=num;
        while(target!=0){
            if((target&1)==1){
                point=index;
            }
            target=target>>1;
            index++;
        }
        if(point==30) return Integer.MAX_VALUE-num;
        else return (int)Math.pow(2,point+1)-1-num;
    }
}