class Solution {
	/*
	资源消耗太大了，优化优化试试
	
	执行用时：7 ms, 在所有 Java 提交中击败了6.05%的用户
	内存消耗：38 MB, 在所有 Java 提交中击败了5.12%的用户
	*/
    public int hIndex(int[] citations) {
        int len = citations.length;
        int max=citations[0];
        Arrays.sort(citations);
        Map<Integer,Integer> map = new HashMap<>();
        int point=len-1;
        for(int i=len-1;i>=0;i--){
            if(citations[i]!=citations[point]){
                max=Math.max(max,citations[point]);
                map.put(citations[point], len-i-1);
                point=i;
            }
        }
        map.put(citations[point], len);
        //System.out.println(map.toString());

        int H = Math.min(max,len);
        for(;H>=0;H--){
            for(int citation:map.keySet()){
                if(citation>=H&&map.get(citation)>=H){
                    return H;
                }
            }
        }
        return 0;
    }
}