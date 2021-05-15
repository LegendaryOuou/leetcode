class Solution {
	/*
	直接干！！
	
	执行用时：1 ms, 在所有 Java 提交中击败了99.73%的用户
	内存消耗：35.1 MB, 在所有 Java 提交中击败了95.14%的用户
	*/
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int num=n;
        int sum=0;
        while(num!=1){
            if(set.contains(num)) return false;
            set.add(num);
            while(num!=0){
                sum+=(num%10)*(num%10);
                num/=10;
            }
            num=sum;
            sum=0;
        }
        return true;
    }
}