class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long y=0;
		int x_=x;
		while(x!=0) {
			y=y*10+x%10;
			x=x/10;
		}
		if(x_==y) return true;
		else return false;
    }
}