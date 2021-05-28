class Solution {
	/*
	思路上没啥问题，最后超时了
	*/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=0;i<len;i++){
            if(!list.remove((Integer)(i+1))) list.add(i+1);
            else while(list.remove((Integer)(i+1)));
        }
        return list;
    }
	/*
	类似计数排序，再逐个找
	
	执行用时：4 ms, 在所有 Java 提交中击败了99.31%的用户
	内存消耗：47.7 MB, 在所有 Java 提交中击败了8.96%的用户
	*/
	public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<len;i++){
            res[nums[i]-1]++;
        }
        for(int i=0;i<len;i++){
            if(res[i]==0) list.add(i+1);
        }
        return list;
    }
}