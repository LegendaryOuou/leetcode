class NumArray {
	/*
	怎么这么慢
	
	执行用时：80 ms, 在所有 Java 提交中击败了19.63%的用户
	内存消耗：41.2 MB, 在所有 Java 提交中击败了72.14%的用户
	*/
    int[] arr;
    public NumArray(int[] nums) {
        this.arr = nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=this.arr[i];
        }
        return sum;
    }
	
	/*
	果然是前缀法
	
	执行用时：10 ms, 在所有 Java 提交中击败了80.57%的用户
	内存消耗：41.4 MB, 在所有 Java 提交中击败了54.24%的用户
	*/
	int[] arr;
    public NumArray(int[] nums) {
        this.arr = nums;
        for(int i=1;i<this.arr.length;i++){
            this.arr[i]+=this.arr[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return this.arr[right];
        return this.arr[right]-this.arr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */