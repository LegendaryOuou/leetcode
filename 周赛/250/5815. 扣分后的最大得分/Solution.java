class Solution {
	/*
	用前缀表啊，但是不知道为什么157个测试样例只能通过154个，第155个过不去，很奇怪
	另外，知识点：力扣题的测试样例在比赛期间不给看。我猜可能是担心参赛者面向结果编程
	
	
	*/
    public long maxPoints(int[][] points) {
        int m=points.length,n=points[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int max=0;
                for (int k = 0; k < n; k++) {
                    max=Math.max(max,points[i][j]+points[i-1][k]-Math.abs(j-k));
                }
                points[i][j]=max;
            }
        }
        int max=0;
        for (int i = 0; i < n; i++) {
            max=Math.max(max,points[m-1][i]);
        }
        return max;
    }
}