class Solution {
	/*
	思路没有问题，超时了
	*/
    public int lastRemaining(int n, int m) {
        int[] arr = new int[n];
        int index=0;
        int count=0;
        while(count<n-1){
            for(int i=0;i<m-1;i++){
                if(arr[index]!=0)i--;
                index=(index+1)%n;
            }
            while(arr[index]!=0)index=(index+1)%n;
            arr[index]=1;
            count++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0) return i;
        }
        return 0;
    }
}