class CQueue {
	/*
	应该是没啥问题的，但是上来就超内存了
	*/
    private List<Integer> list1;
    private List<Integer> list2;
    public CQueue() {
        list1 = new LinkedList<>();
        list2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        list1.add(value);
    }

    public int deleteHead() {
        if(list1.size()<1) return -1;
        while(list1.size()>1){
            list2.add(list1.get(list1.size()-1));
        }
        int res = list1.get(0);
        list1.clear();
        while(list2.size()>0){
            list1.add(list2.get(list2.size()-1));
        }
        return res;
    }
	/*
	这个没有问题，但是怎么还是这么慢啊，不会有人直接用一个队列实现的吧？？？
	
	执行用时：74 ms, 在所有 Java 提交中击败了19.14%的用户
	内存消耗：47.6 MB, 在所有 Java 提交中击败了5.23%的用户
	*/
	int[] arr1;
    int[] arr2;
    int index=0;
    public CQueue() {
        arr1 = new int[10000];
        arr2 = new int[10000];
    }

    public void appendTail(int value) {
        arr1[index++]=value;
    }

    public int deleteHead() {
        if(index<1) return -1;
        int len = index;
        for(int i=index-1;i>0;i--){
            arr2[i-1]=arr1[i];
        }
        index--;
        int res = arr1[0];
        for(int i=index-1;i>=0;i--){
            arr1[i]=arr2[i];
        }
        return res;
    }
	/*
	果然真有人这样干
	
	执行用时：49 ms, 在所有 Java 提交中击败了99.80%的用户
	内存消耗：46.1 MB, 在所有 Java 提交中击败了97.72%的用户
	*/
	int[] arr;
    int head=0,tail=0;
    public CQueue() {
        arr = new int[10000];
    }

    public void appendTail(int value) {
        arr[tail++]=value;
    }

    public int deleteHead() {
        if(head==tail) return -1;
        return arr[head++];
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */