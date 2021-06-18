class Solution {
	/*
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.6 MB, 在所有 Java 提交中击败了77.57%的用户
	*/
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.max(rec1[0],rec2[0])<Math.min(rec1[2],rec2[2])&&Math.max(rec1[1],rec2[1])<Math.min(rec1[3],rec2[3]);
    }
}