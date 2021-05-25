class Solution {
	/*
	用一个数组，每次迭代都根据上一次的计算结果从后往前计算，逐渐覆盖上一次得结果
	
	执行用时：1 ms, 在所有 Java 提交中击败了82.65%的用户
	内存消耗：35.8 MB, 在所有 Java 提交中击败了98.67%的用户
	*/
    public List<Integer> getRow(int rowIndex) {
        Integer[] res = new Integer[rowIndex+1];
        res[0]=1;
        int last = 0;
        for(int i=0;i<rowIndex;i++){
            res[i+1]=1;
            res[0]=1;
            int index = i;
            while(index!=0){
                res[index]+=res[index-1];
                index--;
            }
        }
        return Arrays.asList(res);
    }
}