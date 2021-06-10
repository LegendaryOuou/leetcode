class MyQueue {
	/*
	偷懒了
	
	执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
	内存消耗：35.9 MB, 在所有 Java 提交中击败了98.05%的用户
	*/
    int[] queue;
    int head,tail;
    /** Initialize your data structure here. */
    public MyQueue() {
        queue=new int[100];
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        queue[tail++]=x;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue[head++];
    }
    
    /** Get the front element. */
    public int peek() {
        return queue[head];
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return head==tail;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */