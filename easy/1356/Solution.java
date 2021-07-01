class Solution {
	/*
	执行用时：33 ms, 在所有 Java 提交中击败了7.96%的用户
	内存消耗：38.2 MB, 在所有 Java 提交中击败了99.76%的用户
	*/
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int point;
        for (int i = 0; i < len-1; i++) {
            point=i;
            for (int j = i+1; j < len; j++) {
                int c1=Integer.bitCount(arr[point]);
                int c2=Integer.bitCount(arr[j]);
                if(c1>c2||(c1==c2&&arr[point]>arr[j])) point=j;
            }
            int t=arr[point];
            arr[point]=arr[i];
            arr[i]=t;
        }
        return arr;
    }
	/*
	快了一倍
	
	执行用时：16 ms, 在所有 Java 提交中击败了19.83%的用户
	内存消耗：38.3 MB, 在所有 Java 提交中击败了97.80%的用户
	*/
	public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[] indexArr=new int[len];
        int[] bitCountArr = new int[len];
        for (int i = 0; i < len; i++) {
            indexArr[i]=i;
            bitCountArr[i]=Integer.bitCount(arr[i]);
        }
        int point;
        for (int i = 0; i < len-1; i++) {
            point=i;
            for (int j = i+1; j < len; j++) {
                int c1=bitCountArr[indexArr[point]];
                int c2=bitCountArr[indexArr[j]];
                if(c1>c2||(c1==c2&&arr[indexArr[point]]>arr[indexArr[j]])) point=j;
            }
            int t=indexArr[point];
            indexArr[point]=indexArr[i];
            indexArr[i]=t;
        }
        for (int i = 0; i < len; i++) {
            bitCountArr[i]=arr[indexArr[i]];
        }
        return bitCountArr;
    }
}