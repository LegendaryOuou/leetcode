package com.leetcode;

/*
上去就是干，不过就是太慢

执行用时：188 ms, 在所有 Java 提交中击败了5.01%的用户
内存消耗：40 MB, 在所有 Java 提交中击败了82.25%的用户
class MinStack {
    private List<Integer> list = new ArrayList<>();
    private List<Integer> minValueList = new ArrayList<>();
    public MinStack() {

    }

    public void push(int val) {
        list.add(val);
        int len = minValueList.size();
        for(int i=0;i<minValueList.size();i++){
            if(minValueList.get(i)>val){
                minValueList.add(i,val);
                break;
            }
        }
        if(len==minValueList.size()){
            minValueList.add(len>0?len:0,val);
        }
    }

    public void pop() {
        int res = list.remove(list.size()-1);
        minValueList.remove(Integer.valueOf(res));
    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        return this.minValueList.get(0);
    }
}
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


/*
官方题解，我觉得这个比较好的一点最小值的维护方法
 */
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}