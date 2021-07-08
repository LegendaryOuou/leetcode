class Solution {
	/*
	我很菜
	
	执行用时：130 ms, 在所有 Java 提交中击败了73.22%的用户
	内存消耗：48.3 MB, 在所有 Java 提交中击败了71.86%的用户
	*/
    public int countPairs(int[] deliciousness) {
        int len= deliciousness.length;
        int res=0;
        int max=0;
        for (int val:deliciousness) {
            max=Math.max(max,val);
        }
        int maxSum=max*2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int num=deliciousness[i];
            for(int sum=1;sum<=maxSum;sum<<=1){
                if(map.containsKey(sum-num)){
                    res+=map.get(sum-num);
                    res%=1000000007;
                }
            }
            if(!map.containsKey(num)) map.put(num,1);
            else map.put(num,map.get(num)+1);
        }
        return res;
    }
}