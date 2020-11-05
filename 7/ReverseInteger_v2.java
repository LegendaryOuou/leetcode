class Solution {
    public int reverse(int x) {
        long result=0;
        while(x!=0){
            result=result*10+x%10;
            x=x/10;
        }
        if(result>=-2147483648&&result<=2147483647)return (int)result;
        else return 0;
    }
}