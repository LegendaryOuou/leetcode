class Solution {
	/*
	执行用时：1211 ms, 在所有 Java 提交中击败了15.27%的用户
	内存消耗：51.7 MB, 在所有 Java 提交中击败了15.42%的用户
	*/
    public int[] dailyTemperatures(int[] temperatures) {
        int len=temperatures.length;
        for(int i=0;i<len;i++) {
            boolean merged = false;
            for(int j=i+1;j<len;j++){
                if(temperatures[j]>temperatures[i]) {
                    temperatures[i]=j-i;
                    merged=true;
                    break;
                }
            }
            if(!merged) temperatures[i]=0;
        }
        temperatures[len-1]=0;
        return temperatures;
    }
}