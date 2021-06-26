class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了65.34%的用户
	内存消耗：40.4 MB, 在所有 Java 提交中击败了17.86%的用户
	*/
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        int len = num.length;
        int C=0;
        for(int i=len-1;i>=0;i--){
            int sum = num[i]+k%10+C;
            list.add(0,sum%10);
            C=sum/10;
            k=k/10;
        }
        while(k!=0){
            int sum = k%10+C;
            list.add(0,sum%10);
            C=sum/10;
            k=k/10;
        }
        if(C==1) list.add(0,1);
        return list;
    }
}