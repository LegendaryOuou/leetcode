class Solution {
	/*
	执行用时：163 ms, 在所有 Java 提交中击败了22.37%的用户
	内存消耗：39.7 MB, 在所有 Java 提交中击败了36.45%的用户
	*/
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if(len==1) {
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<len;i++){
            int max=-1;
            for(int j=i+1;j<len;j++){
                max=Math.max(arr[j],max);
            }
            arr[i]=max;
        }
        arr[len-1]=-1;
        return arr;
    }
	/*
	执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：39.7 MB, 在所有 Java 提交中击败了43.55%的用户
	*/
	public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if(len==1) {
            arr[0]=-1;
            return arr;
        }
        int max=-1;
        for(int i=0;i<len;i++){
            if(max<=arr[i]){
                max=-1;
                for(int j=i+1;j<len;j++){
                    max=Math.max(arr[j],max);
                }
            }
            arr[i]=max;
        }
        arr[len-1]=-1;
        return arr;
    }
}