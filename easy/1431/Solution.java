class Solution {
	/*
	两次遍历就好了
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.96%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了94.48%的用户
	*/
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();
        int max = -1;
        for(int item : candies){
            if(item>max) max=item;
        }
        for(int item : candies){
            if(item+extraCandies<max) list.add(false);
            else list.add(true);
        }
        return list;
    }
}