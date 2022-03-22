package test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author : xutinghao
 * @date : 2022/3/22 17:36
 * @description :
 */
public class MinStack {

    private LinkedList<Integer> list = null;
    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
    }

    /**
     * 推入
     * @param x
     */
    public void push(int x) {
        list.push(x);
    }

    /**
     * 弹出
     */
    public void pop() {
        list.pop();
    }

    public int top() {
        return list.getFirst();
    }

    public int min() {
        return list.stream().min(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.min();
        System.out.println("min===="+min);
        minStack.pop();
        int top = minStack.top();
        System.out.println("top===="+top);
        int min1 = minStack.min();
        System.out.println("min1===="+min1);
    }
}


class MinStack1 {
    private Stack<Integer> dataStack; // 数据栈
    private Stack<Integer> minStack; // 辅助栈，记录每次有元素进栈后或者出栈后，元素的最小值
    /** initialize your data structure here. */
    public MinStack1() {
        // 初始化辅助栈和数据栈
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x) {
        // 如果记录当前数据栈中最小值的辅助栈为空，或者最小值小于 x，则将 x 设置为最小值，即进辅助栈
        dataStack.push(x);
        if(minStack.empty() || minStack.peek() >= x){
            minStack.push(x);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
