class Solution {
	/*
	
	执行用时：1 ms, 在所有 Java 提交中击败了94.96%的用户
	内存消耗：37.8 MB, 在所有 Java 提交中击败了90.89%的用户
	*/
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=0;i<points.length-1;i++){
            time+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
        }
        return time;
    }
}