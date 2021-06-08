class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了98.38%的用户
	*/
    public boolean uniqueOccurrences(int[] arr) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(num<min) min=num;
            if(num>max) max=num;
        }
        int[] times = new int[max-min+1];
        for(int num:arr){
            times[num-min]++;
        }
        for(int i=0;i<max-min+1;i++){
            if(times[i]!=0){
                for(int j=i+1;j<max-min+1;j++){
                    if(times[i]==times[j]) return false;
                }
            }
        }
        return true;
    }
}