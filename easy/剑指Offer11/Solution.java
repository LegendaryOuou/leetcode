class Solution {
	/*
	遍历一下就好了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了76.70%的用户
	*/
    public int minArray(int[] numbers) {
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<numbers[0]) return numbers[i];
        }
        return numbers[0];
    }
}