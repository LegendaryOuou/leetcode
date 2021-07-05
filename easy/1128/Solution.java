class Solution {
	/*
	我好菜
	
	执行用时：290 ms, 在所有 Java 提交中击败了5.48%的用户
	内存消耗：48.7 MB, 在所有 Java 提交中击败了6.03%的用户
	*/
    public int numEquivDominoPairs(int[][] dominoes) {
        List<int[]> arrList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<dominoes.length;i++){
            int n1=dominoes[i][0];
            int n2=dominoes[i][1];
            for (int j = 0; j < arrList.size(); j++) {
                if((arrList.get(j)[0]==n1&&arrList.get(j)[1]==n2)||(arrList.get(j)[0]==n2&&arrList.get(j)[1]==n1)){
                    list.set(j,list.get(j)+1);
                    break;
                }
            }
            int[] arr=new int[]{n1,n2};
            arrList.add(arr);
            list.add(1);
        }
        int sum=0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num=it.next();
            sum+=(num-1)*num/2;
        }
        return sum;
    }
}