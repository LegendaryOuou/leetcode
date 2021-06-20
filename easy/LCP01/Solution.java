class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.5 MB, 在所有 Java 提交中击败了78.13%的用户
	*/
    public int game(int[] guess, int[] answer) {
        return (guess[0]==answer[0]?1:0)+(guess[1]==answer[1]?1:0)+(guess[2]==answer[2]?1:0);
    }
}