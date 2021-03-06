class Solution {
	//方法1
    public int reverse(int x) {
        long top=1;
        long bottom=0;
        long result=0;
        while(bottom++<31) top*=2;
        bottom=-top;
        top=top-1;
        while(x!=0){
            result=result*10+x%10;
            x=x/10;
        }
        if(result>=bottom&&result<=top)return (int)result;
        else return 0;
    }
	/*
	//方法2
	public int reverse(int x) {
        long result=0;
        while(x!=0){
            result=result*10+x%10;
            x=x/10;
        }
        if(result>=-2147483648&&result<=2147483647)return (int)result;
        else return 0;
    }
	*/
}