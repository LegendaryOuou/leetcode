/*
LinkedList实现：
执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：36.1 MB, 在所有 Java 提交中击败了76.11%的用户

ArrayList实现：
执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：36 MB, 在所有 Java 提交中击败了89.49%的用户
 */
class MyStack {

    private List<Integer> stack = new LinkedList<>();
    private int size=0;

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        stack.add(x);
        this.size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(size>0){
            this.size--;
            return stack.remove(this.size);
        }
        return -1;
    }

    /** Get the top element. */
    public int top() {
        if(size>0)
            return stack.get(size-1);
        return -1;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.size==0?true:false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */