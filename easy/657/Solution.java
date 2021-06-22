class Solution {
	/*
	执行用时：5 ms, 在所有 Java 提交中击败了95.88%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了86.44%的用户
	*/
    public boolean judgeCircle(String moves) {
        int[] steps = new int[2];
        for(char ch:moves.toCharArray()){
            if(ch=='U') steps[0]++;
            else if(ch=='D') steps[0]--;
            else if(ch=='L') steps[1]--;
            else steps[1]++;
        }
        return steps[0]==0&&steps[1]==0;
    }
}