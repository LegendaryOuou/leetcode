/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
	/*
	一个简单的二分
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：34.9 MB, 在所有 Java 提交中击败了91.11%的用户
	*/
    public int guessNumber(int n) {
        int low=1,high=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            int res=guess(mid);
            if(res==-1) high=mid;
            else if(res==1) low=mid+1;
            else return mid;
        }
        return 0;
    }
}