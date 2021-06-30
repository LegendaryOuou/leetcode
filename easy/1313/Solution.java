class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了98.67%的用户
	内存消耗：39.1 MB, 在所有 Java 提交中击败了50.21%的用户
	*/
    public int[] decompressRLElist(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        int[] arr = new int[sum];
        int point=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                arr[point++]=nums[i+1];
            }
        }
        return arr;
    }
	/*
	用List就太慢了
	
	执行用时：10 ms, 在所有 Java 提交中击败了12.59%的用户
	内存消耗：39.1 MB, 在所有 Java 提交中击败了55.21%的用户
	*/
	public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                list.add(nums[i+1]);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}