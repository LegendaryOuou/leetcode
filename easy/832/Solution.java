class Solution {
	/*
	遍历每行，每列遍历首尾对应元素相加，如果结果等于0或2，二者都反转，否则跳过
	特别的，如果每行有奇数列，那么中间的元素值只需要反转一次就行
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：38.5 MB, 在所有 Java 提交中击败了90.22%的用户
	*/
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        int mid = (len+1)/2;
        for(int i=0;i<len;i++){
            for(int j=0;j<mid;j++){
                int sum = image[i][j]+image[i][len-1-j];
                if(sum==0||sum==2){
                    image[i][j]=1-image[i][j];
                    if(j!=len-1-j)
                        image[i][len-1-j]=1-image[i][len-1-j];
                }
            }
        }
        return image;
    }
}