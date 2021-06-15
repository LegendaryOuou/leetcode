class Solution {
	/*
	思路应该没啥问题，但是超时了
	*/
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count=1;
        boolean isPrimes;
        for(int i=3;i<n;i++){
            int j;
            isPrimes=true;
            for(j=2;j<Math.sqrt(i+1);j++){
                if(i%j==0) {
                    isPrimes=false;
                    break;
                }
            }
            if(isPrimes) count+=1;
        }
        return count;
    }
	/*
	小改一下，还是超时
	*/
	public int countPrimes(int n) {
        if(n<=2) return 0;
        List<Integer> list = new LinkedList<>();
        list.add(2);
        boolean isPrimes;
        for(int i=3;i<n;i++){
            isPrimes=true;
            for(int j=0;j<list.size();j++){
                if(i%list.get(j)==0) {
                    isPrimes=false;
                    break;
                }
            }
            if(isPrimes) list.add(i);
        }
        return list.size();
    }
}