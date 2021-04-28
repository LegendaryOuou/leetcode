class Solution {
    /*
    思路同88题：合并两个有序数组

    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.6 MB, 在所有 Java 提交中击败了86.92%的用户
     */
    public static void merge(int[] A, int m, int[] B, int n) {
        int point=m+n-1;
        for(int i=m-1,j=n-1;;){
            if(j<0)return;
            else if(i<0){
                while(j>=0)A[point--]=B[j--];
            }
            else if(A[i]<B[j]) {
                A[point]=B[j--];
            }
            else{
                A[point]=A[i--];
            }
            point--;
        }
    }

    public static void main(String[] args) {
        int[] A={1,2,3,0,0,0};
        int[] B={2,5,6};
        merge(A,3,B,3);
    }
}