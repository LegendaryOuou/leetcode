class Solution {
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了67.54%的用户
	内存消耗：37.5 MB, 在所有 Java 提交中击败了87.29%的用户
	*/
    public boolean isCovered(int[][] ranges, int left, int right) {
        int len = ranges.length;
        Arrays.sort(ranges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < len; i++) {
            if(ranges[i][0]<=left&&right<=ranges[i][1]) {
                return true;
            }else {
                if(left>=ranges[i][0]&&left<=ranges[i][1]) left=ranges[i][1]+1;
                else if(left<ranges[i][0]) return false;
            }
        }
        return left-1>=right;
    }
}