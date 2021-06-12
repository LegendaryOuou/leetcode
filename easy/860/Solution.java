class Solution {
	/*
	怪慢的
	
	执行用时：3 ms, 在所有 Java 提交中击败了27.00%的用户
	内存消耗：39.2 MB, 在所有 Java 提交中击败了85.36%的用户
	*/
    public boolean lemonadeChange(int[] bills) {
        int[] money=new int[3];
        for(int num:bills){
            if(num==5) money[0]++;
            else if(num==10){
                money[1]++;
                if(money[0]>0){
                    money[0]--;
                }else return false;
            }else{
                money[2]++;
                if(money[0]>0){
                    money[0]--;
                }else return false;
                if(money[1]>0) money[1]--;
                else if(money[0]>1){
                    money[0]-=2;
                }else return false;
            }
        }
        return true;
    }
}