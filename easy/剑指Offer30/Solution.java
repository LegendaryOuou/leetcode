class MinStack {
	/*
	内存开销太大了
	
	执行用时：21 ms, 在所有 Java 提交中击败了99.30%的用户
	内存消耗：40.9 MB, 在所有 Java 提交中击败了5.11%的用户
	*/
    int[] stack;
    int[] minIndex;
    int head=0;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new int[20000];
        minIndex=new int[20000];
    }
    
    public void push(int x) {
        if(head==0) minIndex[head]=head;
        else{
            if(x<stack[minIndex[head-1]]) minIndex[head]=head;
            else minIndex[head]=minIndex[head-1];
        }
        stack[head++]=x;

    }
    
    public void pop() {
        head--;
    }
    
    public int top() {
        return stack[head-1];
    }
    
    public int min() {
        return stack[minIndex[head-1]];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
 class MinStack {
	/*
	List实现，比纯数组实现开销要小一点
	
	执行用时：23 ms, 在所有 Java 提交中击败了69.23%的用户
	内存消耗：39.9 MB, 在所有 Java 提交中击败了96.45%的用户
	*/
    List<Integer> stack;
    List<Integer> minIndex;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new LinkedList<>();
        minIndex=new LinkedList<>();
    }

    public void push(int x) {
        if(minIndex.size()==0) minIndex.add(0);
        else {
            if (x < stack.get(minIndex.get(minIndex.size() - 1))) minIndex.add(minIndex.size());
            else minIndex.add(minIndex.get(minIndex.size() - 1));
        }
        stack.add(x);
    }

    public void pop() {
        stack.remove(stack.size()-1);
        minIndex.remove(minIndex.size()-1);
    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int min() {
        return stack.get(minIndex.get(minIndex.size()-1));
    }
}