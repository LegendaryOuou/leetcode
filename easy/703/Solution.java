class KthLargest {
	/*
	日常超时
	*/
    List<Integer> list;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.list = new LinkedList<>();
        for(int num:nums){
            int point=this.list.size();
            for(int i=0;i<this.list.size();i++){
                if(num>=this.list.get(i)){
                    point=i;
                    break;
                }
            }
            this.list.add(point,num);
        }
    }
    
    public int add(int val) {
        int point=this.list.size();
        for(int i=0;i<this.list.size();i++){
            if(val>=this.list.get(i)){
                point=i;
                break;
            }
        }
        this.list.add(point,val);
        return this.list.get(this.k-1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */