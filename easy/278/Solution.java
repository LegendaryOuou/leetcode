/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
	/*
	二分怎么还超时？？
	*/
    public int firstBadVersion(int n) {
        int low=1,high=n;
        while(low<high){
            int mid=(low+high)/2;
            if(isBadVersion(mid)==false) low=mid+1;
            else high=mid-1;
        }
        return isBadVersion(low)==true?low:low+1;
    }
	/*
	原来这里求mid不要用(low+high)/2,一是因为可能会溢出，2是因为大数除法不好算
	应该用low+(high-low)/2
	另外还有要注意的地方是，对于二分中while(low<=high)的情况，应该是low=mid+1;high=mid-1;
	而对于while(low<high)的情况，最好是low=mid+1;high=mid; 最后直接返回low即可
	
	执行用时：16 ms, 在所有 Java 提交中击败了99.51%的用户
	内存消耗：35.2 MB, 在所有 Java 提交中击败了39.26%的用户
	*/
	public int firstBadVersion(int n) {
        int low=1,high=n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)==false) low=mid+1;
            else high=mid;
        }
        return low;
    }
	/*
	我发现这样平均耗费会更好一点
	
	执行用时：16 ms, 在所有 Java 提交中击败了99.51%的用户
	内存消耗：34.9 MB, 在所有 Java 提交中击败了91.26%的用户
	*/
	public int firstBadVersion(int n) {
        int low=1,high=n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)==false) low=mid+1;
            else high=mid-1;
        }
        return isBadVersion(low)?low:low+1;
    }
}