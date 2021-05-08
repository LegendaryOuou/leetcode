bool isPalindrome(int x){
    if(x<0) return false;
    int x1=x;
    long x_=0;
    while(x1>0){
        x_ = x_*10+x1%10;
        x1 = x1/10;
    }
    if(x==x_) return true;
    else return false;
}