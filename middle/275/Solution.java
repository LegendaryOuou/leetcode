class Solution {
	/*
	这不是昨天周赛第二题的变化版本吗，简单了一点
	note:傻子一样，下次看到有序直接二分行不行？？
	
	执行用时：1 ms, 在所有 Java 提交中击败了29.19%的用户
	内存消耗：45.5 MB, 在所有 Java 提交中击败了15.21%的用户
	*/
    public int hIndex(int[] citations) {
        int len = citations.length;
        for(int i=0;i<len;i++){
            if(citations[i]>=len-i){
                return len-i;
            }
        }
        return 0;
    }
	/*
	二分法
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：45.2 MB, 在所有 Java 提交中击败了63.62%的用户
	*/
	public int hIndex(int[] citations) {
        int len = citations.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(citations[mid]==len-mid) return len-mid;
            else if(citations[mid]>len-mid) high=mid-1;
            else low=mid+1;
        }
        return len-low;
    }
}