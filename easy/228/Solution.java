class Solution {
	/*
	执行用时：8 ms, 在所有 Java 提交中击败了44.91%的用户
	内存消耗：36.8 MB, 在所有 Java 提交中击败了49.22%的用户
	*/
    public List<String> summaryRanges(int[] nums) {
        int len=nums.length;
        int point=0;
        List<String> list = new LinkedList<>();
        if(len==0) return list;
        for(int i=0;i<len-1;i++){
            if(nums[i]+1!=nums[i+1]){
                if(i==point) list.add(nums[point]+"");
                else list.add(nums[point]+"->"+nums[i]);
                point=i+1;
            }
        }
        if(point==len-1) list.add(nums[point]+"");
        else list.add(nums[point]+"->"+nums[len-1]);
        return list;
    }
}