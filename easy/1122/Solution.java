class Solution {
	/*
	暴力
	
	执行用时：2 ms, 在所有 Java 提交中击败了53.20%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了82.44%的用户
	*/
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1=arr1.length;
        int len2=arr2.length;
        int[] res = new int[len1];
        int index=0;
        for(int i=0;i<len2;i++){
            for(int j=0;j<len1;j++){
                if(arr1[j]==arr2[i]) res[index++]=arr1[j];
            }
        }
        int len = index;
        for(int i=0;i<len1;i++){
            boolean falg=false;
            for(int j=0;j<len2;j++){
                if(arr1[i]==arr2[j]){
                    falg=true;
                    break;
                }
            }
            if(falg==false){
                res[index++]=arr1[i];
            }
        }
        int point;
        for(int i=len;i<len1;i++){
            point=i;
            for(int j=i+1;j<len1;j++){
                if(res[j]<res[point]) point=j;
            }
            int t=res[i];
            res[i]=res[point];
            res[point]=t;
        }
        return res;
    }
}